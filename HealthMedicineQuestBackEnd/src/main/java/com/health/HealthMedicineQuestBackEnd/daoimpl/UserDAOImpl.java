package com.health.HealthMedicineQuestBackEnd.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.health.HealthMedicineQuestBackEnd.model.Product;
import com.health.HealthMedicineQuestBackEnd.model.User;
import com.health.HealthMedicineQuestBackEnd.dao.IUserDAO;;
@Repository("userDAO")
@Transactional
public class UserDAOImpl implements IUserDAO{
	@Autowired
	SessionFactory sessionFactory;

	public List<User> getAllUsers(){
		return sessionFactory.getCurrentSession().createQuery("from User", User.class).getResultList();
	}
	public User getUser(int id){
		return sessionFactory.getCurrentSession().get(User.class,Integer.valueOf(id));
	}
	
	public boolean addUser(User u){
		try {
			sessionFactory.getCurrentSession().persist(u);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}
	public boolean updateUser(User u){
		try {
			sessionFactory.getCurrentSession().update(u);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	public boolean deleteUser(int userId){
		try {
			sessionFactory.getCurrentSession().delete(getUser(userId));
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}
