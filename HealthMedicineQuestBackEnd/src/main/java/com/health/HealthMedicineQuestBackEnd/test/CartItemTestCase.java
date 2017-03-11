package com.health.HealthMedicineQuestBackEnd.test;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.health.HealthMedicineQuestBackEnd.dao.ICartItemDAO;
import com.health.HealthMedicineQuestBackEnd.dao.IProductDAO;
import com.health.HealthMedicineQuestBackEnd.dao.IUserDAO;
import com.health.HealthMedicineQuestBackEnd.model.Cart;
import com.health.HealthMedicineQuestBackEnd.model.CartItem;
import com.health.HealthMedicineQuestBackEnd.model.Product;
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
//	@Test
//	public void testAddToCart(){
//		Product p=productDAO.getProduct(1);
//		User user=userDAO.getUser(1);
//		CartItem ci=new CartItem();
//	    Cart c=user.getCart();
//
//		//calculating subTotal for cartItems
//		int unitPrice=p.getProductPrice();
//		double subTotal=unitPrice*1;
//
//		//updating cart instance
//		int totalPrice=c.getGrandTotal();
//		totalPrice+=subTotal;
//		c.setGrandTotal(totalPrice);
//		int items=c.getItemCounts();
//		items+=1;
//		c.setItemCounts(items);
//		
//		//update cartitem instance
//		ci.setCart(c);
//		ci.setQuantity(1);
//		ci.setTotalPrice(subTotal);
//		ci.setProduct(productDAO.getProduct(1));
//		
//		//updating product instance
//		//int i_q=p.getProductQuantity();
//		//int f_q=i_q-1;
//		//p.setProductQuantity(f_q);
//		
//		//adding cart item
//		cartItemDAO.addCartItem(ci);
//		
//		//updating cart
//		//cartItemDAO.updateCart(c);
//		assertEquals("List CartItem fetched Successfully!",true,cartItemDAO.updateCart(c));
//	}
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
