package cl.jee.abpro.interfaces;

import java.util.List;

import cl.jee.abpro.model.Usuario;

/**Interfaz capa servicios**/

public interface IUsuariosServicios {
	
	/**Metodos capa servicios**/
	
	public List<Usuario> read();
	public Usuario read(int idusuarios);
	public void update(Usuario user);

}
