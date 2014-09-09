<%@page import="com.nhnent.guestbook.vo.GuestbookVO"%>
<%@ page session="false"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<link rel="stylesheet" type="text/css" href="resources/css/home.css" />
<title>Guestbook</title>
</head>
<body>
	<aside></aside>
	<nav></nav>
	<div id="container">
	<h1>GuestBook</h1>
	<P>NHN Entertainment > B-flat > Guestbook </P>
	<div style=" min-width : 100%; text-align:right">
	<input type = "button" value = "write" >
	</div>
		<ul class="guestbookBucket">
			<hr>
			<c:forEach var="GuestbookVO" items="${allData}">
				<li class="guestbookListLi" id="guestbook${GuestbookVO.id}"
					onclick=""><b style="font-size: 1em;">
						글쓴이 : ${GuestbookVO.writerName} </b>
						<br>
						내용 : ${GuestbookVO.contents}
						 <input type="button" value="delete"
					onclick=" if(confirm('정말 삭제하시겠습니까?')) removeReceivedIcecream(${surveyVO.surveyId}); else preventEvent(event);"
					class="removeRecevedIcecreamBtn"
					style="padding: 5px; border: 0px; display: none;"></li>
			</c:forEach>
			<hr>
		</ul>
	</div>
</body>
</html>
