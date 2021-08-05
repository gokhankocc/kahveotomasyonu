package kamp_4_kahveotomasyonu.Interfaces;

import Entities.Customer;

public abstract class BaseCustomerManager implements ICustomerService{

	@Override
	public void save(Customer customer) {
		
		System.out.println("saved database : "+customer.getFirstname());
		
	}
	

}
