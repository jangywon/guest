var targetId;

function passValue() {
	var returnValue = $("#password").val();
	var sendValue = {
		"id" : targetId,
		"writerPassword" : returnValue
	}

	var sendData = JSON.stringify(sendValue);
	sendData.replace(/<script>/gi, " ");

	$.ajax({
		type : "POST",
		url : "/ChkPw",
		contentType : "application/json;charset=UTF-8",
		data : sendData,
		dataType : "json",
		success : function(data) {
			console.log("success!");
			if (data.message == "success") {
				window.opener.location.reload();
				alert("삭제 성공");
				window.close();
			} else {
				alert("비밀번호가 맞지 않습니다. 다시 입력해주세요");
			}
		},
		error : function(data) {
			console.log("error");
			console.log(data);
		}
	});
}
