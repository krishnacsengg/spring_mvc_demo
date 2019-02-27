
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<title>Customer Form</title>
</head>
<body>
<form:form action="saveCustomer" modelAttribute="customer" method="POST" style =" width: 50%;
    margin-top: 10%;
    margin-bottom: auto;
    margin-left: auto;
    margin-right: auto;
    border: 2px solid #a5a5ef;">
    
    <form:hidden path="id" />
  <div class="form-group">
    <label >First Name</label>
    <form:input path="firstName" class="form-control" placeholder="Enter first Name"/>
  </div>
  <div class="form-group">
    <label >Last Name</label>
    <form:input path="lastName" class="form-control" placeholder="Enter last Name"/>
  </div>  
  <div class="form-group">
    <label >Email address</label>
    <form:input path="email" class="form-control" placeholder="Enter email" aria-describedby="emailHelp"/>
   
  </div>
  
  <button type="submit" class="btn btn-primary">Submit</button>
</form:form>
</body>
</html>