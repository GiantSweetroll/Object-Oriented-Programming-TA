package cheat;

import java.util.List;

public class Main 
{
	public static void main (String args[])
	{
		DatabaseService ds = new DatabaseService();
		
		Student st1 = new Student("Ardelia", "Araminta", "Fish app");
		
		ds.insert(st1);
		
//		ds.delete(st1);
		
//		st1.setlName("Shaula Araminta");
//		ds.update("Ardelia", "Araminta", st1);
		
		Student st2 = new Student("Jason", "Jeremy Wijadi", "Email thing");
		
		ds.insert(st2);
		
		List<Student> students = ds.getAllStudents();
		
		for (Student s : students)
		{
			System.out.println(s.toString());
		}
	}
}
