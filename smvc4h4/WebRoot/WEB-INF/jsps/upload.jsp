<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="../js/jquery-1.7.1.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">

</script>
</head>
<body>
	<h>添加用户</h>
	<form name="userForm" action="/Smvc3h4/user/upload3" method="post" enctype="multipart/form-data" >
		选择文件：<input type="file" name="file">
		
		<input type="submit" value="上传" >
		
		
	
	</form>
	
	
	
</body>
</html>