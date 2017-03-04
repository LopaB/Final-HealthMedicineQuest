package com.health.HealthMedicineQuestBackEnd.dao;

import java.util.List;

import com.health.HealthMedicineQuestBackEnd.model.Product;

public interface IProductDAO {
	public List<Product> getAllProducts();
	public Product getProduct(int id);
}
