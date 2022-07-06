package cl.jee.abpro.model;

/**Clase Administrativo para modelo de datos, extiende de Usuario**/




public class Administrativo extends Usuario{
	
	/**Se declaran variables o parametros**/
	
	private String rut;
	private String nombre;
	
	/**constructor vacio**/
	
	public Administrativo() {
		super();		
	}
	
	/**Constructor con parametros**/

	public Administrativo(String rut, String nombre) {
		super();
		this.rut = rut;
		this.nombre = nombre;
	}

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
