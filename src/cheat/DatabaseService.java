package cheat;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DatabaseService
{
	// Fields
	private static final String HOST = "jdbc:mysql://localhost:3306/",
								USERNAME = "root",
								PASSWORD = "";
	
	private Connection c;
	
	public static final String DB_NAME = "Students",
								TABLE_NAME = "projects";
	
	// Constructor
	public DatabaseService()
	{
		this.init();
	}
	
	// Public Methods
	public PreparedStatement prepStatement(String query)
	{
		try
		{
			PreparedStatement prepStat = c.prepareStatement(query);
			return prepStat;
		}
		catch (SQLException ex)
		{
			System.err.println(ex.getMessage());
			return null;
		}
	}
	
	public void insert(Student student)
	{
		PreparedStatement ps = null;
		try
		{		
			ps = this.prepStatement("INSERT INTO " + TABLE_NAME + " values ("
					+ "\'" + student.getfName() + "\',"
					+ "\'" + student.getlName() + "\',"
					+ "\'" + student.getProject() + "\')");
			
			ps.execute();
		}
		catch(SQLException ex)
		{
			System.err.println(ex.getMessage());
		}
		finally
		{
			if (ps != null)
			{
				try 
				{
					ps.close();
				}
				catch (SQLException e) {}
			}
		}
	}
	
	public void delete(Student student) 
	{
		PreparedStatement ps = null;
		try
		{		
			ps = this.prepStatement("DELETE FROM " + TABLE_NAME + " WHERE " + Student.FIRST_NAME + " = \'" + student.getfName() + "\' AND "
										+ Student.LAST_NAME + " = \'" + student.getlName()  + "\' AND "
										+ Student.PROJECT + " = \'" + student.getProject() + "\'");
			
			ps.execute();
		}
		catch(SQLException ex)
		{
			System.err.println(ex.getMessage());
		}
		finally
		{
			if (ps != null)
			{
				try 
				{
					ps.close();
				}
				catch (SQLException e) {}
			}
		}
		
	}
	
	public void update(String fName, String lName, Student student)
	{
		PreparedStatement ps = null;
		try
		{
			ps = this.prepStatement("UPDATE " + TABLE_NAME 
									+ " SET "
										+ Student.FIRST_NAME + "=\'" + student.getfName() + "\'," 
										+ Student.LAST_NAME + "=\'" + student.getlName() + "\',"
										+ Student.PROJECT + "=\'" + student.getProject() + "\'" 
									+ " WHERE " + Student.FIRST_NAME + "= \'" + fName + "\' AND "
									+ Student.LAST_NAME + "= \'" + lName + "\'");
			ps.execute();
		}
		catch(SQLException ex)
		{
			System.err.println(ex.getMessage());
		}
		finally
		{
			if (ps != null)
			{
				try
				{
					ps.close();
				}
				catch(SQLException ex) {}
			}
		}
	}
	
	public List<Student> getAllStudents()
	{
		List<Student> ls = new ArrayList<Student>();
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try
		{
			ps = this.prepStatement("SELECT * FROM " + TABLE_NAME);
			rs = ps.executeQuery();
			
			//Loop through the result set
			while (rs.next())
			{
				Student student = new Student(rs.getString(Student.FIRST_NAME),
												rs.getString(Student.LAST_NAME),
												rs.getString(Student.PROJECT));
				ls.add(student);
			}
			
		}
		catch(SQLException ex)
		{
			System.err.println(ex.getMessage());
		}
		finally
		{
			if (ps != null)
			{
				try
				{
					ps.close();
				}
				catch(SQLException ex) {}
			}
			
			if (rs != null)
			{
				try
				{
					rs.close();
				}
				catch(SQLException ex) {}
			}
		}
		
		return ls;
	}
	
	// Private Methods
	/**
	 * Creates the MySQL database.
	 * @throws SQLException
	 */
	private void createDatabase() throws SQLException
	{
		PreparedStatement prep = this.prepStatement("CREATE DATABASE " + DB_NAME);
		prep.execute();
		prep.close();
	}
	
	/**
	 * Creates the tables if they do not exist yet
	 */
	private void createTable()
	{
		PreparedStatement prep = null;
		
		try
		{
			//Create table
			prep = this.prepStatement("CREATE TABLE if not exists " + TABLE_NAME + "("
										+ Student.FIRST_NAME + " varchar(255) NOT NULL,"
										+ Student.LAST_NAME + " varchar(255),"
										+ Student.PROJECT + " varchar(255) NOT NULL)");
			prep.execute();
			prep.close();
		}
		catch(SQLException ex)
		{
			System.err.println(ex.getMessage());
		}
		finally
		{
			if (prep != null)
			{
				try
				{
					prep.close();
				}
				catch(SQLException ex) {}
			}
		}
		
	}
	
	/**
	 * Initializes the class. It checks for existence of database. If not create it. Tables are also checked and created if needed.
	 */
	private void init()
	{
		//Connect to mysql database
		try
		{	
			//Try to connect to the database
			this.c = DriverManager.getConnection(HOST + DB_NAME, USERNAME, PASSWORD);
			System.out.println("Database connection successful");
			
			//Check for tables
			this.createTable();
		}
		catch (SQLException ex)
		{
			//If it goes here, most likely the database has not been created yet.
			System.err.println(ex.getMessage());
			try
			{
				//Create the database and try to connect again.
				c = DriverManager.getConnection(HOST, USERNAME, PASSWORD);
				this.createDatabase();
				this.init();
			} 
			catch (SQLException e) 
			{
				System.err.println(ex.getMessage());
				System.out.println("Database connection failed after creating table");
			}
		}
	}
}
