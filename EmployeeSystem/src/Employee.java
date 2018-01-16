/**
 * 
 */

/**
 * @author alving
 *
 */
public class Employee {
	static private int idGenerator;
	static private int counter;
	// id
	private int id;
	private String firstName;
	private String lastName;
	private float salary;
	private char grade;
	private String joinDate;
		
	{
		++counter;
		this.id = idGenerator++;
	}
	
	public Employee()
	{
		this.firstName = "firstName";
		this.lastName = "lastName";
		this.salary = 3000.0f;
		this.grade = 'B';
		this.joinDate = "mmm:yyyy";
	}
	
	public Employee(String firstName, String lastName, float salary, char grade, String joinDate)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.grade = grade;
		this.joinDate = joinDate;
	}
	
	static public int GetEmployeeCount()
	{
		return counter;
	}
	
	public void PrintEmployeeDetails()
	{
		System.out.println("ID : " + getId());
		System.out.println("First Name : " + getFirstName());
		System.out.println("Last Name : " + getLastName());
		System.out.println("Salary : " + getSalary());
		System.out.println("Grade : " + getGrade());
		System.out.println("Join Date : " + getJoinDate());
	}
	
	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	public String getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(String joinDate) {
		this.joinDate = joinDate;
	}
}
