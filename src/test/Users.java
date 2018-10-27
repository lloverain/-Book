package test;

import java.io.Serializable;

public class Users implements Serializable{
private String userName;
private String userPwd;
private String phone;
private String address;
private String emaill;
private String name;
private int age;
//账户
public String getuserName() {
	return userName;
}
public void setuserName(String userName) {
	this.userName = userName;
}
//密码
public String getuserPwd(){
	return userPwd;
}
public void setuserPwd(String userPwd) {
	this.userPwd = userPwd;
}
//电话
public String getphone(){
	return phone;
}
public void setphone(String phone) {
	this.phone = phone;
}
//地址
public String getaddress() {
	return address;
}
public void setaddress(String address) {
	this.address = address;
}
//邮箱
public String getemaiil() {
	return emaill;
}
public void setemaill(String emaill) {
	this.emaill = emaill;
}
//年龄
public int getage() {
	return age;
}
public void setage(int age) {
	this.age = age;
}
//姓名
public String getname() {
	return name;
}
public void setname(String name) {
	this.name = name;
}
}
