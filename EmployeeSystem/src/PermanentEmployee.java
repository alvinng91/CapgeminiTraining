
abstract public class PermanentEmployee extends Employee
{
	private static int counter;

	private Mediclaim mediclaim;

	{
		++counter;
		mediclaim = new Mediclaim();
		setMediclaimCoverage();
	}

	PermanentEmployee(String firstName, String lastName, double salary, char grade, Date joinDate)
	{
		super(firstName, lastName, salary, grade, joinDate);
	}

	public static int getCount()
	{
		return counter;
	}

	abstract public void setMediclaimCoverage();

	public Mediclaim getMediclaim()
	{
		return mediclaim;
	}

	@Override
	public String toString()
	{
		// TODO Auto-generated method stub
		return super.toString() + "Medical Coverage : " + getMediclaim().getCoveragePercentage() + "% of salary p.a\n"
				+ "\n";
	}
}
