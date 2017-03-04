package com.health.HealthMedicineQuestBackEnd.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.health.HealthMedicineQuestBackEnd.dao.IProductDAO;
import com.health.HealthMedicineQuestBackEnd.model.Product;

@Repository("productDAO")
@Transactional(propagation=Propagation.SUPPORTS, readOnly=false)
public class ProductDAOImpl implements IProductDAO{
	@Autowired
	SessionFactory sessionFactory;

	public List<Product> getAllProducts() {
		return sessionFactory.openSession().createQuery("from Product", Product.class).getResultList();
	}
	
	 public Product getProduct(int id){ 
		 List<Product> prod =new ArrayList<Product>();
		 prod=getAllProducts();
		 return prod.get(id);
		  
	 }
	 
	 public boolean addProducts(Product p)
	 {	try{
		 			sessionFactory.openSession().persist(p);
		 			return true;
		 	}
		 	catch(Exception e){
		 		e.printStackTrace();
		 		return false;
		 	}
	 }
}

