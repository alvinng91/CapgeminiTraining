
public class ContractEmployee extends Employee{
	private static int counter;
	private Contractor contractor;
	
	private int hoursWorked;
	private double ratePerHour;
	
	{
		++counter;
	}
	
	public static int getCount() {
		return counter;
	}

	public static void setCounter(int counter) {
		ContractEmployee.counter = counter;
	}

	public Contractor getContractor() {
		return contractor;
	}

	public void setContractor(Contractor contractor) {
		this.contractor = contractor;
	}

	public int getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	public double getRatePerHour() {
		return ratePerHour;
	}

	public void setRatePerHour(double ratePerHour) {
		this.ratePerHour = ratePerHour;
	}

	ContractEmployee(String firstName, String lastName, char grade, Date joinDate, Contractor contractor, double ratePerHour)
	{
		super(firstName, lastName, 0, grade, joinDate);
		this.contractor = contractor;
		this.contractor.addEmployee(this);
		this.ratePerHour = ratePerHour;
	}
	
	public void PrintEmployeeDetails()
	{
		setSalary(hoursWorked * ratePerHour);
		super.PrintEmployeeDetails();
		System.out.println("Contractor : " + contractor.getFirstName() + " " + contractor.getLastName());
		System.out.println("Hours worked : " + hoursWorked);
		System.out.println("Rate Per Hour : " + ratePerHour);
		
	}
}
