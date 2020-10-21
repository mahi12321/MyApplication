package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="USER_TAB")
public class User {

	@Id
	@Column(name="USR_ID")
	@GeneratedValue(generator="id")
	@GenericGenerator(name="id" , strategy="com.app.generator.IdGenerator")
	private Integer userId;
	@Column(name="USR_NAME")
	private String userName;
	@Column(name="USR_PWD")
	private String userPwd;
	@Column(name="USR_MOBILE")
	private String mobileNum;
	@Column(name="USR_ADDR")
	private String address;
	
	public User() {
		super();
	}
	public User(Integer userId, String userName, String userPwd, String mobileNum, String address) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPwd = userPwd;
		this.mobileNum = mobileNum;
		this.address = address;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public String getMobileNum() {
		return mobileNum;
	}
	public void setMobileNum(String mobileNum) {
		this.mobileNum = mobileNum;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userPwd=" + userPwd + ", mobileNum=" + mobileNum
				+ ", address=" + address + "]";
	}
	
}
