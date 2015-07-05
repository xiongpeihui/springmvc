 
 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>




<body  >



	
 <table border="1" width="70%">
   	<tr>
   		<td>
   			<input type="checkbox" name="checkAll">
   		</td>
   		<td>id</td>
   		<td>name</td>
   		<td>password</td>
   		<td>删除</td>
   		<td>修改</td>
   	</tr>
   	<c:forEach items="${users}" var="u">
	   	<tr>
	   		<td><input type="checkbox" name="id" value="${u.userid}"></td>
	   		<td>${u.userid }</td>
	   		<td>${u.username }</td>
	   		<td>${u.userpassword}</td>
	   		
	   	</tr>
   	</c:forEach>
   </table>
</body>
</html>

 