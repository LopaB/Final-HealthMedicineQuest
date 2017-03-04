package com.health.HealthMedicineQuestBackEnd.test;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.health.HealthMedicineQuestBackEnd.dao.IProductDAO;
import com.health.HealthMedicineQuestBackEnd.model.Product;

public class ProductsTestCase {
	private static AnnotationConfigApplicationContext context;
	private static IProductDAO productDAO;
	private static Product product;
	
	@BeforeClass
	public static void init(){
		context=new AnnotationConfigApplicationContext();
		context.scan("com.health.HealthMedicineQuestBackEnd");
		context.refresh();
		
		productDAO=(IProductDAO)context.getBean("productDAO");
		
	}
	
	@Test
	public void testAddProducts(){
		product=new Product();
		product.setProductName("SBL Homeocal Tabs (25g)");
		product.setProductDescription("Optimise Bone Health, Relieves Osteoporosis, Calcium Deficiency");
		product.setProductPrice(112);
		product.setProductQuantity(15);
		product.setImageUrl("HomeoCal.jpg");
		assertEquals("Successfully added a product inside the table!", true, productDAO.addProducts(product));
	}
}