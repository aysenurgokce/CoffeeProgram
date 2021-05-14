package program.Adapters;

import program.Abstract.ICustomerCheckService;
import program.Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ICustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		try {
			return client.TCKimlikNoDogrula(customer.NationalityId,customer.firstName,customer.lastName,customer.dateOfBirt);	
			}catch (Exception e) {
				System.out.println("Not a valid natioanlity id.");
			}
		return false;
		}

		
	}


