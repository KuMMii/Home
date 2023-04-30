package object_oriented_programming;

public class CustomerRunner {

	public static void main(String[] args) {
		
		Address homeAddress= new Address("line 1", "Hyderabad", "49932");
		Customer customer = new Customer("Ranga", homeAddress);
		System.out.println(customer);

		Address workAddress = new Address("line 1 for work", "Hyderabad", "23313");
		customer.setWorkAddress(workAddress);
		
		System.out.println(customer);
	}

}
