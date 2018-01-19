
public class Entry
{

	public static void main(String[] args)
	{
		EmployeeDatabase db = EmployeeDatabase.getInstance();

		System.out.println("Total number of employees created : " + Employee.GetEmployeeCount());

		Employee e1 = new Employee("aaa", "bbb", 3000.0, 'B', new Date(1991, 10, 1));
		// e1.PrintEmployeeDetails();

		Employee e2 = new Employee("aaa2", "bbb2", 3000.0, 'B', new Date(1991, 10, 1));
		e2.PrintEmployeeDetails();

		Employee e3 = new PermanentEmployee("aaa3", "bbb3", 3000.0, 'B', new Date(1991, 10, 1));
		// e3.PrintEmployeeDetails();

		System.out.println("Total number of employees created : " + Employee.GetEmployeeCount());

		Employee e4 = new PermanentEmployee("aaa4", "bbb4", 3000.0, 'B', new Date(1991, 10, 1));
		// e4.PrintEmployeeDetails();

		Employee e5 = new Employee("aaa5", "bbb5", 3000.0, 'B', new Date(1991, 10, 1));
		// e5.PrintEmployeeDetails();

		System.out.println("Total number of employees created : " + Employee.GetEmployeeCount());

		Employee e6 = new Employee();

		System.out.println("Total number of employees created : " + Employee.GetEmployeeCount());

		Employee e7 = new PermanentEmployee("aaa7", "bbb7", 3000.0, 'B', new Date(1991, 10, 1));

		Employee e8 = new PermanentEmployee("aaa8", "bbb8", 3000.0, 'B', new Date(1991, 10, 1));

		Employee e9 = new PermanentEmployee("aaa9", "bbb9", 3000.0, 'B', new Date(1991, 10, 1));

		System.out.println("Total number of employees created : " + Employee.GetEmployeeCount());
		System.out.println("Total number of perm employees created : " + PermanentEmployee.getCount());

		Contractor c1 = new Contractor("c0", "d0");

		Employee e10 = new ContractEmployee("ce1", "ce1", 'B', new Date(1991, 10, 1), c1, 30.0);
		Employee e11 = new ContractEmployee("ce2", "ce2", 'B', new Date(1991, 10, 1), c1, 30.0);

		db.addEmployee(e1);
		db.addEmployee(e2);
		db.addEmployee(e3);
		// db.addEmployee(e4);
		db.addEmployee(e5);
		db.addEmployee(e6);
		db.addEmployee(e7);
		db.addEmployee(e8);
		db.addEmployee(e9);
		db.addEmployee(e10);
		db.addEmployee(e11);

		System.out.println("Total number of contract employees created : " + ContractEmployee.getCount());

		try
		{
			db.searchEmployee(3).PrintEmployeeDetails();
		}
		catch (EmployeeNotFoundException e)
		{
			e.printStackTrace();
		}
	}

}
