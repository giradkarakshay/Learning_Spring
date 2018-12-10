/**
 * 
 */
package com.yash.springwithhibernatemapping.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author akshay.giradkar
 *
 */

@EnableWebMvc
@Configuration
@ComponentScan({ "com.yash.springwithhibernatemapping.controller", "com.yash.springwithhibernatemapping.serviceimpl",
		"com.yash.springwithhibernatemapping.daoimpl" })
@PropertySource("classpath:database.properties")
public class SpringConfiguration {

	@Autowired
	private Environment environment;

	private final String URL = "url";
	private final String USER = "dbuser";
	private final String DRIVER = "driver";
	private final String PASSWORD = "dbpassword";

	public SpringConfiguration() {
		System.out.println("SpringConfiguration called....");
	}

	@Bean
	@Autowired
	public DataSource myDatasource() {
		DriverManagerDataSource driverManager = new DriverManagerDataSource();
		driverManager.setDriverClassName(environment.getProperty(DRIVER));
		driverManager.setUrl(environment.getProperty(URL));
		driverManager.setUsername(environment.getProperty(USER));
		driverManager.setPassword(environment.getProperty(PASSWORD));
		return driverManager;
	}

	@Bean
	@Autowired
	@Qualifier("myDatasource")
	public JdbcTemplate jdbcTemplate(DataSource datasource) {

		return new JdbcTemplate(datasource);
	}

	@Bean
	@Autowired
	@Qualifier("myDatasource")
	public LocalSessionFactoryBean sessionFactory() {
		LocalSessionFactoryBean sessionFactoryBean = new LocalSessionFactoryBean();
		sessionFactoryBean.setDataSource(myDatasource());
		sessionFactoryBean.setPackagesToScan(new String[] { "com.yash.springwithhibernate.model" });
		sessionFactoryBean.setHibernateProperties(hibernateProperties());
		return sessionFactoryBean;
	}

	public Properties hibernateProperties() {
		Properties properties = new Properties();
		properties.put("hibernate.dialect", environment.getProperty("hibernate.dialect"));
		properties.put("hibernate.show_sql", environment.getProperty("hibernate.show_sql"));
		properties.put("hibernate.format_sql", environment.getProperty("hibernate.format_sql"));
		properties.put("hibernate.hbm2ddl.auto", environment.getProperty("hibernate.hbm2ddl.auto"));
		return properties;
	}

	@Bean
	@Autowired
	@Qualifier("sessionFactory")
	public HibernateTransactionManager transactionManager(SessionFactory sessionFactory) {
		HibernateTransactionManager tx = new HibernateTransactionManager();
		tx.setSessionFactory(sessionFactory);
		return tx;
	}

}
