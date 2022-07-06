package cl.jee.abpro.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/** Clase de conexion (Singleton) para bd a MySql**/

public class ConexionMySql {
	
	/**Inicializacion de la variable de conexion**/
	
	private static Connection conn = null;
	
		/**constructor**/
	
		private ConexionMySql() {
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver"); //uri de conexion mysql
				
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/prevencionderiesgos","root",""); // conexion a bd
				
				if (conn != null) {
					System.out.println("Conexion correcta"); //despliega mensaje si se logra conexion
				} else {
					System.out.println("Fallo la conexion"); //despliega mensaje si falla conexion
				}
			
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		/**metodo de persistencia de conexion**/

		public static Connection getConn() {
			
			if (conn == null) {
				
				new ConexionMySql();
			}
			return conn;
		}
		
}
