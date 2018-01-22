
public class ProjectManager extends PermanentEmployee
{
	ProjectManager(String firstName, String lastName, double salary, char grade, Date joinDate)
	{
		super(firstName, lastName, salary, grade, joinDate);
	}

	@Override
	public void setMediclaimCoverage()
	{
		getMediclaim().setCoveragePercentage(100.0);
	}
}
