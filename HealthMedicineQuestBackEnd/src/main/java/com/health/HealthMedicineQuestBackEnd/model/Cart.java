package com.health.HealthMedicineQuestBackEnd.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Cart implements Serializable{

	private static final long serialVersionUID = 6711662177389182695L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int cartId;
	int itemCounts;
	int grandTotal;
	@OneToOne(cascade=CascadeType.ALL)
	User user;
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cart(int cartId, int itemCounts, int grandTotal) {
		super();
		this.cartId = cartId;
		this.itemCounts = itemCounts;
		this.grandTotal = grandTotal;
		
	}
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public int getItemCounts() {
		return itemCounts;
	}
	public void setItemCounts(int itemCounts) {
		this.itemCounts = itemCounts;
	}
	public int getGrandTotal() {
		return grandTotal;
	}
	public void setGrandTotal(int grandTotal) {
		this.grandTotal = grandTotal;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	

}
