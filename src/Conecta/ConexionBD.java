package Conecta;


import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;


public class ConexionBD {
	
	
	 public static void main(String[] args) {
	        String connectionUrl =
	                "jdbc:sqlserver://jdbc:sqlserver://;"
	                        + "database=algoritmos;"
	                        + "encrypt=true;"
	                        + "trustServerCertificate=false;"
	                        + "loginTimeout=30;";
	        
	        ResultSet resultSet = null;
	        
	        try (Connection connection = DriverManager.getConnection(connectionUrl);
	                Statement statement = connection.createStatement();){
	            
	            String selectSql = "select polinomio from Registros where Identificador = 1";
	            resultSet = statement.executeQuery(selectSql);
	            
	            while (resultSet.next()){
	                System.out.println(resultSet.getString(1));
	            }
	            
	        }
	        // Handle any errors that may have occurred.
	        catch (SQLException e) {
	            e.printStackTrace();
	        }
			
		
		} 
	
}
