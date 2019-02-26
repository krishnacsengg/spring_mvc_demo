<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<title>Customer Details</title>
</head>
<body>

<h2>Customer Details</h2>
<br>
<div class="addCustomer">

	
	<input type="button" value="Add Customer"
				   onclick="window.location.href='customerAddForm'; return false;"
				   class="btn btn-primary"
			/>

</div>
<br>
	<div id="container">
	
		<div id="content">
		
			<!--  add our html table here -->
		
			<table class="table table-striped" style = "width: 50%;
    border: 2px solid black;">
				<tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Email</th>
					<th></th>
				</tr>
				
				<!-- loop over and print our customers -->

				<c:forEach var="tempCustomer" items="${customers}">
				
					<tr>
						<td> ${tempCustomer.firstName} </td>
						<td> ${tempCustomer.lastName} </td>
						<td> ${tempCustomer.email} </td>
						<td><input type="button" value="Delete"
				   onclick="window.location.href='customerAddForm'; return false;"
				   class="btn btn-primary"
			/></td>
					</tr>
				
				</c:forEach>
						
			</table>
				
		</div>
	
	</div>
	
</body>
</html>