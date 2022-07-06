package cl.jee.abpro.model;

/**Clase Usuario para modelo de datos**/




public class Contacto {
	
	/**Se declaran variables o parametros**/
	
	private String usuario;
	private String email;
	private String mensaje;
	
	/**constructor vacio**/
	
	public Contacto() {
		super();
	}

	/**Constructor con parametros**/
	public Contacto(String usuario, String email, String mensaje) {
		super();
		this.usuario = usuario;
		this.email = email;
		this.mensaje = mensaje;
	}

	/**Getters & Setters**/
	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	

}
