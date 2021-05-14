package program.Concrete;

import program.Abstract.ICustomerCheckService;
import program.Entities.Customer;


public class CustomerCheckManager implements ICustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
		return true;
	}

}
