/**
 * 
 */

/**
 * @author alving
 *
 */
abstract public class Employee implements Certification
{
	static private int idGenerator;
	static private int counter;
	// id
	private int id;
	private String firstName;
	private String lastName;
	private String designation;
	private int certCounter;
	private Certification.Cert[] certs;

	@Override
	public void addCert(Cert cert)
	{
		if (certs == null)
			certs = new Certification.Cert[3];

		certs[certCounter++] = cert;
	}

	@Override
	final public Cert[] getCerts()
	{
		return certs;
	}

	public String certToString()
	{
		String output = "";
		if (certs == null)
		{
			output += "NIL";
		}
		else
		{
			for (int i = 0; i < certCounter; ++i)
			{
				output += certs[i] + (i == certCounter - 1 ? "" : "/");
			}
		}
		return output;
	}

	public String getDesignation()
	{
		return designation;
	}

	public void setDesignation(String designation)
	{
		this.designation = designation;
	}

	private double salary;
	private char grade;
	private Date joinDate;

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
		this.joinDate = new Date(1991, 10, 31);
	}

	public Employee(String firstName, String lastName, double salary, char grade, Date joinDate)
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

	@Override
	public String toString()
	{
		return "ID : " + getId() + "\n" + "First Name : " + getFirstName() + "\n" + "Last Name : " + getLastName()
				+ "\n" + "Salary : " + getSalary() + "\n" + "Grade : " + getGrade() + "\n" + "Join Date : "
				+ joinDate.getDate() + "\n";

		/*
		 * System.out.println("ID : " + getId()); System.out.println(
		 * "First Name : " + getFirstName()); System.out.println("Last Name : "
		 * + getLastName()); System.out.println("Salary : " + getSalary());
		 * System.out.println("Grade : " + getGrade()); System.out.println(
		 * "Join Date : " + joinDate.getDate());
		 */
	}

	public int getId()
	{
		return id;
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

	public double getSalary()
	{
		return salary;
	}

	public void setSalary(double salary)
	{
		this.salary = salary;
	}

	public char getGrade()
	{
		return grade;
	}

	public void setGrade(char grade)
	{
		this.grade = grade;
	}

	public Date getJoinDate()
	{
		return joinDate;
	}

	public void setJoinDate(Date joinDate)
	{
		this.joinDate = joinDate;
	}

	public void setJoinDate(int year, int month, int day)
	{
		this.joinDate.setYear(year);
		this.joinDate.setMonth(month);
		this.joinDate.setDay(day);
	}
}
