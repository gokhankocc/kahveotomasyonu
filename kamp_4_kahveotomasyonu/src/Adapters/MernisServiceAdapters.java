package Adapters;

import java.rmi.RemoteException;
import Entities.Customer;
import kamp_4_kahveotomasyonu.Interfaces.ICustomerCheckServices;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapters implements ICustomerCheckServices{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		// TODO Auto-generated method stub
		KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();
		try {
			kpsPublic.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), customer.getFirstname(),customer.getLastname(),customer.getDateofbirth());
			
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
		
		
	}
	/*@Override
	public boolean CheckIfRealPerson(Customer customer) {   Long.parseLong("54184580926"),"GÖKHAN","KOÇ", 2000
		return true;
		
	}*/

}
