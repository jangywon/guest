<%@page import="com.nhnent.guestbook.vo.GuestbookVO"%>
<%@ page session="false"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<script type="text/javascript" src="resources/js/jquery-2.1.1.min.js"></script>
<script type="text/javascript" src="resources/js/jquery-ui.js"></script>
<script type="text/javascript" src="resources/js/home.js"></script>
<link rel="stylesheet" type="text/css" href="resources/css/home.css" />
<title>Guestbook</title>
</head>
<body>
	<aside></aside>
	<nav></nav>
	<div id="container">
		<h1>GuestBook</h1>
		<P>NHN Entertainment > B-flat > Guestbook</P>
		<hr>
		<div id="writeSection">
			방명록 쓰기<br>
			<form action="writeArticle" method="post">
				ID <input name="writerName" type="text" id="writer"
					placeholder="작성자 이름 입력"> <br> PW <input
					name="writerPassword" type="password" id="password" /> <br>
				내용 <br> <input name="contents" type="textarea"
					id="contentsInputArea" />
				<div style="min-width: 100%; text-align: right">
					<input type="submit" value="write">
				</div>
			</form>
		</div>
		<hr>
		<ul class="guestbookBucket">
			<c:forEach var="GuestbookVO" items="${allData}">
				<li class="guestbookListLi" id="guestbook${GuestbookVO.id}"
					onclick=""><b style="font-size: 1em;"> 글쓴이 :
						${GuestbookVO.writerName} </b> <br> 내용 : ${GuestbookVO.contents}
					<input type="button" value="삭제"
					onclick="openPwConfirmWindow(${GuestbookVO.id})"
					class="removeRecevedIcecreamBtn" style="padding: 5px; float:right; border: 0px;">
				</li>

			</c:forEach>
			<hr>
		</ul>
	</div>
</body>
</html>
