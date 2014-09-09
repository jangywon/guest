$('#returnButton').click(function() {
  var returnValue = {
    key1: 'value1',
    key2: 'value2',
    key3: 'value3'
  };
  window.opener.getReturnValue(JSON.stringify(returnValue));
  window.close();
});