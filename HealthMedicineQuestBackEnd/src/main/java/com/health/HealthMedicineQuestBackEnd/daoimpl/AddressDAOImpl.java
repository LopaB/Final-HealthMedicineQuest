package com.health.HealthMedicineQuestBackEnd.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.health.HealthMedicineQuestBackEnd.dao.IAddressDAO;
import com.health.HealthMedicineQuestBackEnd.model.Address;
import com.health.HealthMedicineQuestBackEnd.model.User;

@Repository("addressDAO")
@Transactional
public class AddressDAOImpl implements IAddressDAO{
	@Autowired
	SessionFactory sessionFactory;
	public List<Address> getAllAddress(){
		return sessionFactory.getCurrentSession().createQuery("from Address", Address.class).getResultList();
	}
	public Address getAddress(int id){
		return sessionFactory.getCurrentSession().get(Address.class,Integer.valueOf(id));
	}
	public Address getAddressByUser(User user){
		return (Address)sessionFactory.getCurrentSession().createQuery("from Address where user=:user").setParameter("user",user).getResultList().get(0);
	}
	public boolean addAddress(Address a){
		try {
			sessionFactory.getCurrentSession().save(a);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	public boolean updateAddress(Address a){
		try {
			sessionFactory.getCurrentSession().update(a);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	public boolean deleteAddress(int addressId){
		try {
			sessionFactory.getCurrentSession().delete(getAddress(addressId));
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}
