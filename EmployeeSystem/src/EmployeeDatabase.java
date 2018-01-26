import java.util.ArrayList;
import java.util.ListIterator;

public class EmployeeDatabase
{
	private static EmployeeDatabase employeeDatabase;
	// private Employee[] employees;

	private ArrayList<Employee> employees;

	private EmployeeDatabase()
	{
		employees = new ArrayList<Employee>(100);
	}

	public void addEmployee(Employee employee)
	{
		// employees[employee.getId()] = employee;
		// for (int i = 0; i < employees.size(); ++i)
		// {
		// if (employees. [i] == null)
		// {
		// employees[i] = employee;
		// break;
		// }
		// }
		employees.add(employee);
	}

	public Employee searchEmployee(int employeeId) throws EmployeeNotFoundException
	{
		// for (int i = 0; i < employees.length; ++i)
		// {
		// if (employees[i] != null && employees[i].getId() == employeeId)
		// return employees[i];
		// }

		ListIterator<Employee> listIter = employees.listIterator();
		while (listIter.hasNext())
		{
			Employee e = listIter.next();
			if (e.getId() == employeeId)
				return e;
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
