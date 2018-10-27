<%@page import="impl.BookDAOImpl"%>
<%@page import="test.*" %>
<%@page import="java.util.*"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.Url"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>rain图书馆</title>
<style type="text/css">
body {  padding-top: 8%; padding-bottom: 8%;font-family:"幼圆";} 
</style>
</head>
<body>

<%@include file="header.jsp" %>
<%
BookDO a;
List<BookDO> b;
BookDAOImpl bookDAOImpl = new BookDAOImpl();
b = bookDAOImpl.listBook();
for(int c=0;c<b.size();c++){
	a = b.get(c);
	out.print("<center>书名："+a.getTitle()+"<br />"+"作者："+a.getAuthor()+"<br />"+"书ISBN："+a.getIsbn()+"</t>"+"<br /><br /><br /><br /></center>");

}
%>
<%@include file="foot.jsp" %>
</body>
</html>