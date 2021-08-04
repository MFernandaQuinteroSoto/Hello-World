package Conecta;

import java.sql.Connection;
import java.sql.DriverManager;

public class PedroConnection {
	
	private static Connection cn;
	
	public static Connection getConnection() {
		try {
			//Class.forName("net.sourceforge.jtds.jdbc.Driver").newInstance();
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String connectionUrl = "jdbc:sqlserver://localhost;"
					                         + "database=algoritmos;"
					                         + "encrypt=true;"
					                         + "trustServerCertificate=false;"
					                         + "loginTimeout=30;";
			cn = DriverManager.getConnection(connectionUrl);
			
		} catch (Exception e) {
			cn = null;
		}
		
		return cn;
	}

	
	public static void main(String[] args) {
		Connection pruebaCn = PedroConnection.getConnection();
		if (pruebaCn != null) {
			System.out.println("Conectado");
			System.out.println(pruebaCn);
		}else {
			System.out.println("Desconectado");
		}
	}
}
