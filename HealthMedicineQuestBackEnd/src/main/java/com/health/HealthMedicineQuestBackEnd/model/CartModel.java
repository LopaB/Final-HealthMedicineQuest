package com.health.HealthMedicineQuestBackEnd.model;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

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
	List<CartItem> cartItem;
	
	public List<CartItem> getCartItem() {
		return cartItem;
	}

	public void setCartItem(List<CartItem> cartItem) {
		this.cartItem = cartItem;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		System.out.println("setting payment address");
		this.payment = payment;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	public Address getBillingAddress() {
		
		return billingAddress;
	}
	public void setBillingAddress(Address billingAddress) {
		System.out.println("setting shipping address");
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
