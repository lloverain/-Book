<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="../css/zhuce.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册</title>
</head>
<body id="beijing" style="margin: 0">

    <form name="tijiao" method="post" onsubmit="return check()" action="FindUser?leixing=zhuce">
        <div class="left"></div>
        <div class="pg_body">
                <div class="menu">用户名:</div>
                    <div class="kong">
                        <input id="text1" type="text" name="zh" placeholder="请输入用户名" onblur="checkname()"><!-- //用户名 -->
                        <span id="div1" class="tian" style="margin-top: -20px">*(为必填)<span>
                    </div>
                <div class="menu">真实姓名:</div>
                    <div class="kong">
                        <input id="i2" type="text" name="xm" placeholder="输入真实姓名"><!-- //姓名 -->
                    </div>
                <div class="menu">密码:</div>
                    <div class="kong">
                        <input id="text2" type="password" name="mm" onblur="checkpassword()" placeholder="请输入密码"><!-- //密码 -->
                        <span id="div2" class="tian" style="margin-top: -25px">*(为必填)<span>
                    </div>
                <div class="menu">确认密码:</div>
                    <div class="kong">
                        <input id="text3" type="password" name="mm" onblur="checkrepassword()" placeholder="请再一次输入密码">
                        <span id="div3" class="tian">*(为必填)<span>
                    </div>
                <div class="menu">电话号码:</div>
                    <div class="kong">
                        <input id="i5" type="text" name="dh" placeholder="请输入电话号码" onblur="phone()"><!-- //电话 -->
                         <span id="div5" class="tian">*(为必填)<span>
                    </div>
                <div class="menu">邮箱地址:</div>
                    <div class="kong">
                        <input id="text4" type="text" name="em" onblur="checkEmail()" placeholder="请输入邮箱"><!-- 邮箱 -->
                        <span id="div4" class="tian">*(为必填)<span> 
        </div>
        <div class="menu">住址</div>
        <div class="kong">
        <input id="zhuzhi" type="text" name="dz" placeholder="请输入地址"><!-- //住址 -->
        </div>
        <div class="can">
            <input id="i111" type="submit" name="002" value="注  册">
            <p style="width: 100px;display: inline-block;"></p>
            <input id="i222" type="button" name="004" value="取  消"  onclick="window.location.reload()">

        </div>
    </form>
    <div class="you">
            莎士比亚曾经说过:书籍是全世界的营养品，生活里没有书籍就好像没有阳光；智慧里没有书籍就好像鸟儿没有翅膀 。这显然说明了读书的重要性；当生活失去阳光,当鸟儿失去翅膀,那宇宙将会黯然失色，世界将不再精彩……
            
    </div>
    <script type="text/javascript">
            //用户名验证
            function checkname(){ 
                var div = document.getElementById("div1"); 
                div.innerHTML = ""; 
               
                var name1 = document.tijiao.text1.value; 
                var d = name1.indexOf("yjy",0)
                var e = name1.indexOf("yangjiaying",0)
               
         		if(d>=0){
         			div1.innerHTML = "不能包涵yjy！"
         			return false
         		}
                if(e>=0){
                	div1.innerHTML = "不能包涵yangjiaying！"
             			return false
                }
                if (name1 == "") { 
                div1.innerHTML = "用户名不能为空！"; 
               /*  document.tijiao.text1.focus();  */
           
                return false; 
            } 
      			
      
                if (name1.length < 6 || name1.length > 16) { 
                div.innerHTML = "长度6-16个字符"; 
         /*        document.tijiao.text1.select();  */
                return false; 
            } 
                var charname1 = name1.toLowerCase(); 
                for (var i = 0; i < name1.length; i++) { 
                var charname = charname1.charAt(i); 
                if (!(charname >= 0 && charname <= 9) && (!(charname >= 'a' && charname <= 'z')) && (charname != '_')||charname == " " ) { 
                    div.innerHTML = "用户名包含非法字符"; 
        /*             document.form1.text1.select();  */
                    return false; 
                } 
            } 
          
                return true;
        }

            //密码验证
            function checkpassword(){ 
                var div = document.getElementById("div2"); 
                div.innerHTML = ""; 
                var password = document.tijiao.text2.value; 
                if (password == "") { 
                div.innerHTML = "密码不能为空"; 
           /*      document.tijao.text2.focus();  */
                return false; 
            } 
                if (password.length < 6||password.length>16) { 
                div.innerHTML = "密码长度为6-16位"; 
            /*     document.tijiao.text2.select();  */
                return false; 
                } 
                return true; 
        }

            function checkrepassword(){ 
                var div = document.getElementById("div3"); 
                div.innerHTML = ""; 
                var password = document.tijiao.text2.value; 
                var repass = document.tijiao.text3.value; 
                if (repass == "") { 
                div.innerHTML = "密码不能为空"; 
         /*        document.tijiao.text3.focus();  */
                return false; 
            } 
                if (password != repass) { 
                div.innerHTML = "密码不一致"; 
            /*     document.tijiao.text3.select();  */
                return false; 
            } 
                return true; 
        }
     // 验证电子邮件
/*         function checkEmail() {
            var email = document.getElementById("text4").value
            var email_yz = document.getElementById("div4")
        

            var reg = /^\w+@\w+\.\w+[(com)|(cn)]$/
            
            if(email.length != 0){
                email_yz.innerHTML = ""
            }
            if (reg.test(email) == false) {
                email_yz.innerHTML = "Email格式不正确，例如123456@qq.com"
                return false
            }
          
            return true
        } */
        //邮箱验证1
        function checkEmail() {
			var email = document.getElementById("text4").value
			  var ts = document.getElementById("div4")
			var a = email.indexOf("@",1)
			var b = email.indexOf(".",a)
			ts.innerHTML=""
			if(email== ""){
				ts.innerHTML="邮箱不能为空"
				return false
			}
			if(a==-1){
			ts.innerHTML="邮箱应包含@"
			return false
		}	
			if(b==-1){
				ts.innerHTML="邮箱应包涵'.'符号，并且在'@'符号后面"	
			return false
			}
			return true
			}
     //验证电话号码
     	function phone() {
     	   var ph = document.getElementById("i5").value
     	   var ts = document.getElementById("div5")
     	   if (ph.length==11) {
     		   ts.innerHTML=""
			return true
		}else {
			 ts.innerHTML="手机号为11位！"
			return false
		}
     		 ts.innerHTML="手机号为11位！"
     	   return false
		}
		//最终判断 传输
            function check(){ 
            if (checkname() && checkpassword() && checkrepassword() && checkEmail()&&phone()) { 
            return true; 
            } 
            else { 
            return false; 
        } 
    } 
    </script>
   <!--  <div class="shouye"><a href="index.jsp" style="color:black;"><br>首页</a></div> -->
    <!-- <div class="shouye1"><a href="denglu.jsp" style="color:black;"><br>返回</a></div> -->
</body>
</html>