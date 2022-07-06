package cl.jee.abpro.interfaces;

import java.util.List;

import cl.jee.abpro.model.Capacitacion;

/**Interfaz de Capacitacion**/

public interface ICapacitacion {
	
	/**Metodos CRUD de Capacitacion**/
	
	public List<Capacitacion> readAll();
	public void create(Capacitacion capa);
	//public void create();
}
