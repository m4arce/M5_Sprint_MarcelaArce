package cl.jee.abpro.implementacion;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import cl.jee.abpro.conexion.ConexionMySql;
import cl.jee.abpro.interfaces.IUsuarios;
import cl.jee.abpro.model.Usuario;

/**Implementacion de ingreso de datos a la DB via Mysql, usando metodos de la interfaz**/

public class MySqlUsuariosDAO implements IUsuarios {

	/** Inicializacion variable connection **/

	private Connection cn = null;

	/**
	 * constructor para crear la conexion en todos los metodos que se implementen
	 **/

	public MySqlUsuariosDAO() {
		cn = ConexionMySql.getConn();
	}
	
	/**Implementacion metodo create**/

	@Override
	public void create(Usuario user) {
		String sql = "insert usuarios (usuario, password, tipo) values ('" + user.getUsuario() + "', '"
				+ user.getPassword() + "', '" + user.getTipo() + "')";

		try {
			Statement stm = cn.createStatement();
			stm.execute(sql);
			stm.close();
		} catch (SQLException e) {
			System.out.println("Error al consultar la BD en create");
			e.printStackTrace();
		}

		System.out.println("***Se ha creado un nuevo Usuario***");

	}
	
	/**Implementacion metodo read (lista completa)**/

	@Override
	public List<Usuario> read() {

		String sql = "select idusuarios, usuario, password, tipo from usuarios";
		List<Usuario> user = new ArrayList<Usuario>();

		try {
			Statement stm = cn.createStatement();
			ResultSet rs = stm.executeQuery(sql);

			while (rs.next()) {
				user.add(new Usuario(rs.getInt("idusuarios"), rs.getString("usuario"), rs.getString("password"), rs.getString("tipo")));
			}
			rs.close();
			stm.close();

		} catch (SQLException e) {
			System.out.println("Error al consultar la BD en read(lista)");
			e.printStackTrace();

		}

		return user;
	}
	
	/**Implementacion metodo read (por id de usuario)**/
	
	@Override
	public Usuario read(int idusuarios) {

		Usuario useri = new Usuario();

		String sql = "select idusuarios, usuario, password, tipo from usuarios where idusuarios = " + idusuarios;

		try {
			Statement stm = cn.createStatement();
			ResultSet rs = stm.executeQuery(sql);

			if (rs.next()) {

				useri.setIdusuarios(rs.getInt("idusuarios"));
				useri.setUsuario(rs.getString("usuario"));
				useri.setPassword(rs.getString("password"));
				useri.setTipo(rs.getString("tipo"));
			}
			
			rs.close();
			stm.close();			

		} catch (SQLException e) {
			System.out.println("Error al consultar la BD en read(id)");
			e.printStackTrace();

		}

		return useri;

	}

	/**Implementacion metodo update**/
	@Override
	public void update(Usuario user) {
		String sql = "update usuarios set usuario='" + user.getUsuario() + "', password='" + user.getPassword()
				+ "', tipo='" + user.getTipo() + "' WHERE idusuarios=" + user.getIdusuarios();
		System.out.println("sql :" + sql);

		try {
			Statement stm = cn.createStatement();
			stm.execute(sql);
			stm.close();

		} catch (SQLException e) {
			System.out.println("Error al consultar la BD en update");
			e.printStackTrace();
		}

		System.out.println("***Se ha actualizado Usuario***");
	}
	
}
