function openPwConfirmWindow(articleId){
	  var name = '_blank';
	  var specs = 'menubar=no,status=no,toolbar=no';
	  var newWindow = window.open("/PwConfirm", name, specs);
	  newWindow.targetId  = articleId;
	  newWindow.focus();
}


