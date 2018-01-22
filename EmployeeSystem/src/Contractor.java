
public class Contractor
{
	private String firstName;
	private String lastName;
	private double ratePerHour;

	private static int totalEmployeeCount;

	private int employeeCounter;
	private ContractEmployee employees[];

	public Contractor(String firstName, String lastName, double ratePerHour)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.ratePerHour = ratePerHour;
	}

	public class ContractEmployee extends Employee
	{
		// private Contractor contractor;

		private int hoursWorked;

		{
			++totalEmployeeCount;
			addEmployee(this);
		}

		public Contractor getContractor()
		{
			return Contractor.this;
		}

		// public void setContractor(Contractor contractor)
		// {
		// this.contractor = contractor;
		// }

		public int getHoursWorked()
		{
			return hoursWorked;
		}

		public void setHoursWorked(int hoursWorked)
		{
			this.hoursWorked = hoursWorked;
			this.setSalary(this.hoursWorked * ratePerHour);
		}

		ContractEmployee(String firstName, String lastName, char grade, Date joinDate)
		{
			super(firstName, lastName, 0, grade, joinDate);
			// this.contractor = contractor;
		}

		@Override
		public String toString()
		{
			return super.toString() + "Hours worked : " + hoursWorked + "\n";
			/*
			 * super.PrintEmployeeDetails(); System.out.println("Contractor : "
			 * + getContractor().getFirstName() + " " +
			 * getContractor().getLastName()); System.out.println(
			 * "Hours worked : " + hoursWorked); System.out.println(
			 * "Rate Per Hour : " + ratePerHour);
			 */

		}
	}

	private class TechnicalAssociate extends ContractEmployee
	{
		TechnicalAssociate(String firstName, String lastName, char grade, Date joinDate)
		{
			super(firstName, lastName, grade, joinDate);
		}
	}

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

	public void addEmployee(ContractEmployee employee)
	{
		this.employees[this.employeeCounter++] = employee;
	}

	// public void addEmployee(String firstName, String lastName, char grade,
	// Date joinDate, double ratePerHour)
	// {
	// this.employees[employeeCounter++] = new ContractEmployee(firstName,
	// lastName, grade, joinDate, ratePerHour);
	// }

	public double getRatePerHour()
	{
		return ratePerHour;
	}

	public void setRatePerHour(double ratePerHour)
	{
		this.ratePerHour = ratePerHour;
	}

	@Override
	public String toString()
	{
		String result = "Employer Name : " + getFirstName() + " " + getLastName() + "\n" + "Employees' Rate Per Hour : "
				+ getRatePerHour() + "\n";
		for (int i = 0; i < getEmployeeCounter(); ++i)
		{
			result += employees[i].toString() + "\n";
		}
		return result;
	}

	public int getEmployeeCounter()
	{
		return employeeCounter;
	}

	public static int getEmployeeCount()
	{
		return totalEmployeeCount;
	}
}
