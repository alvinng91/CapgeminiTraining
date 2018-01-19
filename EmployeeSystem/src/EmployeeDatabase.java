
public class EmployeeDatabase
{
	private static EmployeeDatabase employeeDatabase;
	private Employee[] employees;

	private EmployeeDatabase()
	{
		employees = new Employee[100];
	}

	public void addEmployee(Employee employee)
	{
		// employees[employee.getId()] = employee;
		for (int i = 0; i < employees.length; ++i)
		{
			if (employees[i] == null)
			{
				employees[i] = employee;
				break;
			}
		}
	}

	public Employee searchEmployee(int employeeId) throws EmployeeNotFoundException
	{
		for (int i = 0; i < employees.length; ++i)
		{
			if (employees[i] != null && employees[i].getId() == employeeId)
				return employees[i];
		}
		throw new EmployeeNotFoundException();
	}

	public static EmployeeDatabase getInstance()
	{
		if (employeeDatabase == null)
			employeeDatabase = new EmployeeDatabase();

		return employeeDatabase;
	}
}
