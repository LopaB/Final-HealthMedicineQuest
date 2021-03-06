package com.health.HealthMedicineQuestBackEnd.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.health.HealthMedicineQuestBackEnd.dao.ICartItemDAO;
import com.health.HealthMedicineQuestBackEnd.dao.IUserDAO;
import com.health.HealthMedicineQuestBackEnd.model.Cart;
import com.health.HealthMedicineQuestBackEnd.model.CartItem;
import com.health.HealthMedicineQuestBackEnd.model.User;

@Repository("cartItemDAO")
@Transactional
public class CartItemDAOImpl implements ICartItemDAO{
	@Autowired
	SessionFactory sessionFactory;
	IUserDAO userDAO;
	@Autowired
	User user;
	public List<CartItem> getAllCartItem(Cart cart){
				
		return sessionFactory.getCurrentSession().createQuery("from CartItem where cart=:cart").setParameter("cart", cart).getResultList();
	}
	public CartItem getCartItem(int id){
		return sessionFactory.getCurrentSession().get(CartItem.class,Integer.valueOf(id));
	}
	
	
	
	public boolean addCartItem(CartItem ci){
		try {
			sessionFactory.getCurrentSession().save(ci);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	public boolean updateCartItem(CartItem ci){
		try {
			sessionFactory.getCurrentSession().update(ci);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	public boolean deleteCartItem(int cartItemId){
		try {
			sessionFactory.getCurrentSession().delete(getCartItem(cartItemId));
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean deleteAllCartItem(List<CartItem> ci) { 
        try { 
                for(CartItem i:ci) 
                { 
                        sessionFactory.getCurrentSession().delete(i); 
                } 
                return true; 
        } catch (Exception e) { 
                e.printStackTrace(); 
                return false; 
        } 
}

	//Cart CRUD
	public boolean updateCart(Cart c){
		try {
			sessionFactory.getCurrentSession().update(c);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean deleteCart(int cartId){
		try {
			sessionFactory.getCurrentSession().delete(cartId);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
}
