package com.health.HealthMedicineQuestFrontEnd.controller;

import java.io.File;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.health.HealthMedicineQuestBackEnd.dao.IProductDAO;
import com.health.HealthMedicineQuestBackEnd.model.Product;

@Controller
public class FrontEndProductController {
	@Autowired
	private IProductDAO productDAO;
	@Autowired
	HttpServletRequest request;
	
	@RequestMapping(value={"/user/products"})
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
	
	@RequestMapping(value={"/user/product"})
	public ModelAndView product(@PathVariable("id")int id){
		ModelAndView model =new ModelAndView("page");
		model.addObject("userClickProduct","true");
		model.addObject("prod", productDAO.getProduct(id));
		return model;
	}
	
	@RequestMapping(value={"/admin/productCRUD"})
	public ModelAndView productcrud(){
		ModelAndView model =new ModelAndView("page");
		model.addObject("title","Product Management");
		model.addObject("userClickProductCRUD","true");
		model.addObject("product",new Product());
		model.addObject("productList",productDAO.getAllProducts());
		return model;
	}
	
	
	@RequestMapping(value="/productData.do", method=RequestMethod.POST)
	private ModelAndView doActions(@ModelAttribute("product") @Valid Product product,BindingResult result, @RequestParam String action) {
		
		Product productResult=new Product();
		 if(result.hasErrors()) {
			 ModelAndView model1 =new ModelAndView("page");
				model1.addObject("title","Product Management");
				model1.addObject("userClickProductCRUD","true");
             return model1;
     }
		
		switch(action.toLowerCase()){
			case "add":
				if(!(product.getFile().getOriginalFilename().equals(""))){
					product.setImageUrl(uploadImage(product.getFile()));
				}
				System.out.println("Image uploaded");
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
		ModelAndView model1 =new ModelAndView("page");
		model1.addObject("title","Product Management");
		model1.addObject("userClickProductCRUD","true");
		model1.addObject("product", productResult);
		model1.addObject("productList",productDAO.getAllProducts());
		return model1;
	}
	protected String uploadImage(MultipartFile multipart){
		System.out.println("Method reached");
		String folderToUpload="/resources/images/";
		String fileName=multipart.getOriginalFilename();
		String realPath=request.getServletContext().getRealPath(folderToUpload);
		if(!new File(realPath).exists()){
			new File(realPath).mkdirs();
		}
		String filePath=realPath+fileName;
		File destination=new File(filePath);
		try{
			multipart.transferTo(destination);
		}
		catch(Exception e){
			
		}
		return fileName;
	}

}
