package program.Abstract;

import program.Entities.Customer;

public abstract class BaseCustomerManager implements ICustomerService{

	@Override
	public void save(Customer customer) {
		System.out.println("Save to database : " + customer.firstName);
		
	}

}
