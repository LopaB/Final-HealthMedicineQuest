package com.health.HealthMedicineQuestBackEnd.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;
@Entity
public class User implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int userId;
	String userName;
	String userPassword;
	String userRole;
	@Transient
	String userConfirmPassword;
	String userPhoneNumber;
	String userEmail;
	String userQuestion;
	String userAnswer;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int userId, String userName, String userPassword, String userRole, String userConfirmPassword,
			String userPhoneNumber, String userEmail, String userQuestion, String userAnswer) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPassword = userPassword;
		this.userRole = userRole;
		this.userConfirmPassword = userConfirmPassword;
		this.userPhoneNumber = userPhoneNumber;
		this.userEmail = userEmail;
		this.userQuestion = userQuestion;
		this.userAnswer = userAnswer;
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
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
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
	public void setUserAnswer(String userAnswer) {
		this.userAnswer = userAnswer;
	}
	
	
}
