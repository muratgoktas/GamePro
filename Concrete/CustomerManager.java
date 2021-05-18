import com.sun.tools.sjavac.comp.dependencies.PublicApiCollector;

public class CustomerManager extends BaseManager {

	private ICustomerCheckService customerCheckService;

	public CustomerManager(ICustomerCheckService customerCheckServicer) {
		this.customerCheckService = customerCheckServicer;
	}

	public void add(Customer customer) throws Exception {
		if (customerCheckService.checkIfRealPerson(customer)) {
			System.out.println(customer.getFirstName() + " added.");
		} else {
			System.out.println("The customer could not be created.");
		}
	}

	@Override
	public void update(Customer customer) throws Exception {
		System.out.println(customer.getCode() + "-" + customer.getFirstName() + " müþteri güncellendi. ");

	}

	@Override
	public void delete(Customer customer) throws Exception {
		System.out.println(customer.getCode() + "-" + customer.getFirstName() + " müþteri silimdi. ");

	}

	@Override
	public void getData(Customer customer) throws Exception {
		System.out.println(customer.getCode() + "-" + customer.getFirstName() + " müþteri listelendi. ");

	}

}
