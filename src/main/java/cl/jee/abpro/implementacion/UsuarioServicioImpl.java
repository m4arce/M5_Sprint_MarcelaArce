package cl.jee.abpro.implementacion;

import java.util.List;

import cl.jee.abpro.interfaces.IUsuarios;
import cl.jee.abpro.interfaces.IUsuariosServicios;
import cl.jee.abpro.model.Usuario;

/**Implementacion capa servicios**/

public class UsuarioServicioImpl implements IUsuariosServicios{
	
	
IUsuarios userDAO = new MySqlUsuariosDAO();
	
	
	@Override
	public List <Usuario> read() {
	
		return userDAO.read();
		
	}

	@Override
	public void update(Usuario user) {
		
		userDAO.update(user);
		

	}

	@Override
	public Usuario read(int idusuarios) {

		return userDAO.read(idusuarios);
	}


}
	

