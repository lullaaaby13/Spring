<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>



<c:set var="CTX" value="${pageContext.request.contextPath}" />

<!-- J Query -->
<script src="${CTX}/resources/js/jQuery/jquery-3.3.1.js"></script>

<!-- BootStrap -->
<link rel="stylesheet" href="${CTX}/resources/css/Bootstrap/bootstrap.css" type="text/css">
<script src="${CTX}/resources/js/Bootstrap/bootstrap.js"></script>

<!-- CK Editor 4 -->
<script src="${CTX}/resources/ckeditor/ckeditor.js"></script>

<style>

@font-face {
	font-family: 'NanumGothicCoding';
	src: url("/citron/resources/font/NanumGothicCoding.ttf");
}


</style>