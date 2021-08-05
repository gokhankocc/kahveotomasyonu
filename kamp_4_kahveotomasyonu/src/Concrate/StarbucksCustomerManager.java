package Concrate;

import Entities.Customer;
import kamp_4_kahveotomasyonu.Interfaces.BaseCustomerManager;
import kamp_4_kahveotomasyonu.Interfaces.ICustomerCheckServices;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	private ICustomerCheckServices checkServices;
	
	public StarbucksCustomerManager(ICustomerCheckServices checkServices) {
		super();
		this.checkServices = checkServices;
	}
	
	@Override
	public void save(Customer customer) {
		
		if(checkServices.CheckIfRealPerson(customer)) {
			
			super.save(customer);
		}
		else {
			System.out.println("not a valid person");
		}
		
		
		
	}
}
