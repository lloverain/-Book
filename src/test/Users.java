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
//�˻�
public String getuserName() {
	return userName;
}
public void setuserName(String userName) {
	this.userName = userName;
}
//����
public String getuserPwd(){
	return userPwd;
}
public void setuserPwd(String userPwd) {
	this.userPwd = userPwd;
}
//�绰
public String getphone(){
	return phone;
}
public void setphone(String phone) {
	this.phone = phone;
}
//��ַ
public String getaddress() {
	return address;
}
public void setaddress(String address) {
	this.address = address;
}
//����
public String getemaiil() {
	return emaill;
}
public void setemaill(String emaill) {
	this.emaill = emaill;
}
//����
public int getage() {
	return age;
}
public void setage(int age) {
	this.age = age;
}
//����
public String getname() {
	return name;
}
public void setname(String name) {
	this.name = name;
}
}
