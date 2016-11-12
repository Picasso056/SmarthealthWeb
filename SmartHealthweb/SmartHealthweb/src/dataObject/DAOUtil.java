package dataObject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


/*
 * CLASS DAOUtil
 * Description : class handling database connection 
 */

public class  DAOUtil {
	
	private static Connection connection = null;
	
	/*
	 * Function : getConnection
	 * Description : connect with database
	 */
	public Connection getConnection()
	{
		try{
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/smarthealthdb?useSSL=false","root","root");
			}
		catch(Exception e){
			e.printStackTrace();
			}		
		return connection;
	}

	/*
	 * Function :closeStatement
	 * Description : close statement
	 */
	public  void closeStatement(Statement statement)
	{
		if(statement != null)
		{
			try{
				statement.close();
				}
			catch(SQLException e){
				e.printStackTrace();
				}
		}
	}
	/*
	 * Function : closeConnection
	 * Description : close connection
	 */
	public void closeConnection(Connection connection) throws Exception
	{
		connection.close();
	}	
	

}