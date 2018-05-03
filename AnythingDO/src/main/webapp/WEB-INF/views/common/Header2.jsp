<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>



<c:set var="CTX" value="${pageContext.request.contextPath}" />

<!-- J Query -->
<script src="${CTX}/resources/js/jQuery/jquery-3.3.1.js"></script>

<!-- Font -->
<link href="https://fonts.googleapis.com/css?family=Montserrat:400,700,200" rel="stylesheet">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css">

<!-- CSS -->
<link rel="stylesheet" href="${CTX}/resources/assets/css/bootstrap.min.css" type="text/css">
<link rel="stylesheet" href="${CTX}/resources/assets/css/now-ui-kit.css" type="text/css">


<!-- CK Editor 4 -->
<script src="${CTX}/resources/ckeditor/ckeditor.js"></script>

<style>

@font-face {
	font-family: 'NanumGothicCoding';
	src: url("/resources/font/NanumGothicCoding.ttf");
}


</style>