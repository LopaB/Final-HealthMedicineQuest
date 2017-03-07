package com.health.HealthMedicineQuestFrontEnd.controller;

import java.io.File;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.web.servlet.ModelAndView;

import com.health.HealthMedicineQuestBackEnd.dao.IUserDAO;
import com.health.HealthMedicineQuestBackEnd.model.Product;
import com.health.HealthMedicineQuestBackEnd.model.User;

@Controller
public class FrontEndUserController {
	@Autowired
	private IUserDAO userDAO;
	
	@RequestMapping(value={"register"})
	public ModelAndView register(){
		ModelAndView model =new ModelAndView("page");
		model.addObject("title","Register");
		model.addObject("userClickRegister","true");
		model.addObject("user",new User());
		return model;
	}
		
//	@RequestMapping("/allusers")
//	public @ResponseBody List<User> alluser(){
//		return userDAO.getAllUser();
//	}
	
	
	
//	@RequestMapping(value={"userCRUD"})
//	public ModelAndView usercrud(){
//		ModelAndView model =new ModelAndView("page");
//		model.addObject("title","User Management");
//		model.addObject("userClickUserCRUD","true");
//		model.addObject("user",new User());
//		//model.addObject("userList",userDAO.getAllUser());
//		return model;
//	}
	
	
	@RequestMapping(value="/userData.do", method=RequestMethod.POST)
	private ModelAndView doActions(@ModelAttribute("user") @Valid User user,BindingResult result) {
		
		
		 if(result.hasErrors()) {
			 ModelAndView model1 =new ModelAndView("page");
				model1.addObject("title","Register");
				model1.addObject("userClickRegister","true");
             return model1;
     }
		 userDAO.addUser(user);
		
		ModelAndView model1 =new ModelAndView("page");
		model1.addObject("title","Home");
		model1.addObject("userClickHome","true");
		model1.addObject("user",new User());
		
		return model1;
	}
	


}
