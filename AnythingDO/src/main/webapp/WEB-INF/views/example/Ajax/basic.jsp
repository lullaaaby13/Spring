<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>


<html>
<head>
	<title>Exam - Basic</title>
	<%@ include file="/WEB-INF/views/common/Header.jsp" %>
</head>
<body>

<div class="container">
  <!-- Content here -->
	<h1>Basic Ajax Skills</h1>
	 
	 <br/>

 
 
</div>
 
 <script type="text/javascript">
 
 
 
 $(document).ready(function(){
	 var data = {
			word1 : 'Hello World',
			word2 : 'TestData',
			word3 : 'The Load of the Ring'
	 }
	 
	 $.ajax({
		 type: 'GET',
		 //dataType: 'JSON',
		 data: data,
		 url: '/apple/example/Ajax/getTestData',
		 flag: 'test',
		 success: successCallback,
		 error : failCallback
		 
	 })
	 
	 
	 
 })
 
 function successCallback(response, statusText, responseOrg, flag){
	 console.log('SuccessCallback. :: ', flag, + ' :: ', response);
	 
	 //User Code.
	 
	 
 }
 
 function failCallback(response, status, flag){
	 console.log('FailCallback. :: ', flag, ' :: ', response);
	 
	 //User Code.
 }
 
 
 
 </script>
</body>
</html>
