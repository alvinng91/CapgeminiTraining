public class TechnicalAssociate extends PermanentEmployee
{

	private int numCerts;

	{
		setDesignation("TA-P");
	}

	@Override
	public void addCert(Cert cert)
	{
		if (cert != cert.PMI)
			super.addCert(cert);
	}

	public TechnicalAssociate(String firstName, String lastName, double salary, char grade, Date joinDate)
	{
		super(firstName, lastName, salary, grade, joinDate);
		numCerts = 5;
	}

	@Override
	public void setMediclaimCoverage()
	{
		getMediclaim().setCoveragePercentage(200.0);
	}

	@Override
	public double getSalary()
	{
		return getJoinDate().getYearsOfExperience() * 5000 + 1000 * numCerts;
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
