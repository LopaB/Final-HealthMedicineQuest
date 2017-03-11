package com.health.HealthMedicineQuestFrontEnd.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.health.HealthMedicineQuestBackEnd.dao.IUserDAO;
import com.health.HealthMedicineQuestBackEnd.model.Address;
import com.health.HealthMedicineQuestBackEnd.model.CartModel;
import com.health.HealthMedicineQuestBackEnd.model.Payment;
@Component
public class CartHandler {
	@Autowired
	IUserDAO userDAO;
	public CartModel initializeModel(){
		return new CartModel();
	}

	
	
	public void saveBillingAddress(CartModel cartModel,Address billing){
		cartModel.setBillingAddress(billing);
	}
	
	public void saveShippingAddress(CartModel cartModel,Address shipping){
		cartModel.setShippingAddress(shipping);
	}
	

	public void savePayment(CartModel cartModel,Payment payment){
		cartModel.setPayment(payment);
	}
	
	public void storeDetail(CartModel cartModel){ 
		//User user=userDAO.getUserByUserName(principal.getName());
	}
}
