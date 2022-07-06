package cl.jee.abpro.implementacion;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import cl.jee.abpro.conexion.ConexionMySql;
import cl.jee.abpro.interfaces.ICapacitacion;
import cl.jee.abpro.model.Capacitacion;

/**Implementacion de ingreso de datos a la DB via Mysql, usando metodos de la interfaz**/

public class MySqlCapacitacionDAO implements ICapacitacion {
	
	/**Inicializacion variable connection**/
	
	private Connection cn = null;
	
	/**constructor para crear la conexion en todos los metodos que se implementen**/
	
	public MySqlCapacitacionDAO() {
		cn = ConexionMySql.getConn();
	}
	
	/**Implementacion metodo create**/
	
	@Override
	public void create(Capacitacion capa) {	
	  String sql = "insert capacitaciones (nombreCurso, nombreDocente, fechaInicio, fechaTermino, precio) values ('" + capa.getNombreCurso() +  "', '" + capa.getNombreDocente() + "', '" +   capa.getFechaInicio() + "','" + capa.getFechaTermino() + "','" + capa.getPrecio() + "')";
	  
	  try {
		  Statement stm = cn.createStatement();
		  stm.execute(sql);
		  stm.close();
	  } catch (SQLException e) {
		  e.printStackTrace();
	  }
	      
	  	  
	  System.out.println("***Se ha creado una nueva capacitacion***");	
	  
	}
	
	/**Implementacion metodo read (lista completa)**/

	@Override
	public List<Capacitacion> readAll() {
		
		String sql = "select nombreCurso, nombreDocente, fechaInicio, fechaTermino, precio from capacitaciones";
		ArrayList<Capacitacion> capa = new ArrayList<Capacitacion>();		
		
		
		try {
			Statement stm = cn.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			
			while (rs.next()) {
				capa.add(new Capacitacion(rs.getString("nombreCurso"), 
						rs.getString("nombreDocente"),
						rs.getString("fechaInicio"), 
						rs.getString("fechaTermino"), 
						rs.getString("precio")));
			}
			rs.close();
			stm.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		}
		
		
		return capa ;
	}	

}
