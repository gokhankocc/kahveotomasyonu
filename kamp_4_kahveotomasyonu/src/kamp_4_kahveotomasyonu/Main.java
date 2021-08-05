package kamp_4_kahveotomasyonu;

import Adapters.MernisServiceAdapters;
import Concrate.NeroCustomerManager;
import Concrate.StarbucksCustomerManager;
import Entities.Customer;
import kamp_4_kahveotomasyonu.Interfaces.BaseCustomerManager;

public class Main {

	public static void main(String[] args) {
		
		/*BaseCustomerManager baseCustomerManager = new NeroCustomerManager();
		//baseCustomerManager.save(new Customer(61,"gökhan","koç","1901001104454","20/07/2000"));
		Customer customer=new Customer(61,"GÖKHAN","KOÇ","56521486465",2000);
		baseCustomerManager.save(customer);//13. satýrýn aynýsý (zehra)*/
		
		BaseCustomerManager baseCustomerManager2 = new StarbucksCustomerManager(new MernisServiceAdapters());
		Customer customer2 = new Customer();
		customer2.setId(14);
		customer2.setFirstname("Zehra");
		customer2.setLastname("Eryoldaþ");
		customer2.setNationalityId("52545656682");
		customer2.setDateofbirth(2000);
		baseCustomerManager2.save(customer2);
		System.out.println(customer2.getLastname()+customer2.getNationalityId()+customer2.getFirstname()+customer2.getDateofbirth());
		System.out.println(customer2.getFirstname());

	}

}
