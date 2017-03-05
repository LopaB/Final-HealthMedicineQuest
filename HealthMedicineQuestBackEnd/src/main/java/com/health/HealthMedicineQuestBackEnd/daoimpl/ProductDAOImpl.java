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
@Transactional
public class ProductDAOImpl implements IProductDAO {
	@Autowired
	SessionFactory sessionFactory;

	public List<Product> getAllProducts() {
		return sessionFactory.getCurrentSession().createQuery("from Product", Product.class).getResultList();
	}

	public Product getProduct(int id) {
		return sessionFactory.getCurrentSession().get(Product.class,Integer.valueOf(id));

	}

	public boolean addProducts(Product p) {
		try {
			sessionFactory.getCurrentSession().persist(p);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	public boolean updateProducts(Product p){
		try {
			sessionFactory.getCurrentSession().update(p);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	public boolean deleteProducts(int productId){
		try {
			sessionFactory.getCurrentSession().delete(getProduct(productId));
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}
