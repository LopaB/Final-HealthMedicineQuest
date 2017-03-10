package com.health.HealthMedicineQuestBackEnd.model;

import java.io.Serializable;

public class CartModel implements Serializable{

	private static final long serialVersionUID = -4551827186947380158L;
	CartItem cartItem;
	Address billingAddress;
	Address shippingAddress;
	//Payment payment;
	//Order order;
//	public Payment getPayment() {
//		return payment;
//	}
//
//	public void setPayment(Payment payment) {
//		this.payment = payment;
//	}
//
//	public Order getOrder() {
//		return order;
//	}
//
//	public void setOrder(Order order) {
//		this.order = order;
//	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public CartItem getCartItem() {
		return cartItem;
	}

	public void setCartItem(CartItem cartItem) {
		this.cartItem = cartItem;
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
	public CartModel() {
		cartItem=new CartItem();
		billingAddress=new Address();
		shippingAddress=new Address();
		//order=new Order();
		//payment=new Payment();
	}
	

}
