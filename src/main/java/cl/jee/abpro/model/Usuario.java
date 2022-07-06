package cl.jee.abpro.model;

/**Clase Usuario para modelo de datos**/

/**Se declaran variables o parametros**/

public class Usuario {
	private int idusuarios;
	private String usuario;
	private String password;
	private String tipo;
	
	/**constructor vacio**/
	
	public Usuario() {
		super();
	}
	
	/**Constructor con parametros**/
	
	public Usuario(int idusuarios, String usuario, String password, String tipo) {
		super();
		this.idusuarios = idusuarios;
		this.usuario = usuario;
		this.password = password;
		this.tipo = tipo;
	}
	
	/**constructor con parametros II (para recibir otra estructura del objeto**/
	
	public Usuario(String usuario, String password, String tipo) {
		super();
		this.usuario = usuario;
		this.password = password;
		this.tipo = tipo;
	}
	
	/**Getters & Setters**/

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}	
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getIdusuarios() {
		return idusuarios;
	}



	public void setIdusuarios(int idusuarios) {
		this.idusuarios = idusuarios;
	}

	
	

}
