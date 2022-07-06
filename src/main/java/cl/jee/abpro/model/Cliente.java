package cl.jee.abpro.model;

/**Clase Cliente para modelo de datos, extiende de usuario**/




public class Cliente extends Usuario{
	
	/**Se declaran variables o parametros**/
	
	private String rut;
	private String nombre;
	
	/**constructor vacio**/
	
	public Cliente() {
		super();		
	}
	
	/**Constructor con parametros**/

	public Cliente(String rut, String nombre) {
		super();
		this.rut = rut;
		this.nombre = nombre;
	}
	
	/**Getters & Setters**/

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
