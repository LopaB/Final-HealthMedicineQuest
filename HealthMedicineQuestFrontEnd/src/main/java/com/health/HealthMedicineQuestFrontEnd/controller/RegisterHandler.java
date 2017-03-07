package com.health.HealthMedicineQuestFrontEnd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.health.HealthMedicineQuestBackEnd.dao.IUserDAO;
import com.health.HealthMedicineQuestBackEnd.model.RegisterModel;
import com.health.HealthMedicineQuestBackEnd.model.User;

@Component
public class RegisterHandler {
	
	@Autowired
	IUserDAO userDAO;
	RegisterModel registerModel;
	
	public User initFlow(){
		return new User();
	}
	
//	public String validateUserDetails(User user){
//		String status = "success";
//		if(userBean.getUserId().isEmpty()){
//			messageContext.addMessage(new MessageBuilder().error().source(
//					"userId").defaultText("UserId cannot be Empty").build());
//			status = "failure";
//		}
//		if(userBean.getEmail().isEmpty()){
//			messageContext.addMessage(new MessageBuilder().error().source(
//					"email").defaultText("Email cannot be Empty").build());
//			status = "failure";
//		}
//		if(userBean.getAge()==null){
//			messageContext.addMessage(new MessageBuilder().error().source(
//					"age").defaultText("Age cannot be Empty").build());
//			status = "failure";
//		}
//		return status;
//	}

}
