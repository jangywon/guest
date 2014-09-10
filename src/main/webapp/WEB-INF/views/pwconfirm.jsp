<%@page import="com.nhnent.guestbook.vo.GuestbookVO"%>
<%@ page session="false"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<script type="text/javascript" src="resources/js/jquery-2.1.1.min.js"></script>
<script type="text/javascript" src="resources/js/pwconfirm.js"></script>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>게시글 삭제</title>
</head>
<body>
	게시글의 비밀번호를 입력하세요
	<input type="password" id="password">  
	<input type="button" id="confirmBtn" onclick = "passValue()" value="확인">
</body>
</html>