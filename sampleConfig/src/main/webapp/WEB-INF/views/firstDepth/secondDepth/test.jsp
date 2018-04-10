<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>


<html>
<head>
	<title>Home</title>
	<script src="//code.jquery.com/jquery-3.2.1.min.js"></script>
	
	<link rel="stylesheet" href="/apple/resources/css/bootstrap.css" type="text/css">
	<script src="/apple/resources/js/bootstrap.js"></script>
	<style>
		
	
	</style>
</head>
<body>

<div class="container">
  <!-- Content here -->
  
<h1>Test Page.</h1>

<script>

$(document).ready(function(){
	$("#btnAjax").on('click', function(){
		var data = {};
		data.testValue = $('#inputAjax').val();
		console.log(data);
		$.ajax({
			  url: "ajaxExample",
			  data : data
			}).done(function(response) {
				console.log("Server's Response", response);
				$('#answerAjax').val(response.answer);
				
			 
			});
	});
	
	
	$.ajax({
		  url: "getImage"
		}).done(function(response) {
			console.log("Server's Response", response);
			$("#imageFile").val(response.imgFile);
		 
		});
	
})

</script>

</body>
</html>
