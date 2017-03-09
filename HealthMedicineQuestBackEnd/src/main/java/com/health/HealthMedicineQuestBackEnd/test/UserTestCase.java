package com.health.HealthMedicineQuestBackEnd.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.health.HealthMedicineQuestBackEnd.dao.IUserDAO;
import com.health.HealthMedicineQuestBackEnd.model.User;

public class UserTestCase {
	private static AnnotationConfigApplicationContext context;
	private static IUserDAO userDAO;
	private User user;
	
	@BeforeClass
	public static void init(){
		context=new AnnotationConfigApplicationContext();
		context.scan("com.health.HealthMedicineQuestBackEnd");
		context.refresh();
		
		userDAO=(IUserDAO)context.getBean("userDAO");
		
	}
	
//	@Test
//	public void testAddUser(){
//		user=new User();
//		user.setUserName("LopaB");
//		user.setPassword("lopab");
//		user.setUserConfirmPassword("lopab");
//		user.setUserEmail("pinkfriend@gmail.com");
//		user.setUserPhoneNumber("9339901411");
//		user.setRole("user");
//		user.setUserQuestion("What is your nick name?");
//		user.setUserAnswer("pinky");
//		assertEquals("Successfully added a user inside the table!", true, userDAO.addUser(user));
//	}
	
//	@Test
//	public void testGetUser(){
//		user=userDAO.getUser(1);
//		assertEquals("Successfully added a user inside the table!", "LopaB", user.getUserName());
//	}
	
//	@Test
//	public void testUpdateUser(){
//		user=userDAO.getUser(1);
//		//assertEquals("Successfully added a user inside the table!", "LopaB", user.getUserName());
//		//user=new User();
//		user.setUserName("LopaB");
//		user.setPassword("lopabm");
//		user.setUserConfirmPassword("lopabm");
//		user.setUserEmail("pinkfriend@gmail.com");
//		user.setUserPhoneNumber("9339901411");
//		user.setRole("user");
//		user.setUserQuestion("What is your nick name?");
//		user.setUserAnswer("pinky");
//		assertEquals("Successfully updated a user inside the table!", true, userDAO.updateUser(user));
//	
//	}
	
//	@Test
//	public void testDeleteUser(){
//		assertEquals("Successfully deleted a user from the table!", true, userDAO.deleteUser(1));
//	
//	}

}
