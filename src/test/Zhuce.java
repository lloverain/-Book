package test;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

import com.sun.corba.se.spi.orbutil.fsm.State;

public class Zhuce {
/*
 * 每个字母对应数据库属性名
 * a 是 LoginId
 * b 是 LoginPwd
 * name 是 Name
 * e 是Address
 * c 是Phone
 * d 是Mail
 * 
 * UserRoleId账号职位   1.普通用户 2.VIP 3.admin
 * UserStateeId为账户有效性      1.有效 2.无效
 * 
 * */
	static String url;
	static String user;
	static String password;
	static String driver;
	public static boolean zhuce(String a,String b,String c,String d,String e,String name) {
		int pd;
		pd =Panduan.zcdologin(a);
		if(pd==1){
			//账户已存在
			return false;
		}else if(pd==0){
			//成功
			//驱动连接
			Properties qd = new Properties();
			try {
				qd.load(Panduan.class.getResourceAsStream("info.properties"));
				url = qd.getProperty("url");
				user = qd.getProperty("userName");
				password = qd.getProperty("userPwd");
				driver = qd.getProperty("driver");
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			String sql = "insert into users(LoginId,LoginPwd,Name,Address,Phone,Mail,UserRoleId,UserStateId) values ('"+a+"','"+b+"','"+name+"','"+e+"','"+c+"','"+d+"',1,1)";
			try {
				Class.forName(driver);
				
				try {
					
//					System.out.println(sql);
					Connection connection = DriverManager.getConnection(url, user, password);
					Statement statement = connection.createStatement();
					
					PreparedStatement aaa = connection.prepareStatement(sql);
					int resultSet = aaa.executeUpdate();
//					System.out.println(resultSet);
					//如果resultSet大于0，证明数据库插入成功，返回True
					if (resultSet>0) {
						return true;
					}else {
						return false;
					}
					
					
					
					
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

		
		return false;
	}

}
