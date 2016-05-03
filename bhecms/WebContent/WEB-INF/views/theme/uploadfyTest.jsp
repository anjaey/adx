<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<script type="text/javascript" src="<c:url value="/res/common/js/jquery/jquery-1.11.3.min.js"/>"></script>
<script type="text/javascript" src="<c:url value="/res/common/js/uploadify/jquery.uploadify.min.js"/>"></script>
<title>Insert title here</title>
</head>
<body>

	<input id="file_upload" name="imgurls" type="file" multiple="true">

	<script type="text/javascript">
		$(function() {
			$('#file_upload').uploadify({
				'fileObjName':"imgurls",
				'swf'      : '<c:url value="/res/common/js/uploadify/uploadify.swf"/>',
				'uploader' : '<c:url value="/ajaxUpload.htm"/>'
			});
		});
	</script>
</body>
</html>