package cheat;

public class Student 
{
	// Constants
	public static final String FIRST_NAME = "fname",
								LAST_NAME = "lname",
								PROJECT = "project";
	
	// Fields
	private String fName, lName, project;
	
	// Constructor
	public Student(String fName, String lName, String project)
	{
		this.fName = fName;
		this.lName = lName;
		this.project = project;
	}
	
	public Student(String fName, String project)
	{
		this.fName = fName;
		this.lName = "";
		this.project = project;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}
	
	public String getFullName()
	{
		return this.fName + " " + this.lName;
	}
	
	// Overridden Methods
	@Override
	public String toString()
	{
		return this.getfName() + ": " + this.project;
	}
}
