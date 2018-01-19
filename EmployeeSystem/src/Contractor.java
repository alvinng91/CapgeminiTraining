
public class Contractor
{
	private String firstName;
	private String lastName;
	private ContractEmployee employees[];
	private int employeeCount;

	{
		employees = new ContractEmployee[10];
	}

	Contractor(String firstName, String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	public ContractEmployee[] getEmployees()
	{
		return employees;
	}

	public void setEmployees(ContractEmployee[] employees)
	{
		this.employees = employees;
	}

	public int getEmployeeCount()
	{
		return employeeCount;
	}

	public void setEmployeeCount(int employeeCount)
	{
		this.employeeCount = employeeCount;
	}

	public void addEmployee(ContractEmployee employee)
	{
		this.employees[this.employeeCount++] = employee;
	}

}
