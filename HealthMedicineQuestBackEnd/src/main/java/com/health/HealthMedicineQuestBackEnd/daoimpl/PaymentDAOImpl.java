package com.health.HealthMedicineQuestBackEnd.daoimpl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.health.HealthMedicineQuestBackEnd.dao.IPaymentDAO;
import com.health.HealthMedicineQuestBackEnd.model.Payment;
import com.health.HealthMedicineQuestBackEnd.model.User;

public class PaymentDAOImpl implements IPaymentDAO{

    @Autowired
    SessionFactory sessionFactory;
    
    @Override
    public Payment getPaymentDetails(User u) {
          return (Payment)sessionFactory.getCurrentSession().createQuery("from Payment where user=:u").setParameter("user",u).getSingleResult();
    }

    @Override
    public boolean addPayment(Payment p) {
          try {
                 sessionFactory.getCurrentSession().save(p);
                 return true;
          } catch (Exception e) {
                 e.printStackTrace();
                 return false;
          }
    }
    

}

