import program.Abstract.BaseCustomerManager;
import program.Concrete.NeroCustomerManager;
import program.Entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new NeroCustomerManager();
		customerManager.save(new Customer(1,"Engin" , "Demiroð" ,1985,287845));
		System.out.println();

	}
	}

