<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@page import="java.sql.*,java.util.*"%>
<%
String name=request.getParameter("name");
String ctc=request.getParameter("ctc");
String skill=request.getParameter("skill");
String domain=request.getParameter("domain");
String location=request.getParameter("location");
        try{
         Class.forName("com.mysql.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/webformdb", "root", "root");
           Statement st=con.createStatement();
           int i=st.executeUpdate("insert into empwb(name,ctc,skill,domain,location) values('"+name+"','"+ctc+"','"+skill+"','"+domain+"','"+location+"')");
        out.println("Data is successfully inserted!");
        }
        catch(Exception e){
        System.out.print(e);
        e.printStackTrace();
        }
        %>
<%
out.print("Record added Successfully");
%>
</body>
</html>