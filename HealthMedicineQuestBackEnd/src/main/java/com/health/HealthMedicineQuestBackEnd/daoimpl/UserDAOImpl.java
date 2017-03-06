package com.health.HealthMedicineQuestBackEnd.daoimpl;

import java.util.ArrayList;
import java.util.List;

import com.health.HealthMedicineQuestBackEnd.model.User;
import com.health.HealthMedicineQuestBackEnd.dao.IUserDAO;;

public class UserDAOImpl implements IUserDAO{
	public List<User> getAllUsers(){
		return new ArrayList<User>();
	}
	public User getUser(int id){
		return new User();
	}
	
	public boolean addUser(User u){
		return false;
		
	}
	public boolean updateUser(User u){
		return false;
	}
	public boolean deleteUser(int userId){
		return false;
	}
}
