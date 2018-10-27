
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="../css/denglu.css" type="text/css">
<title>登陆</title>
<script type="text/javascript">
	function check() {
		var nameValue = window.document.getElementById("user_name").value;
		var paswd = window.document.getElementById("password").value;
		if (nameValue == "" || paswd == "") {
			window.alert("账户或密码不能为空!");
			return false;
		}
		return true;
	}
</script>


</head>
<body>
<div id="tupian" src="../denglu.jpg">
	<div id="wrapper" class="login-page">
		<div id="login_form" class="form">

			<form class="login-form" method="post" action="FindUser?leixing=denglu" onsubmit="return check()">
				<%
					//调用登录验证
				%>
				<input type="text" placeholder="用户名" name="userName" id="user_name" />
				<input type="password" placeholder="密码" name="userPwd" id="password" />
				<button id="login">登 录</button>
				<p class="message">
					还没有账户? <a href="zhuce.jsp">立刻创建</a>
				</p>
			</form>
		<!-- 	<a href="index.jsp"
				style="color: rgba(8, 210, 236, 0.87); font-size: 10px">返回首页</a> -->
		</div>
	</div>
	</div>
	<%-- <%@include file="foot.jsp"%> --%>

	 <script type="text/javascript">
var curIndex = 0;
//时间间隔(单位毫秒)，每秒钟显示一张，数组共有4张图片放在img文件夹下
var timeInterval = 3000;

                        //定义一个存放照片位置的数组，可以放任意个，在这里放3个
var arr = new Array();
arr[0] = "../img/denglu.jpg";
arr[1] = "../img/shu.jpg";
arr[2] = "../img/shu1.jpg";
arr[3] = "../img/shu2.jpg";
setInterval(changeImg, timeInterval);
function changeImg() {
if (curIndex == arr.length - 1) {
curIndex = 0;
} else {
curIndex += 1;
}

document.body.style.backgroundImage = "URL("+arr[curIndex]+")";  //显示对应的图片
}
</script>
</body>

</html>