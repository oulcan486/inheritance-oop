
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee=new Employee();
		employee.firstName="Hakan";
		Customer customer=new Customer();
		customer.firstName="Mehmet";
		System.out.println(customer.firstName);
		
		CustomerManager customerManager=new CustomerManager();
		EmployeeManager employeeManager=new EmployeeManager();
		
		employeeManager.BestEmployee();

	}

}
