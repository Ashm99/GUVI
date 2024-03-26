package jdbcQuery;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class JDBCConnectionQuery {
	public static void main(String[] argS) {
//		System.out.println("Hello, world!");
		
		//Making the input data available in an ArrayList
		ArrayList<Employee> employees = new ArrayList<>();
		employees.add(new Employee(101, "Jenny", 25, 10000));
		employees.add(new Employee(102, "Jacky", 30, 20000));
		employees.add(new Employee(103, "Joe", 20, 40000));
		employees.add(new Employee(104, "John", 40, 80000));
		employees.add(new Employee(105, "Shameer", 25, 90000));
		
		Connection con = null;
		try {
			//DRIVER REGISTRATION
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//GETTING A CONNECTION
//			con = DriverManager.getConnection(url, username, password);
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rough", "root", "MySQLR00t");
			System.out.println("Connection established successfully!\n");
			
			//PREPARE STATEMENT
			String createTable = "CREATE TABLE Employee_jdbc (empcode INT PRIMARY KEY, empname VARCHAR(30), empage INT, esalary INT)";
			Statement statement = con.createStatement();
			
			//EXECUTING QUERIES
			//1. Creating the table
			try {
				statement.execute(createTable);
				System.out.println("Employee table created successfully!\n");
			}
			catch (SQLException e) {
				System.err.println("Error creating table: " + e.getMessage());
			}
//			finally {
//				statement.close();  // Close the statement resource
//			}//Commented out for now as the statement resource is closed after 3. printing the table data
			
			//2. Inserting values into the table
			try {
				PreparedStatement stmt = con.prepareStatement("INSERT INTO Employee_jdbc(empcode, empname, empage, esalary) VALUES(?,?,?,?)");
				for(Employee e : employees) {
					stmt.setInt(1,e.ID());
					stmt.setString(2, e.name());
					stmt.setInt(3,e.age());
					stmt.setInt(4,e.salary());
					stmt.executeUpdate();
				}
				System.out.println("Data inserted into table Employee_jdbc successfully!\n");
			}
			catch (Exception e) {
				System.err.println("Error inserting data: " + e.getMessage());
			}
			
			//3. Printing values from the table
			String tableName = "Employee_jdbc";
			
			String query = "SELECT * FROM " + tableName;
			ResultSet rs = null;
			try {
				System.out.println("Table: " + tableName);
				rs = statement.executeQuery(query);
				System.out.println("-----------------------------------------------------");
				System.out.printf ("| ECode | Name                 | Age   | Salary     |\n");
				System.out.println("-----------------------------------------------------");
				while (rs.next()) {
					int code = rs.getInt("empcode");
			    	String name = rs.getString("empname");
			    	int age = rs.getInt("empage");
			    	int salary = rs.getInt("esalary");
			    	System.out.printf("| %-5d | %-20s | %-5d | %-10d |\n", code, name, age, salary);
				}
				System.out.println("-----------------------------------------------------\n");
			} catch (SQLException e) {
				System.err.println("Error getting table information: " + e.getMessage());
			}
			finally {
				statement.close();
				rs.close();
			}

		}//end of the main try block
		catch (Exception e) {
			System.err.println("Error occured: " + e.getMessage());
		}
		finally {
			//CLOSING THE CONNECTION
			if (con != null) {
				try {
					con.close();
				    System.out.println("Connection closed.");
				}
				catch (SQLException e) {
					System.err.println("Error closing connection: " + e.getMessage());
				}
			}
		}
	}
}
