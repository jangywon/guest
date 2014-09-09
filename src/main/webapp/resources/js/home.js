function popupSurvey(surveyId) {
	window
			.open(
					"/SurveyResponseResult?surveyId=" + surveyId,
					"NHN Entertainment - 설문 관리하기",
					"menubar=no,width=800,height=1000,toolbar=no, directories=no,location=no,resizable=no,status=no,scrollbars=yes");
}
function openNewWindow(url) {
	  var name = '_blank';
	  var specs = 'menubar=no,status=no,toolbar=no';
	  var newWindow = window.open(url, name, specs);
	  newWindow.focus();
	}

	function getReturnValue(returnValue) {
	  alert(returnValue);
	}

	$('#openNewWindowButton').click(function() {
	  openNewWindow('/popUpUrl');
	});