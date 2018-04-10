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
  
<h1>Version :: 1</h1>

<br>
<br>
<br>

<form action="inputExample" method="get">
	<!-- 
		HomeController > inputExample
		전송 파라미터 이름 (<input>태그의 name값) > input1
			* <form>태그를 통한 전송 시 데이터는 input태그의 name값이 VO클래스의 멤버변수 이름과 같아야 한다.
	 -->
	<h2>Example1 - Form 태그 이용해 데이터 전송</h2>
	
	<div class="form-group">
    <label for="exampleInputEmail1">Input Value 1</label>
    <input id="input1" name="input1" type="input" class="form-control" placeholder="Enter text">
    <small class="form-text text-muted">Type the text you want to send.</small>
  </div>
  
  <div style="display:flex; justify-content:flex-end;">
  		<button type="submit" class="btn btn-primary">Submit</button>
  </div>
</form>





<hr style="color:black margin:10px;"><br>
<!-- 









 -->
<form action="saveImage" enctype="multipart/form-data" method="post">
	<!-- 
		서버에서 MultipartFile 클래스를 멤버로가지는 VO객체를 통해 데이터를 전달받음
		
		전송파라미터 이름 > imgFile
	 -->
	<h2>Example2 - Form 태그 이용해 파일 전송</h2>
	 
	<div class="form-group">
	    <label for="exampleFormControlFile1">Example file input</label>
	    <input type="file" class="form-control-file" id="imgFile" name="imgFile">
 	</div>
	
	<div style="display:flex; justify-content:flex-end;">
	  		<button type="submit" class="btn btn-primary">Submit</button>
	</div>
</form>


<hr style="color:black margin:10px;"><br>
<h2>Exmple3 - getImageFile</h2>

<img id="imageFile" src="getImage">





<hr style="color:black margin:10px;"><br>
<!-- 














 -->

<h2>Example4 - AJAX</h2>
<div class="input-group input-group-sm mb-3">
  <div class="input-group-prepend">
    <span class="input-group-text" id="inputGroup-sizing-sm">SQRT</span>
  </div>
  <input id="inputAjax"type="text" class="form-control" aria-label="Small" aria-describedby="inputGroup-sizing-sm">
</div>

<div class="input-group input-group-sm mb-3">
  <div class="input-group-prepend">
    <span class="input-group-text" id="inputGroup-sizing-sm">ANSWER</span>
  </div>
  <input id="answerAjax" type="text" class="form-control" aria-label="Small" aria-describedby="inputGroup-sizing-sm" readonly>
  
</div>


<div style="display:flex; justify-content:flex-end;">
	<button id="btnAjax" type="button" class="btn btn-primary">Submit</button>
</div>
<small class="text-muted">Simple Example - Sqrt of the number you write.</small>

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
