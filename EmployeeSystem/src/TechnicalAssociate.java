
public class TechnicalAssociate extends PermanentEmployee
{

	public TechnicalAssociate(String firstName, String lastName, double salary, char grade, Date joinDate)
	{
		super(firstName, lastName, salary, grade, joinDate);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setMediclaimCoverage()
	{
		getMediclaim().setCoveragePercentage(200.0);
	}

}
