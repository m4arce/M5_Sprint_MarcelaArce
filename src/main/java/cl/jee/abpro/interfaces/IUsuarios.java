package cl.jee.abpro.interfaces;

import java.util.List;

import cl.jee.abpro.model.Usuario;

/**Interfaz de Usuario**/
public interface IUsuarios {
	
	/**Metodos CRUD de Usuario**/
	
	public List<Usuario> read();
	public Usuario read(int idusuarios);
	public void create(Usuario user);
	public void update(Usuario user);

}
