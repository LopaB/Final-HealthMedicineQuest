package com.health.HealthMedicineQuestBackEnd.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Transient;
import javax.validation.constraints.Size;

@Entity
public class User implements Serializable{
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1844930708071631748L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int userId;
	@Size(min=1, max=30,message="user name should be between 1 to 30 characters long")
	String userName;
	@Size(min=1, max=30,message="user password should be between 1 to 30 characters long")
	String password;
	@Size(min=1, max=30,message="user full name should be between 1 to 30 characters long")
	String userFullName;
	public String getUserFullName() {
		return userFullName;
	}
	public void setUserFullName(String userFullName) {
		this.userFullName = userFullName;
	}
	
	String role;
	@Transient
	@Size(min=1, max=30,message="user confirm password should be between 1 to 30 characters long")
	String userConfirmPassword;
	@Size(min=1, max=30,message="user phone number should be between 1 to 30 characters long")
	String userPhoneNumber;
	@Size(min=1, max=30,message="user email should be between 1 to 50 characters long")
	String userEmail;
	String userQuestion;
	@Size(min=1, max=30,message="user answer should be between 1 to 30 characters long")
	String userAnswer;
	boolean enabled;
	
	
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int userId, String userName, String password, String userFullName,String role, String userConfirmPassword,
			String userPhoneNumber, String userEmail, String userQuestion, String userAnswer) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.userFullName=userFullName;
		this.role = role;
		this.userConfirmPassword = userConfirmPassword;
		this.userPhoneNumber = userPhoneNumber;
		this.userEmail = userEmail;
		this.userQuestion = userQuestion;
		this.userAnswer = userAnswer;
		this.enabled=true;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getUserConfirmPassword() {
		return userConfirmPassword;
	}
	public void setUserConfirmPassword(String userConfirmPassword) {
		this.userConfirmPassword = userConfirmPassword;
	}
	public String getUserPhoneNumber() {
		return userPhoneNumber;
	}
	public void setUserPhoneNumber(String userPhoneNumber) {
		this.userPhoneNumber = userPhoneNumber;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserQuestion() {
		return userQuestion;
	}
	public void setUserQuestion(String userQuestion) {
		this.userQuestion = userQuestion;
	}
	public String getUserAnswer() {
		return userAnswer;
	}
	public List<Address> getAddress() {
		return address;
	}
	public void setAddress(List<Address> address) {
		this.address = address;
	}
	public void setUserAnswer(String userAnswer) {
		this.userAnswer = userAnswer;
	}
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}

	@OneToMany(cascade=CascadeType.ALL)
	List<Address> address=new ArrayList<>();
	@OneToOne(cascade=CascadeType.ALL)
	Cart cart;
	
}
