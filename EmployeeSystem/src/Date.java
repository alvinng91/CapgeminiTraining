import java.util.Calendar;

public class Date
{
	private int year;
	private int month;
	private int day;
	private int yearOfExperience;

	public int getYearsOfExperience()
	{
		return yearOfExperience;
	}

	public void setYearOfExperience(int yearOfExperience)
	{
		this.yearOfExperience = yearOfExperience;
	}

	Date(int year, int month, int day)
	{
		this.year = year;
		this.yearOfExperience = Calendar.getInstance().get(Calendar.YEAR) - this.year;
		this.month = month;
		this.day = day;

	}

	public String getDate()
	{
		return year + "-" + (month < 10 ? "0" : "") + month + "-" + (day < 10 ? "0" : "") + day;
	}

	public int getYear()
	{
		return year;
	}

	public void setYear(int year)
	{
		this.year = year;
	}

	public int getMonth()
	{
		return month;
	}

	public void setMonth(int month)
	{
		this.month = month;
	}

	public int getDay()
	{
		return day;
	}

	public void setDay(int day)
	{
		this.day = day;
	}
}
