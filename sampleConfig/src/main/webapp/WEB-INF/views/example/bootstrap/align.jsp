<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>


<html>
<head>
	<title>Home</title>
	<%@ include file="/WEB-INF/views/common/Header.jsp" %>
	<style>
		.myItem{
			background-color: rgba(86,61,124,.15);
    		border: 1px solid rgba(86,61,124,.2);
    		height:35px;
    		padding-top:5px;
    		padding-bottom:5px;
		}
	
	</style>
</head>
<body>

<div class="container">
  <!-- Content here -->
  <h1>수직 정렬 1</h1>
<div class="container">
  <div class="row align-items-start">
    <div class="myItem col">
      One of three columns
    </div>
    <div class="myItem col">
      One of three columns
    </div>
    <div class="myItem col">
      One of three columns
    </div>
  </div>
  <div class="row align-items-center">
    <div class="myItem col">
      One of three columns
    </div>
    <div class="myItem col">
      One of three columns
    </div>
    <div class="myItem col">
      One of three columns
    </div>
  </div>
  <div class="row align-items-end">
    <div class="myItem col">
      One of three columns
    </div>
    <div class="myItem col">
      One of three columns
    </div>
    <div class="myItem col">
      One of three columns
    </div>
  </div>
</div>
  
  
  <h1>수직 정렬 2</h1>
  <div class="container" >
  <div class="row justify-content-start">
    <div class="myItem col-4">
      One of two columns
    </div>
    <div class="myItem col-4">
      One of two columns
    </div>
  </div>
  <div class="row justify-content-center">
    <div class="myItem col-4">
      One of two columns
    </div>
    <div class="myItem col-4">
      One of two columns
    </div>
  </div>
  <div class="row justify-content-end">
    <div class="myItem col-4">
      One of two columns
    </div>
    <div class="myItem col-4">
      One of two columns
    </div>
  </div>
  <div class="row justify-content-around">
    <div class="myItem col-4">
      One of two columns
    </div>
    <div class="myItem col-4">
      One of two columns
    </div>
  </div>
  <div class="row justify-content-between">
    <div class="myItem col-4">
      One of two columns
    </div>
    <div class="myItem col-4">
      One of two columns
    </div>
  </div>
</div>

<h1>수평 정렬 1</h1>
<div class="container">
  <div class="row justify-content-start">
    <div class="myItem col-4">
      One of two columns
    </div>
    <div class="myItem col-4">
      One of two columns
    </div>
  </div>
  <div class="row justify-content-center">
    <div class="myItem col-4">
      One of two columns
    </div>
    <div class="myItem col-4">
      One of two columns
    </div>
  </div>
  <div class="row justify-content-end">
    <div class="myItem col-4">
      One of two columns
    </div>
    <div class="myItem col-4">
      One of two columns
    </div>
  </div>
  <div class="row justify-content-around">
    <div class="myItem col-4">
      One of two columns
    </div>
    <div class="myItem col-4">
      One of two columns
    </div>
  </div>
  <div class="row justify-content-between">
    <div class="myItem col-4">
      One of two columns
    </div>
    <div class="myItem col-4">
      One of two columns
    </div>
  </div>
</div>


  
 
 <div class="container">
 <h1>Column breaks</h1>
 <p>Breaking columns to a new line in flexbox requires a small hack: add an element with width: 100% wherever you want to wrap your columns to a new line. Normally this is accomplished with multiple .rows, but not every implementation method can account for this.</p>
 	<div class="row">
  <div class="myItem col-6 col-sm-3">.col-6 .col-sm-3</div>
  <div class="myItem col-6 col-sm-3">.col-6 .col-sm-3</div>

  <!-- Force next columns to break to new line -->
  <div class="w-100"></div>

  <div class="myItem col-6 col-sm-3">.col-6 .col-sm-3</div>
  <div class="myItem col-6 col-sm-3">.col-6 .col-sm-3</div>
	</div>
 	
 
 </div>
 
  
 
  
</div><!-- End of Container -->

<script>

$(document).ready(function(){
	
	
})

</script>

</body>
</html>
