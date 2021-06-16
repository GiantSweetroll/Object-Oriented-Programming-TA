package demo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaFileIODemo 
{
	public static void main (String arggs[])
	{
		String msg = "Hello World";
		File file = new File("myFolder/msg.txt");
		
		if (!file.exists())
		{
			System.out.println("Directory not found");
			file.getParentFile().mkdirs();
			System.out.println("Directory created.");
		}
		
		// Write to file
		try
		{
			BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));		// Set to False if you want to overwrite
			
			bw.write(msg);
			bw.newLine();
			bw.write(msg);
			bw.newLine();
			bw.write(msg);
			bw.newLine();
			bw.write(msg);
			bw.newLine();
			
			bw.close();
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
		
		// Read from file
		try 
		{
			Scanner sc = new Scanner(file);
			List<String> ls = new ArrayList<String>();
			
			while (sc.hasNext())
			{
				String txt = sc.nextLine();
//				System.out.println(sc.nextLine());
				ls.add(txt);
			}
			
			for (String s : ls)
			{
				System.out.println(s);
			}
			
			sc.close();
			
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		// Clear text file
		try
		{
			BufferedWriter bw = new BufferedWriter(new FileWriter(file));
			
			bw.write("");
			
			bw.close();
		}
		catch(IOException ex)
		{
			
		}
		
		// Delete file
		file.delete();		// Delete file
		file.getParentFile().delete();		// Delete directory
	}
}
