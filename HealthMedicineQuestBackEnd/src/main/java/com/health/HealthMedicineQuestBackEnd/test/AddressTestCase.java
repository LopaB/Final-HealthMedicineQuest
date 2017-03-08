package com.health.HealthMedicineQuestBackEnd.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.health.HealthMedicineQuestBackEnd.dao.IAddressDAO;

import com.health.HealthMedicineQuestBackEnd.model.Address;
public class AddressTestCase {
	private static AnnotationConfigApplicationContext context;
	private static IAddressDAO addressDAO;
	
	private Address address;
	@BeforeClass
	public static void init(){
	context=new AnnotationConfigApplicationContext();
	context.scan("com.health.HealthMedicineQuestBackEnd");
	context.refresh();
	
	addressDAO=(IAddressDAO)context.getBean("addressDAO");
	
	}
//	@Test
//	public void testAddAddress(){
//		address=new Address();
//		address.setAddAddress1("8, Balaji Estate");
//		address.setAddAddress2("Kalkaji");
//		address.setAddCity("Delhi");
//		address.setAddCountry("India");
//		address.setAddState("Delhi");
//		address.setAddZip("110019");
//		address.setUserId(2);
//		assertEquals("Successfully added an address inside the table!", true, addressDAO.addAddress(address));
//	}
	
//	@Test
//	public void testGetAddress(){
//		address=addressDAO.getAddress(1);
//		assertEquals("Successfully added a address inside the table!", "8, Balaji Estate", address.getAddAddress1());
//	}
//	
	//@Test
//	public void testUpdateAddress(){
//		address=addressDAO.getAddress(1);
//		
//		address.setAddAddress1("8, Balaji Estate");
//	address.setAddAddress2("Guru Ravidas Marg");
//	address.setAddCity("Delhi");
//	address.setAddCountry("India");
//	address.setAddState("Delhi");
//	address.setAddZip("110019");
//		assertEquals("Successfully updated a address inside the table!", true, addressDAO.updateAddress(address));
//	
//	}
//	
//	@Test
//	public void testDeleteAddress(){
//		assertEquals("Successfully deleted a address from the table!", true, addressDAO.deleteAddress(1));
//	
//	}


}
