package cl.jee.abpro.implementacion;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import cl.jee.abpro.conexion.ConexionMySql;
import cl.jee.abpro.interfaces.IContacto;
import cl.jee.abpro.model.Contacto;

/**Implementacion de ingreso de datos a la DB via Mysql, usando metodos de la interfaz**/

public class MySqlContactoDAO implements IContacto {
	
	/** Inicializacion variable connection **/
	
	private Connection cn = null;
	
	/**constructor para crear la conexion en todos los metodos que se implementen**/
	
	public MySqlContactoDAO() {
		cn = ConexionMySql.getConn();
	}
	
	/**Implementacion metodo create**/
	
	@Override
	public void create(Contacto contact) {	
	  String sql = "insert contactoform (usuario, email, mensaje) values ('" + contact.getUsuario() +  "', '" + contact.getEmail() + "', '" +   contact.getMensaje() + "')";
	  
	  try {
		  Statement stm = cn.createStatement();
		  stm.execute(sql);
		  stm.close();
	  } catch (SQLException e) {
		  e.printStackTrace();
	  }	      
	  	  
	  System.out.println("***Se ha enviado informacion desde contacto***");	
	  
	}


}
