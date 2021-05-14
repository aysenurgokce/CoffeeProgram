package program.Concrete;

import program.Abstract.BaseCustomerManager;
import program.Abstract.ICustomerCheckService;
import program.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager  { 
	private ICustomerCheckService _customerCheckService;
	
	public StarbucksCustomerManager (ICustomerCheckService customerCheckService) {
		_customerCheckService = customerCheckService;
	}
	
	@Override
	public void save(Customer customer)  {
		if(_customerCheckService.CheckIfRealPerson(customer)) {
			
		super.save(customer);
		
		}else {
			System.out.println("Not a valid person");
		
		}
	}
}
