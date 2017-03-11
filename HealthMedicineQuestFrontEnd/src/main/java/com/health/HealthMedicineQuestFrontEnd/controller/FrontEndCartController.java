package com.health.HealthMedicineQuestFrontEnd.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.health.HealthMedicineQuestBackEnd.dao.ICartItemDAO;
import com.health.HealthMedicineQuestBackEnd.dao.IProductDAO;
import com.health.HealthMedicineQuestBackEnd.dao.IUserDAO;
import com.health.HealthMedicineQuestBackEnd.model.Cart;
import com.health.HealthMedicineQuestBackEnd.model.CartItem;
import com.health.HealthMedicineQuestBackEnd.model.Product;
import com.health.HealthMedicineQuestBackEnd.model.User;

@Controller
public class FrontEndCartController {
	@Autowired
	IProductDAO productDAO;
	@Autowired
	ICartItemDAO cartItemDAO;
	@Autowired
	IUserDAO userDAO;
	

	@RequestMapping(value={"/user/{productId}"})
	public ModelAndView addToCart(@PathVariable("productId")int id,@RequestParam("quantity")String quantity, Principal principal){
		ModelAndView model;
		if(principal!=null){
		User user=userDAO.getUserByUserName(principal.getName());
			
		Product p=productDAO.getProduct(id);
		//User u=userDAO.getUser(userId);
		CartItem ci=new CartItem();
	    Cart c=user.getCart();
	    int q=Integer.parseInt(quantity);
		//calculating subTotal for cartItems
		int unitPrice=p.getProductPrice();
		double subTotal=unitPrice*q;

		//updating cart instance
		int totalPrice=c.getGrandTotal();
		totalPrice+=subTotal;
		c.setGrandTotal(totalPrice);
		int items=c.getItemCounts();
		items+=1;
		c.setItemCounts(items);
		
		//update cartitem instance
		ci.setCart(c);
		ci.setQuantity(q);
		ci.setTotalPrice(subTotal);
		ci.setProduct(productDAO.getProduct(id));
		
		//updating product instance
//		int i_q=p.getProductQuantity();
//		int f_q=i_q-quantity;
//		p.setProductQuantity(f_q);
		
		//adding cart item
		cartItemDAO.addCartItem(ci);
		
		//updating cart
		cartItemDAO.updateCart(c);
		
		//updating product
		//productDAO.updateProducts(p);
		
		model =new ModelAndView("page");
		model.addObject("title","View All Products");
		model.addObject("userClickProducts","true");
		model.addObject("product",new Product());
		model.addObject("list",productDAO.getAllProducts());
		}
		else
		{
			model=new ModelAndView("login");
		}
		return model;
	}
}
