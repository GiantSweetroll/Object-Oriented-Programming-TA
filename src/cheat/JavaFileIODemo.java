package cheat;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class JavaFileIODemo
{
	public static void main (String args[])
	{
		String msg = "Hello World";
		File file = new File("gay/msg.txt");
		
		if (!file.exists())
		{
			file.getParentFile().mkdirs();
		}
		
		// Writing into file
		try 
		{
			BufferedWriter bw = new BufferedWriter(new FileWriter(file));
			bw.write(msg);
			bw.newLine();		// Start a new line
			
			bw.close();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		// Writing into file without overwriting
		try 
		{
			BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));		// Append
			bw.write(msg);
			bw.newLine();		// Start a new line
			
			bw.close();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		// Read from File
		try
		{
			Scanner sc = new Scanner(file);
			
			while (sc.hasNext())
			{
				System.out.println(sc.nextLine());
			}
			
			sc.close();
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
	}
}
