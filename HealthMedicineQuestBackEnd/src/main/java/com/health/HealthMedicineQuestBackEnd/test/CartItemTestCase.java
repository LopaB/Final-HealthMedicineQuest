package com.health.HealthMedicineQuestBackEnd.test;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.health.HealthMedicineQuestBackEnd.dao.ICartItemDAO;
import com.health.HealthMedicineQuestBackEnd.dao.IProductDAO;
import com.health.HealthMedicineQuestBackEnd.dao.IUserDAO;
import com.health.HealthMedicineQuestBackEnd.model.Cart;
import com.health.HealthMedicineQuestBackEnd.model.User;

public class CartItemTestCase {
	private static AnnotationConfigApplicationContext context;
	
	private static ICartItemDAO cartItemDAO;

	private static IUserDAO userDAO;

	private static IProductDAO productDAO;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.health.HealthMedicineQuestBackEnd");
		context.refresh();
		cartItemDAO = (ICartItemDAO)context.getBean("cartItemDAO");
		userDAO = (IUserDAO)context.getBean("userDAO");
		productDAO = (IProductDAO)context.getBean("productDAO");

	}
	
//		@Test
//	public void testListCartItem(){
//		
//		// get the user
//		User user = userDAO.getUser(2);
//		// get the cart
//		Cart cart = user.getCart();
//		// get the cartItems
//		
//		assertEquals("List CartItem fetched Successfully!",0,cartItemDAO.getAllCartItem(cart).size());
//		
//	}



}
