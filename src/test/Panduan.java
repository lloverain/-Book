package test;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;


public class Panduan {
	static String url;
	static String user;
	static String password;
	static String driver;
//					1表示账户已存在  				0表示不存在

	public static int dologin(String a,String b) {
		// TODO Auto-generated constructor stub
		Properties qd = new Properties();
		try {
			qd.load(Panduan.class.getResourceAsStream("info.properties"));
			url = qd.getProperty("url");
			user = qd.getProperty("userName");
			password = qd.getProperty("userPwd");
			driver = qd.getProperty("driver");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		  String sql = "select * from users where LoginId="+"'"+a+"'"+" and LoginPwd="+"'"+b+"'";
		
		try {
			Class.forName(driver);
			try {
				Connection connection = DriverManager.getConnection(url, user, password);
				Statement statement = connection.createStatement();
				PreparedStatement preparedStatement = connection.prepareStatement(sql);
				ResultSet resultSet = preparedStatement.executeQuery();
//				System.out.println(sql);
				if(resultSet.next()) {
					return 1;
				}else {
					return 0;
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
		
	}
	
	
	public static int zcdologin(String a) {
		// TODO Auto-generated constructor stub
		Properties qd = new Properties();
		try {
			qd.load(Panduan.class.getResourceAsStream("info.properties"));
			url = qd.getProperty("url");
			user = qd.getProperty("userName");
			password = qd.getProperty("userPwd");
			driver = qd.getProperty("driver");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		  String sql = "select * from users where LoginId="+"'"+a+"'";
		
		try {
			Class.forName(driver);
			try {
				Connection connection = DriverManager.getConnection(url, user, password);
				Statement statement = connection.createStatement();
				PreparedStatement preparedStatement = connection.prepareStatement(sql);
				ResultSet resultSet = preparedStatement.executeQuery();
//				System.out.println(sql);
				if(resultSet.next()) {
					return 1;
				}else {
					return 0;
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
		
	}
	
	public List<Users> getuser(){
		Properties qd = new Properties();
		try {
			qd.load(Panduan.class.getResourceAsStream("info.properties"));
			url = qd.getProperty("url");
			user = qd.getProperty("userName");
			password = qd.getProperty("userPwd");
			driver = qd.getProperty("driver");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		List<Users> aaa= new ArrayList<Users>();
		Users users;
		String sql = "select * from users";
		try {
			Class.forName(driver);
			Connection connection = DriverManager.getConnection(url, user, password);
			Statement statement = connection.createStatement();
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				users = new Users();
				users.setuserName(resultSet.getString(2));
				users.setuserPwd(resultSet.getString(3));
				users.setname(resultSet.getString(4));
				users.setaddress(resultSet.getString(5));
				users.setphone(resultSet.getString(6));
				users.setemaill(resultSet.getString(7));
				aaa.add(users);				
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return aaa;
	
	}

}
