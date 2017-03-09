package com.health.HealthMedicineQuestBackEnd.model;

import java.io.Serializable;

import com.health.HealthMedicineQuestBackEnd.model.Address;
import com.health.HealthMedicineQuestBackEnd.model.User;

public class RegisterModel implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5608194799120201763L;
	public User user;
	public Address address;
	Address shippingAddress;
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		System.out.println("initialize user");
		this.user = user;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		System.out.println("initialize billing address");
		this.address = address;
	}

	public Address getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(Address shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public RegisterModel(){
		System.out.println("initialise register model");
		user=new User();
		address=new Address();
		shippingAddress=new Address();
	}
}
