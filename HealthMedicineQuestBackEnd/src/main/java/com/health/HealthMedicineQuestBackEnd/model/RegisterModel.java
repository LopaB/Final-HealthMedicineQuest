package com.health.HealthMedicineQuestBackEnd.model;

public class RegisterModel {

	User user;
	Address billing;
	Address shipping;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Address getBilling() {
		return billing;
	}
	public void setBilling(Address billing) {
		this.billing = billing;
	}
	public RegisterModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RegisterModel(User user, Address billing, Address shipping) {
		super();
		this.user = user;
		this.billing = billing;
		this.shipping = shipping;
	}
	public Address getShipping() {
		return shipping;
	}
	public void setShipping(Address shipping) {
		this.shipping = shipping;
	}
}
