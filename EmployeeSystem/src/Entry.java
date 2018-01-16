
public class Entry {

	public static void main(String[] args) {
		
		System.out.println("Total number of employees created : " + Employee.GetEmployeeCount());
		
		Employee e1 = new Employee("aaa", "bbb", 3000.0f, 'B', "mmm:yyyy");
		//e1.PrintEmployeeDetails();
				
		Employee e2 = new Employee("aaa2", "bbb2", 3000.0f, 'B', "mmm:yyyy");
		e2.PrintEmployeeDetails();
				
		Employee e3 = new Employee("aaa3", "bbb3", 3000.0f, 'B', "mmm:yyyy");
		//e3.PrintEmployeeDetails();
		
		System.out.println("Total number of employees created : " + Employee.GetEmployeeCount());
		
		Employee e4 = new Employee("aaa4", "bbb4", 3000.0f, 'B', "mmm:yyyy");
		//e4.PrintEmployeeDetails();
		
		Employee e5 = new Employee("aaa5", "bbb5", 3000.0f, 'B', "mmm:yyyy");
		//e5.PrintEmployeeDetails();
		
		System.out.println("Total number of employees created : " + Employee.GetEmployeeCount());
		
		Employee e6 = new Employee();
		
		System.out.println("Total number of employees created : " + Employee.GetEmployeeCount());
		
		
	}

}
