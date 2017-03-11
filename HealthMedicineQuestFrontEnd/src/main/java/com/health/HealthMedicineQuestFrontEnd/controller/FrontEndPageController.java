package com.health.HealthMedicineQuestFrontEnd.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.health.HealthMedicineQuestBackEnd.dao.IUserDAO;
import com.health.HealthMedicineQuestBackEnd.model.User;

@Controller
public class FrontEndPageController {
	
	@Autowired
	private IUserDAO userDAO;
	
	@RequestMapping(value={"/","/home","/index"})
	public ModelAndView index(){
		ModelAndView model =new ModelAndView("page");
		
		model.addObject("title","Home");
		
		model.addObject("userClickHome","true");
		return model;
	}
	
	
	
//	@RequestMapping("/")
//	public String index(Principal principal, Model model){
//		String status="null";
//		if(principal!=null){
//			User user=userDAO.getUserByUserName(principal.getName());
//			if(user.getRole().equals("ADMIN")){
//				status= "redirect:/admin/page";
//			}
//			else{
//				status= "page";
//			}
//		}
//		return status;
//	}
	
	@RequestMapping(value={"about"})
	public ModelAndView about(){
		ModelAndView model =new ModelAndView("page");
		model.addObject("title","About Us");
		model.addObject("userClickAbout","true");
		return model;
	}
	@RequestMapping(value={"contact"})
	public ModelAndView contact(){
		ModelAndView model =new ModelAndView("page");
		model.addObject("title","Contact Us");
		model.addObject("userClickContact","true");
		return model;
	}
	@GetMapping(value={"login"})
	public String login(@RequestParam(value = "error", required = false)String error, Model model){
		if(error!=null) {
			model.addAttribute("error","Authentication Failed - Invalid credentials!");
			}
			//model.addAttribute("title", "page");
			model.addAttribute("title", "model");
			return "login";

	}
	
	

}
