package com.health.HealthMedicineQuestFrontEnd.handler;

import com.health.HealthMedicineQuestBackEnd.model.Address;
import com.health.HealthMedicineQuestBackEnd.model.CartItem;
import com.health.HealthMedicineQuestBackEnd.model.CartModel;

public class CartHandler {
	
	public CartModel initializeModel(){
		return new CartModel();
	}

	public void saveCartItem(CartModel cartModel,CartItem cartItem){
		cartModel.setCartItem(cartItem);
	}
	
	public void saveBillingAddress(CartModel cartModel,Address billing){
		cartModel.setBillingAddress(billing);
	}
	
	public void saveShippingAddress(CartModel cartModel,Address shipping){
		cartModel.setShippingAddress(shipping);
	}
	
//	public void saveOrder(CartModel cartModel,Order order){
//		cartModel.setOrder(order);
//	}
//	public void savePayment(CartModel cartModel,Payment payment){
//		cartModel.setPayment(payment);
//	}
//	
	public void storeDetail(CartModel cartModel){ 
	
	}
}
