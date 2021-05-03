package Concrete;
import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{

	private CustomerCheckService customerCheckService;
	
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}


	@Override
	public void save(Customer customer) {
		if(customerCheckService.checkIfRealPerson(customer)) {
			System.out.println("Saved Database." + customer.getFirstName() 
			+" " + customer.getLastName());;
		}else {
			System.out.println("Not a real person!" + customer.getFirstName() + " " + customer.getLastName());
		}
			
		
		
	}

}