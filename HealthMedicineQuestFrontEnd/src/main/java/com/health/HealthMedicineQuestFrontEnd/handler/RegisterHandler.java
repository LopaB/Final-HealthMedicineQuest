package com.health.HealthMedicineQuestFrontEnd.handler;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;

import com.health.HealthMedicineQuestBackEnd.dao.IUserDAO;
import com.health.HealthMedicineQuestBackEnd.model.Address;
import com.health.HealthMedicineQuestBackEnd.model.User;

@Component
public class RegisterHandler {
	
	User user;
	Address billingAddress;
	Address shippingAddress;
	@Autowired
	IUserDAO userDAO;
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Address getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
	}

	public Address getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(Address shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	public RegisterHandler(){
		user=new User();
		billingAddress=new Address();
		shippingAddress=new Address();
	}

	public String validateUser(@Valid User user, BindingResult result){
		String status="failure";
		if(result.hasErrors())
			status= "failure";
		else
			status= "success";
		return status;
	}
	public String storeDetail(User user, Address address){
		String status="failure";
		if(user.isEnabled()){
			List<Address> list=new ArrayList<Address>();
			address.setUser(user);
			list.add(address);
			user.setAddress(list);
			boolean result=userDAO.addUser(user);
			if(result)
			{
				status= "success";
			}
			else{
				status= "failure";
			}

		}
		
		return status;
	}
}
