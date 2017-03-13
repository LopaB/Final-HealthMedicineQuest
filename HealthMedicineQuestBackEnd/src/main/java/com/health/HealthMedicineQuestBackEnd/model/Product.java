package com.health.HealthMedicineQuestBackEnd.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity

public class Product implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8203788072873319136L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)//for autonumber
	int productId;
	@NotBlank(message="Can not leave this field witout entering any Product Name")
	String productName;
	@NotEmpty(message="Can not leave this field witout entering any Product Description")
	String productDescription;
	@Range(min=1,message="Product Price value must be greater than 1")
	int productPrice;
	@Range(min=0, max=200, message="Product Quantity must be within 0 and 200")
	int productQuantity;
	@NotEmpty(message="Can not leave this field witout entering any Product Category")
	String productCategory;
	String imageUrl;
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Transient
	@JsonIgnore
	MultipartFile file;
	public MultipartFile getFile() {
		return file;
	}
	public void setFile(MultipartFile file) {
		this.file = file;
	}
	public int getProductId() {
		return productId;
	}
	public String getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
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
	public Product(int productId, String productName, String productDescription,String productCategory, int productPrice,
			int productQuantity, String imageUrl) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productDescription = productDescription;
		this.productCategory=productCategory;
		this.productPrice = productPrice;
		this.productQuantity = productQuantity;
		this.imageUrl=imageUrl;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}


}
