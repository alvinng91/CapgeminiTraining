public class ProjectManager extends PermanentEmployee
{
	{
		setDesignation("PM");
	}

	@Override
	public void addCert(Certification.Cert cert)
	{
		if (cert == cert.PMI)
		{
			super.addCert(cert);
		}
	};

	ProjectManager(String firstName, String lastName, double salary, char grade, Date joinDate)
	{
		super(firstName, lastName, salary, grade, joinDate);
	}

	@Override
	public void setMediclaimCoverage()
	{
		getMediclaim().setCoveragePercentage(100.0);
	}

	@Override
	public double getSalary()
	{
		return getJoinDate().getYearsOfExperience() * 10000;
	}

	@Override
	public String toString()
	{
		return "Employee ID : " + Integer.toString(getId()) + "\nName : " + getFirstName() + " " + getLastName()
				+ "\nDesignation : " + getDesignation() + "\nYears of experience : "
				+ Integer.toString(getJoinDate().getYearsOfExperience()) + "\nSalary : " + getSalary()
				+ "\nCertification(s) : " + certToString() + "\n";
	}
}
