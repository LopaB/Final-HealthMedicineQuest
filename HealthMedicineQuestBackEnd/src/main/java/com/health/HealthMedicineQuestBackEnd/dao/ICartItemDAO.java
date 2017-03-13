package com.health.HealthMedicineQuestBackEnd.dao;

import java.util.List;

import com.health.HealthMedicineQuestBackEnd.model.Cart;
import com.health.HealthMedicineQuestBackEnd.model.CartItem;
import com.health.HealthMedicineQuestBackEnd.model.User;

public interface ICartItemDAO {
	// CartItem CRUD
	public List<CartItem> getAllCartItem(Cart cart);
	public CartItem getCartItem(int id);
	
	public boolean addCartItem(CartItem ci);
	public boolean updateCartItem(CartItem ci);
	public boolean deleteCartItem(int cartItemId);	
	public boolean deleteAllCartItem(List<CartItem> ci);
	//Cart CRUD
	public boolean updateCart(Cart c);
	//public boolean deleteCart(int cartId);	
}
