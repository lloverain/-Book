package test;

import java.io.IOException;
import java.util.Properties;

public class Jdbcuser {
	Properties properties;
	String userName,userPwd;
	public void shuju() {
		// TODO Auto-generated constructor stub
	properties= new Properties();
	try {
		properties.load(Jdbcuser.class.getResourceAsStream("info.properties"));
		userName = properties.getProperty(userName);
		userPwd = properties.getProperty(userPwd);	
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
