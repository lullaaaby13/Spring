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

<form action="getText.do">
  <textarea name="textForm" id="editor1" rows="10" cols="80">
                This is my textarea to be replaced with CKEditor.
  </textarea>
            
            
  <button type="submit" class="btn btn-primary">Submit</button>
</form>


<div id="result" style="border:1px solid gray;">


</div>



 
</div>

<script>
CKEDITOR.replace( 'editor1' );


$(document).ready(function({
	alert('kk');
}))


</script>


</body>
</html>
