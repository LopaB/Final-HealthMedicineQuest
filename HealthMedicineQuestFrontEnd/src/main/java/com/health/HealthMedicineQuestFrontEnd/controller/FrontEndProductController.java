package com.health.HealthMedicineQuestFrontEnd.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@RequestMapping(value={"productCRUD"})
	public ModelAndView productcrud(){
		ModelAndView model =new ModelAndView("page");
		model.addObject("title","Product Management");
		model.addObject("userClickProductCRUD","true");
		model.addObject("product",new Product());
		model.addObject("productList",productDAO.getAllProducts());
		return model;
	}
	
	@RequestMapping(value="/productData.do", method=RequestMethod.POST)
	private String doActions(@Valid Product productV, @ModelAttribute("product") Product product, BindingResult result, @RequestParam String action, Model model) {
		Product productResult=new Product();
		switch(action.toLowerCase()){
			case "add":
				productDAO.addProducts(product);
				productResult=product;
				break;
			case "update":
				productDAO.updateProducts(product);
				productResult=product;
				break;
			case "delete":
				productDAO.deleteProducts(product.getProductId());
				productResult=product;
				break;
			case "search":
				Product searchedProduct=productDAO.getProduct(product.getProductId());
				productResult=searchedProduct!=null?searchedProduct:new Product();
				break;
		}
		model.addAttribute("product", productResult);
		model.addAttribute("productList",productDAO.getAllProducts());
		return "redirect:productCRUD";
	}

}
