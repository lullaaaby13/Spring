<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>


<html>
<head>
	<title>Home</title>
	<%@ include file="/WEB-INF/views/common/Header.jsp" %>
</head>
<body>

<div class="container">

<h1>Sample Template</h1>






</div>

<script>
$(document).ready(function(){
	
	$.ajax({
		url:'${CTX}/example/test',
		success:function(response){
			console.log(response.result);
		}
			
	});
	
	
	
	
})



</script>


</body>
</html>
