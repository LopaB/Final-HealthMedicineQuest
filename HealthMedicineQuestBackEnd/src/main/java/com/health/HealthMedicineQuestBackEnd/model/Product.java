package com.health.HealthMedicineQuestBackEnd.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

@Entity

public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)//for autonumber
	int productId;
	@NotBlank
	@Size(min=3)
	String productName;
	@NotEmpty
	@Size(min=10)
	String productDescription;
	@NotBlank
	int productPrice;
	@NotBlank
	@Range(min=0, max=200)
	int productQuantity;
	@NotBlank
	String imageUrl;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	public int getProductQuantity() {
		return productQuantity;
	}
	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public Product(int productId, String productName, String productDescription, int productPrice,
			int productQuantity, String imageUrl) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productDescription = productDescription;
		this.productPrice = productPrice;
		this.productQuantity = productQuantity;
		this.imageUrl=imageUrl;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}


}
