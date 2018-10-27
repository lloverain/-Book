<%@page import="java.util.*"%>
<%@page import="test.Users"%>
<%@page import="test.Panduan"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
Users a;
List<Users> b;
Panduan panduan = new Panduan();
b=panduan.getuser();
for(int c=0;c<b.size();c++){
	a = b.get(c);
	out.print("账户："+a.getuserName()+"</t>"+"密码："+a.getuserPwd()+"<br />");

}
%>
</body>
</html>