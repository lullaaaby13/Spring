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
  <!-- Content here -->
<h1>공공 데이터 로딩</h1>
 
 <br/>
 
 <button type="button" class="btn btn-success">GET DATA</button>
 
 <div id="dataArea"></div>
 
 
 </div>
 
 <script type="text/javascript">
 
 $(document).ready(function(){
	 
	 $.ajax({
		 type: 'GET',
		 url: '/apple/example/Ajax/getPublicData',
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
