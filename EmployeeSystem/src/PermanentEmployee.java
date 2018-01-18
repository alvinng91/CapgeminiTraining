
public class PermanentEmployee extends Employee
{
	private static int counter;

	{
		++counter;
	}

	PermanentEmployee(String firstName, String lastName, double salary, char grade, Date joinDate)
	{
		super(firstName, lastName, salary, grade, joinDate);
	}

	public static int getCount()
	{
		return counter;
	}
}
