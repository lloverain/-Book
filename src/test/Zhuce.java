package test;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

import com.sun.corba.se.spi.orbutil.fsm.State;

public class Zhuce {
/*
 * ÿ����ĸ��Ӧ���ݿ�������
 * a �� LoginId
 * b �� LoginPwd
 * name �� Name
 * e ��Address
 * c ��Phone
 * d ��Mail
 * 
 * UserRoleId�˺�ְλ   1.��ͨ�û� 2.VIP 3.admin
 * UserStateeIdΪ�˻���Ч��      1.��Ч 2.��Ч
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
			//�˻��Ѵ���
			return false;
		}else if(pd==0){
			//�ɹ�
			//��������
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
					//���resultSet����0��֤�����ݿ����ɹ�������True
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
