public class Entry
{

	public static void main(String[] args)
	{
		EmployeeDatabase db = EmployeeDatabase.getInstance();

		System.out.println("Total number of employees created : " + Employee.GetEmployeeCount());

		Employee e1 = new ProjectManager("aaa", "bbb", 3000.0, 'B', new Date(1991, 10, 1));
		// e1.PrintEmployeeDetails();

		Employee e2 = new ProjectManager("aaa2", "bbb2", 3000.0, 'B', new Date(1991, 10, 1));
		System.out.println(e2);

		Employee e3 = new TechnicalAssociate("aaa3", "bbb3", 3000.0, 'B', new Date(1991, 10, 1));
		// e3.PrintEmployeeDetails();

		System.out.println("Total number of employees created : " + Employee.GetEmployeeCount());

		Employee e4 = new ProjectManager("aaa4", "bbb4", 3000.0, 'B', new Date(1991, 10, 1));
		// e4.PrintEmployeeDetails();

		Employee e5 = new TechnicalAssociate("aaa5", "bbb5", 3000.0, 'B', new Date(1991, 10, 1));
		// e5.PrintEmployeeDetails();

		System.out.println("Total number of employees created : " + Employee.GetEmployeeCount());

		Employee e6 = new TechnicalAssociate("aaa6", "bbb6", 3000.0, 'B', new Date(1991, 10, 1));

		System.out.println("Total number of employees created : " + Employee.GetEmployeeCount());

		Employee e7 = new ProjectManager("aaa7", "bbb7", 3000.0, 'B', new Date(1991, 10, 1));

		Employee e8 = new TechnicalAssociate("aaa8", "bbb8", 3000.0, 'B', new Date(1991, 10, 1));

		Employee e9 = new TechnicalAssociate("aaa9", "bbb9", 3000.0, 'B', new Date(1991, 10, 1));

		System.out.println("Total number of employees created : " + Employee.GetEmployeeCount());
		System.out.println("Total number of perm employees created : " + PermanentEmployee.getCount());

		Contractor c1 = new Contractor("c0", "d0", 30.0);

		Contractor.ContractEmployee ce1 = c1.new ContractEmployee("ce1", "ce1", 'B', new Date(1991, 10, 1));
		Contractor.ContractEmployee ce2 = c1.new ContractEmployee("ce2", "ce2", 'B', new Date(1991, 10, 1));
		// c1.addEmployee("ce1", "ce1", 'B', new Date(1991, 10, 1), 30.0);
		// c1.addEmployee("ce2", "ce2", 'B', new Date(1991, 10, 1), 30.0);
		System.out.println("------------------------------");
		ce1.setHoursWorked(2);
		System.out.println(c1);
		System.out.println("Total number of contract employees created : " + Contractor.getEmployeeCount());

		System.out.println("------------------------------");

		System.out.println(c1);

		System.out.println("------------------------------");

		db.addEmployee(e1);
		db.addEmployee(e2);
		db.addEmployee(e3);
		db.addEmployee(e4);
		db.addEmployee(e5);
		db.addEmployee(e6);
		db.addEmployee(e7);
		db.addEmployee(e8);
		db.addEmployee(e9);

		// try
		// {
		// db.searchEmployee(3).PrintEmployeeDetails();
		// }
		// catch (EmployeeNotFoundException e)
		// {
		// e.printStackTrace();
		// }
	}

}
