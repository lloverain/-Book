<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <link rel="stylesheet" type="text/css" href="../css/header.css">
<title>tou</title>
</head>
<body>
    <div class="tou">

        <div class="zhong">rain图书商店欢迎你</div>
        <div class="logo"><img src="../img/logo.png" width="100%" height="100%"></div>
        <form action="FindUser?leixing=sousuo" method="post" onsubmit="true">
        <div class="sousuo">
        
        <input type="text" placeholder="输入作者或书名" name="neirong">
        <button type="submit" value="搜索">搜索</button>
        
        </div>
        </form>
        
        <div class="daohang">
            <ol type="1">
                <li><a href="414.jsp">书城</a></li>
                <li><a href="414.jsp">商店</a></li>
                <li><a href="414.jsp">购物车</a></li>
             	<li><a href="denglu.jsp"> 
             	  <%if(session.getAttribute("a")!=null){
                	out.print(session.getAttribute("a")+"欢迎您");
                }else{
                	out.print("登录");
                } 
                
                %></a></li>
                <li><a href="zhuce.jsp">注册</a></li>
            </ol>
        </div>
    </div>
    <script type="text/javascript">
    
    </script>
</body>
</html>