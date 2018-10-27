package impl;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import test.BookDAO;
import test.BookDO;
import test.Panduan;
import test.Users;

public class BookDAOImpl implements BookDAO {
	static String url;
	static String user;
	static String password;
	static String driver;
	
	public BookDAOImpl() {
		// TODO Auto-generated constructor stub
	}
	//ISBN
	@Override
	public List<BookDO> getBooksByIsbn(String isbn) {
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
		
		List<BookDO> aaa= new ArrayList<BookDO>();
		BookDO users;
		String sql = "select * from books where ISBN like '%"+isbn+"%'";
		try {
			Class.forName(driver);
			Connection connection = DriverManager.getConnection(url, user, password);
			Statement statement = connection.createStatement();
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				users = new BookDO();
				users.setTitle(resultSet.getString(2));
				users.setAuthor(resultSet.getString(3));
				users.setIsbn(resultSet.getString(6));
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

	@Override
	public List<BookDO> listBooksByTitle(String title) {
		// 创建List<BookDO>的集合对象listBook
				//通过dBase调用getConnection()得到连接
				//创建按照书名模糊查询图书的SQL语句sql
				//创建PreparedStatement的对象stmt
				
				//通过stmt调用executeQuery()，返回ResultSet的对象rs
				
				/*
				 * 通过循环遍历rs，将rs中的每一行转换成一个BookDO的对象book
				 * 并把book添加到listBook中
				 */
				
				//返回listBook
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
			
			List<BookDO> aaa= new ArrayList<BookDO>();
			BookDO users;
			String sql = "select * from books where Title like '%"+title+"%'";
			try {
				Class.forName(driver);
				Connection connection = DriverManager.getConnection(url, user, password);
				Statement statement = connection.createStatement();
				PreparedStatement preparedStatement = connection.prepareStatement(sql);
				ResultSet resultSet = preparedStatement.executeQuery();
				while (resultSet.next()) {
					users = new BookDO();
					users.setTitle(resultSet.getString(2));
					users.setAuthor(resultSet.getString(3));
					users.setIsbn(resultSet.getString(6));
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
	//图书种类
	@Override
	public List<BookDO> listBooksByCagtegoryId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
	
	//主页！
	@Override
	public List<BookDO> listBook() {
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
			
			List<BookDO> aaa= new ArrayList<BookDO>();
			BookDO users;
			String sql = "select * from books";
			try {
				Class.forName(driver);
				Connection connection = DriverManager.getConnection(url, user, password);
				Statement statement = connection.createStatement();
				PreparedStatement preparedStatement = connection.prepareStatement(sql);
				ResultSet resultSet = preparedStatement.executeQuery();
				while (resultSet.next()) {
					users = new BookDO();
					users.setTitle(resultSet.getString(2));
					users.setAuthor(resultSet.getString(3));
					users.setIsbn(resultSet.getString(6));
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

	//作者
	@Override
	public List<BookDO> listAuthor(String author) {
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
		
		List<BookDO> aaa= new ArrayList<BookDO>();
		BookDO users;
		String sql = "select * from books where Author like '%"+author+"%'";
		try {
			Class.forName(driver);
			Connection connection = DriverManager.getConnection(url, user, password);
			Statement statement = connection.createStatement();
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				users = new BookDO();
				users.setTitle(resultSet.getString(2));
				users.setAuthor(resultSet.getString(3));
				users.setIsbn(resultSet.getString(6));
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
