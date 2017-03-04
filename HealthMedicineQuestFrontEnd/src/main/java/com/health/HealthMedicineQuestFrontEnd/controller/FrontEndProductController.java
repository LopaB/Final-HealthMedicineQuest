package com.health.HealthMedicineQuestFrontEnd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.health.HealthMedicineQuestBackEnd.dao.IProductDAO;
import com.health.HealthMedicineQuestBackEnd.model.Product;

@Controller
public class FrontEndProductController {
	@Autowired
	private IProductDAO productDAO;
	
	@RequestMapping(value={"products"})
	public ModelAndView products(){
		ModelAndView model =new ModelAndView("page");
		model.addObject("title","View All Products");
		model.addObject("userClickProducts","true");
		model.addObject("list",productDAO.getAllProducts());
		return model;
	}
		
	@RequestMapping("/allproducts")
	public @ResponseBody List<Product> allproducts(){
		return productDAO.getAllProducts();
	}
	
	@RequestMapping(value={"/product"})
	public ModelAndView product(@PathVariable("id")int id){
		ModelAndView model =new ModelAndView("page");
		model.addObject("userClickProduct","true");
		model.addObject("prod", productDAO.getProduct(id));
		return model;
	}

}
