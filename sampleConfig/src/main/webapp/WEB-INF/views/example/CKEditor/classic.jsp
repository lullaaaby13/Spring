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
<h1>CK Editor - Classic</h1>

 <textarea name="editor1" id="editor1" rows="10" cols="80">
                This is my textarea to be replaced with CKEditor.
 </textarea>
 <br/>
<button id="btnSend" type="button" class="btn btn-primary">Send</button>

<br/>
<br/>

<div class="card">
  <div id="result" class="card-body">
    This is some text within a card body.
  </div>
</div>



<br/><br/><br/>
<small>https://ckeditor.com/ckeditor-4/#article</small>
</div>

<script>
CKEDITOR.replace( 'editor1' );

$(document).ready(function(){
	$("#btnSend").on('click', function(){
		var data = CKEDITOR.instances.editor1.getData();
		console.log(data);
		$("#result").html(data);
	})
	
})


</script>




</body>
</html>
