package exercises;

public class Date 
{
	// Fields
	private int month, day, year;
	private int[] _DAYS_PER_MONTH;
	
	// Constructor
	Date (int month, int day, int year)
	{
		this.month = month;
		this.day = day;
		this.year = year;
	}
	
	// Methods
	public String toString()
	{
		return "Date: " + day + "/" + month + "/" + year;
	}
}
