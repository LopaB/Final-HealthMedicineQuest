package com.health.HealthMedicineQuestBackEnd.dao;

import java.util.List;

import com.health.HealthMedicineQuestBackEnd.model.Address;
import com.health.HealthMedicineQuestBackEnd.model.User;

public interface IAddressDAO {
	public List<Address> getAllAddress();
	public Address getAddress(int id);
	public Address getAddressByUser(User user);
	public boolean addAddress(Address a);
	public boolean updateAddress(Address a);
	public boolean deleteAddress(int addressId);	
}
