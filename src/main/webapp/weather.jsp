<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<!DOCTYPE html>
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>
$(document).ready(function(){
  $("button").click(function(){
    $.ajax({url: "http://data.ex.co.kr/openapi/restinfo/restWeatherList", success: function(result){
      $("#div1").html(result);
    }});
  });
});
</script>
</head>
<body>

<div id="div1"></div>

<button>Get External Content</button>
<p>
<iframe width="100%" src="http://data.ex.co.kr/openapi/restinfo/restWeatherList"></iframe>
</head>
<body>
</body>
</html>