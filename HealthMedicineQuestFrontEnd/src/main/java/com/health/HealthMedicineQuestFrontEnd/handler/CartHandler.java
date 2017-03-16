package com.health.HealthMedicineQuestFrontEnd.handler;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.health.HealthMedicineQuestBackEnd.dao.IAddressDAO;
import com.health.HealthMedicineQuestBackEnd.dao.ICartItemDAO;
import com.health.HealthMedicineQuestBackEnd.dao.IPaymentDAO;
import com.health.HealthMedicineQuestBackEnd.dao.IUserDAO;
import com.health.HealthMedicineQuestBackEnd.model.Address;
import com.health.HealthMedicineQuestBackEnd.model.Cart;
import com.health.HealthMedicineQuestBackEnd.model.CartItem;
import com.health.HealthMedicineQuestBackEnd.model.CartModel;
import com.health.HealthMedicineQuestBackEnd.model.Payment;
import com.health.HealthMedicineQuestBackEnd.model.User;
@Component
public class CartHandler {
	@Autowired
	IUserDAO userDAO;
	@Autowired
	IAddressDAO addressDAO;
	@Autowired
	IPaymentDAO paymentDAO;
	@Autowired
	ICartItemDAO cartItemDAO;
	@Autowired
	HttpSession session;
	CartModel cartModel;
	@Autowired
	User user;
	Cart c;
	public CartModel initializeModel(){
		 user=(User)session.getAttribute("user");
		 cartModel=new CartModel();
		 cartModel.setBillingAddress(addressDAO.getAddressByUser(user));
		 cartModel.setCartItem(cartItemDAO.getAllCartItem(user.getCart()));
		return cartModel;

	}

	public void saveBillingAddress(CartModel cartModel,Address billing){
		cartModel.setBillingAddress(billing);
	}
	
	public void saveShippingAddress(CartModel cartModel,Address shipping){
		if(shipping.getAddAddress1()!=""){
			shipping.setShipping(true);
			cartModel.setShippingAddress(shipping);
		}

	}
	

	public void savePayment(CartModel cartModel,Payment payment){
		payment.setUser(user);
		c=cartModel.getCartItem().get(0).getCart();
		payment.setTotalPayment(c.getGrandTotal());
		cartModel.setPayment(payment);
		System.out.println("payment object created");
	}
	
	public void storeDetail(CartModel cartModel){ 
		
		 if(cartModel.getShippingAddress().isShipping()){
			 
			 Address a=cartModel.getShippingAddress();
			 a.setUser(user);
			 addressDAO.addAddress(a);
		}
		
		 c=cartModel.getCartItem().get(0).getCart();
		Payment p=cartModel.getPayment();
		// p.setTotalPayment(c.getGrandTotal());
		paymentDAO.addPayment(p);
		
		cartItemDAO.deleteAllCartItem(cartItemDAO.getAllCartItem(c));
		c.setGrandTotal(0);
		c.setItemCounts(0);
		cartItemDAO.updateCart(c);
		
	}
}
