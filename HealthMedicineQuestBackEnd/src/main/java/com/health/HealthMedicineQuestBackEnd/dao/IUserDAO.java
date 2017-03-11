package com.health.HealthMedicineQuestBackEnd.dao;

import java.util.List;

import com.health.HealthMedicineQuestBackEnd.model.Address;
import com.health.HealthMedicineQuestBackEnd.model.Cart;
import com.health.HealthMedicineQuestBackEnd.model.User;

public interface IUserDAO{
	public List<User> getAllUsers();
	public User getUser(int id);
	public User getUserByUserName(String userName);
	
	public boolean addUser(User u);
	public boolean updateUser(User u);
	public boolean deleteUser(int userId);	
	public boolean addUserAddress(Address address);
	public boolean addUserCart(Cart cart);

}
