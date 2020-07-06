<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>支付宝电脑网站支付</title>
<script type="text/javascript" src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
<script type="text/javascript" src="https://static.runoob.com/assets/qrcode/qrcode.min.js"></script>
</head>
<body text=#000000 bgColor="#ffffff" leftMargin=0 topMargin=4>
	<button id="pay">pay</button>
	<div id="qrcode" style="width:100px; height:100px; margin-top:15px;"></div>
</body>
<script>
	var qrcode = new QRCode(document.getElementById("qrcode"), {
		width : 100,
		height : 100
	});
	$(document).ready(function(){
		$("#pay").click(function(){
			$.get("/pay",function(result){
				qrcode.makeCode(result);
			});
		});
	});

</script>
</html>