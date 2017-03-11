package com.health.HealthMedicineQuestBackEnd.model;

import java.io.Serializable;
import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;

import com.health.HealthMedicineQuestBackEnd.dao.IAddressDAO;
import com.health.HealthMedicineQuestBackEnd.dao.IUserDAO;

public class CartModel implements Serializable{

	private static final long serialVersionUID = -4551827186947380158L;
	@Autowired
	IAddressDAO addressDAO;
	@Autowired
	IUserDAO userDAO;
	Address billingAddress;
	Address shippingAddress;
	Payment payment;
	
	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

	public Address getBillingAddress(Principal p) {
		//User user = (User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		User u=userDAO.getUserByUserName(p.getName());
		this.billingAddress=addressDAO.getAddressByUser(u);
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
	public CartModel() {
		
		billingAddress=new Address();
		shippingAddress=new Address();
		payment=new Payment();
	}
	

}
