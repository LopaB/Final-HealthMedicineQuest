package com.health.HealthMedicineQuestBackEnd.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.health.HealthMedicineQuestBackEnd.dao.ICategoryDAO;
import com.health.HealthMedicineQuestBackEnd.model.Category;

@Repository("categoryDAO")
@Transactional(propagation=Propagation.SUPPORTS, readOnly=false)
public class CategoryDAOImpl implements ICategoryDAO{
	
	@Autowired
	SessionFactory sessionFactory;
	public List<Category> getAllCategory()
	{
		return sessionFactory.openSession().createQuery("from Category", Category.class).getResultList();
	}

}
