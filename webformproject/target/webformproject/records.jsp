<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"                                                    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
<title>Employee List</title>
</head>
<body>
	<div style="text-align: center;">
		<table class="table table-striped table-dark">
			<thead>
				<tr>
					<th scope="col">ID</th>
					<th scope="col">NAME</th>
					<th scope="col">CTC</th>
					<th scope="col">SKILL</th>
					<th scope="col">DOMAIN</th>
					<th scope="col">LOCATION</th>
				</tr>
			</thead>
			<%@page import="java.sql.*,java.util.*"%>
			<%
				try {
					Class.forName("com.mysql.jdbc.Driver");
					String url = "jdbc:mysql://localhost/webformdb";
					String username = "root";
					String password = "root";
					String query = "select * from empwb";
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/webformdb", "root", "root");
					PreparedStatement st = conn.prepareStatement("select * from empwb");
					ResultSet rs = st.executeQuery();
					while (rs.next()) {
			%>

			<tbody>
				<tr>
					<th scope="row">
						<%
							out.print(rs.getInt("id"));
						%>
					</th>
					<td>
						<%
							out.print(rs.getString("name"));
						%>
					</td>
					<td>
						<%
							out.print(rs.getFloat("ctc"));
						%>
					</td>
					<td>
						<%
							out.print(rs.getString("skill"));
						%>
					</td>
					<td>
						<%
							out.print(rs.getString("domain"));
						%>
					</td>
					<td>
						<%
							out.print(rs.getString("location"));
						%>
					</td>
				</tr>
			</tbody>
			<%
				}
			%>
		</table>
		<%
			rs.close();
				st.close();
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		%>

	</div>
</body>

</html>
