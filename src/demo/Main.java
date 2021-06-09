package demo;

import java.util.List;

public class Main
{
	public static void main (String args[])
	{
		DatabaseService ds = new DatabaseService();
		
//		Student st1 = new Student("Jason", "Jeremy Wijadi", "Email client");
//		
//		ds.insert(st1);
//		
//		Student st2 = new Student("Ardelia", "Araminta", "Aquatic Pet Clinic System");
//		Student st3 = new Student("Monique", "Senjaya", "Groceries Inventory Tracking App");
//		
//		ds.insert(st2);
//		ds.insert(st3);
		
		List<Student> students = ds.getAllStudents();
		
		// for student in students:
		for (Student student : students)
		{
			System.out.println(student.toString());
		}
	}
}
