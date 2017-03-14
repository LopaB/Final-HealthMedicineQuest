package com.health.HealthMedicineQuestFrontEnd.controller;

import java.io.File;
import java.security.Principal;
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

import com.health.HealthMedicineQuestBackEnd.dao.ICartItemDAO;
import com.health.HealthMedicineQuestBackEnd.dao.IProductDAO;
import com.health.HealthMedicineQuestBackEnd.dao.IUserDAO;
import com.health.HealthMedicineQuestBackEnd.model.Cart;
import com.health.HealthMedicineQuestBackEnd.model.CartItem;
import com.health.HealthMedicineQuestBackEnd.model.Product;
import com.health.HealthMedicineQuestBackEnd.model.User;

@Controller
public class FrontEndProductController {
	@Autowired
	private IProductDAO productDAO;
	@Autowired
	private IUserDAO userDAO;
	
	@Autowired
	HttpServletRequest request;
	@Autowired
	ICartItemDAO cartItemDAO;
	
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
	
	@RequestMapping(value={"/user/cart"})
	public ModelAndView cart(Principal principal){
		ModelAndView model =new ModelAndView("page");
		User user=userDAO.getUserByUserName(principal.getName());
		Cart cart=user.getCart();
		model.addObject("userClickCart","true");
		model.addObject("user","true");
		model.addObject("cartItem",new CartItem());
		model.addObject("prod", cartItemDAO.getAllCartItem(cart));
		return model;
	}
	
	@RequestMapping("/admin/update/{productId}")
    public ModelAndView update(@PathVariable("productId") int id) {
                   ModelAndView model = new ModelAndView("productUpdate");
                   Product product=productDAO.getProduct(id);
                  
                   model.addObject("product",product);
                  
                   return model;
    }

	@RequestMapping("/delete/{productId}/productD")
    public ModelAndView delete(@PathVariable("productId") int id) {
                   ModelAndView model = new ModelAndView("page");
                   productDAO.deleteProducts(id);
                   model.addObject("productList", productDAO.getAllProducts());
                   model.addObject("product", new Product());
                   model.addObject("title", "Product Management");
                   model.addObject("userClickProductCRUD", true);
                   return model;
    }
	
	@RequestMapping(value={"/user/{productId}/singleproduct"})
	public ModelAndView product(@PathVariable("productId")int id){
		ModelAndView model =new ModelAndView("singleProduct");
		model.addObject("userClickSingleProduct","true");
		model.addObject("user","true");
		model.addObject("product",new Product());
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
	
	
	@RequestMapping(value="/admin/productData.do", method=RequestMethod.POST)
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
				if(!(product.getFile().getOriginalFilename().equals(""))){
					product.setImageUrl(uploadImage(product.getFile()));
				}
				productDAO.updateProducts(product);
				productResult=product;
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
