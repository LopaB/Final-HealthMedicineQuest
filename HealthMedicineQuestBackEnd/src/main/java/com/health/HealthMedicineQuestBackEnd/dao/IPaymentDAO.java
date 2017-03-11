package com.health.HealthMedicineQuestBackEnd.dao;

import com.health.HealthMedicineQuestBackEnd.model.Payment;
import com.health.HealthMedicineQuestBackEnd.model.User;

public interface IPaymentDAO {
	public Payment getPaymentDetails(User u);
    public boolean addPayment(Payment p);

}
