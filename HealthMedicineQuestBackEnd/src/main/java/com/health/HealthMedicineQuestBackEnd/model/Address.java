package com.health.HealthMedicineQuestBackEnd.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Address implements Serializable {
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = -2513513357940867155L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int addAddressId;
	@NotNull(message="Please enter Address1")
	String addAddress1;
	@NotNull(message="Please enter Address2")
	String addAddress2;
	@NotNull(message="Please enter City")
	String addCity;
	@NotNull(message="Please enter Zip Code")
	String addZip;
	@NotNull(message="Please enter State")
	String addState;
	@NotNull(message="Please enter Country")
	String addCountry;
	boolean shipping;
	@ManyToOne(cascade=CascadeType.ALL)
	User user;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Address(int addAddressId, String addAddress1, String addAddress2, String addCity, String addZip,
			String addState, String addCountry, boolean shipping) {
		super();
		this.addAddressId = addAddressId;
		this.addAddress1 = addAddress1;
		this.addAddress2 = addAddress2;
		this.addCity = addCity;
		this.addZip = addZip;
		this.addState = addState;
		this.addCountry = addCountry;
		this.shipping = false;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getAddAddressId() {
		return addAddressId;
	}
	public void setAddAddressId(int addAddressId) {
		this.addAddressId = addAddressId;
	}
	public String getAddAddress1() {
		return addAddress1;
	}
	public void setAddAddress1(String addAddress1) {
		this.addAddress1 = addAddress1;
	}
	public String getAddAddress2() {
		return addAddress2;
	}
	public void setAddAddress2(String addAddress2) {
		this.addAddress2 = addAddress2;
	}
	public String getAddCity() {
		return addCity;
	}
	public void setAddCity(String addCity) {
		this.addCity = addCity;
	}
	public String getAddZip() {
		return addZip;
	}
	public void setAddZip(String addZip) {
		this.addZip = addZip;
	}
	public String getAddState() {
		return addState;
	}
	public void setAddState(String addState) {
		this.addState = addState;
	}
	public String getAddCountry() {
		return addCountry;
	}
	public void setAddCountry(String addCountry) {
		this.addCountry = addCountry;
	}
	public boolean isShipping() {
		return shipping;
	}
	public void setShipping(boolean shipping) {
		this.shipping = shipping;
	}
	
}
