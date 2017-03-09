package com.health.HealthMedicineQuestFrontEnd.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.health.HealthMedicineQuestBackEnd.dao.IUserDAO;
import com.health.HealthMedicineQuestBackEnd.model.RegisterModel;
import com.health.HealthMedicineQuestBackEnd.model.Address;
import com.health.HealthMedicineQuestBackEnd.model.Cart;
import com.health.HealthMedicineQuestBackEnd.model.User;

@Component
public class RegisterHandler {

	@Autowired
	IUserDAO userDAO;

	public RegisterModel initializeFlow() {
		return new RegisterModel();
	}

	public void saveUser(RegisterModel registerModel,User user){
		registerModel.setUser(user);
	}
	public void saveBillingAddress(RegisterModel registerModel,Address address){
		registerModel.setAddress(address);
	}
	
	  public void storeDetail(RegisterModel registerModel){ 
		  User user = registerModel.getUser();
		// save the user
		userDAO.addUser(user);
		Address address = registerModel.getAddress();
		// set the user 
		address.setUser(user);
		// save the billing address
		userDAO.addUserAddress(address);
		 
		// if shipping is not same as billing
		//if(!billing.isShipping()) {
		//Address shipping = registerModel.getShipping();
		// set the user for shipping
		//shipping.setUser(user);
		// save the shipping address
		//userDAO.addUserAddress(shipping);
		//}
		// if user is not supplier
		if(user.getRole().equals("CUSTOMER")) {
		Cart cart = new Cart();
		// set the user
		cart.setUser(user);
		// save the cart
		userDAO.addUserCart(cart);
		}

	 
	  }
	 
}
