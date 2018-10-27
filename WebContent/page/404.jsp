<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <style>
        body{
            background-image: url("img/404.png");
            width: 100%;
            height: 100%;
            
        }
      .div1{
            position: absolute;
            left: 10%;
            top: 49%;
            font-size: 70px;
            background: linear-gradient(to right, rgba(209, 19, 216, 0.877), rgba(168, 252, 2, 0.87));
            -webkit-background-clip: text;
            color: transparent;
            font-family: 'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande', 'Lucida Sans Unicode', Geneva, Verdana, sans-serif;
            font-weight: bold;
            text-align: center;
            transform:rotate(-7deg);
-ms-transform:rotate(-7deg);
-moz-transform:rotate(-7deg); 
-webkit-transform:rotate(-7deg); 
-o-transform:rotate(-7deg);        
        }
        .div2{
            position: absolute;
            left: 40%;
            top: 80%;
            font-size: 45px;
            margin: 0;
            color: rgba(47, 48, 47, 0.589);
            font-family: "幼圆";
            height: 60px;

        }
        a{
            text-decoration: none;
            color: rgb(0, 255, 128);
           
        }
    </style>
     <script>  

        setInterval("fun(shijian)", 1);
        function fun(timeID) {
            var date = new Date();
            var y = date.getFullYear();
            var m = date.getMonth() + 1;
            var d = date.getDate();
            var w = date.getDay();
            var ww = ' 星期' + '日一二三四五六'.charAt(new Date().getDay());
            var h = date.getHours();
            var minute = date.getMinutes()
            var s = date.getSeconds();
            if (m < 10) {
                m = "0" + m;
            }
            if (d < 10) {
                d = "0" + d;
            }
            if (h < 10) {
                h = "0" + h;
            }


            if (minute < 10) {
                minute = "0" + minute;
            }


            if (s < 10) {
                s = "0" + s;
            }


            document.getElementById(timeID.id).innerHTML = y + "-" + m + "-" + d + "   " + h + ":" + minute + ":" + s + " (ง •_•)ง" + "  " + ww;
        }  
    </script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>404</title>
</head>

<body>
    <div id="shijian" class="div1"></div>
     <div class="div2"><div id="div2"></div></div>
		<%response.setHeader("refresh", "8;url=index.jsp");%>
        <script>
                var str = '程序员小哥哥正在努力开发中，请原谅';
                var i = 0;
                function typing(){
                 var zi = document.getElementById('div2');
                 if (i <= str.length) {
                  zi.innerHTML = str.slice(0, i++) + '_';
                  setTimeout('typing()', 100);
                 }
                 else{
                  zi.innerHTML = str;
                 }
                }
                typing();
               </script>

</body>
</html>