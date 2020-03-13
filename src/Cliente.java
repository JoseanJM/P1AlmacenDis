
public class Cliente {
	private String nombrecl;
	private String apellidos;
	private String email;
	private String telefono;
	private String calle;
	private String numero;
	private String codpostal;
	private String poblacion;
	private String pais;
	
	@Override
	public String toString() {
		return ("Nombre :"+nombrecl+"\n"+
				"Apellidos :"+apellidos+"\n"+
				"Email :"+email+"\n"+
				"Teléfono :"+telefono+"\n"+
				"Calle :"+calle+"\n"+
				"Número :"+numero+"\n"+
				"Código Postal :"+codpostal+"\n"+
				"Poblacion :"+poblacion+"\n"+
				"País :"+pais+"\n");
	}	
	
	public Cliente(String nombrecl, String apellidos, String email, String telefono,
			String calle, String numero, String codpostal, String poblacion, String pais) {
		super();
		this.nombrecl = nombrecl;
		this.apellidos = apellidos;
		this.email = email;
		this.telefono = telefono;
		this.calle = calle;
		this.numero = numero;
		this.codpostal = codpostal;
		this.poblacion = poblacion;
		this.pais = pais;
	}
	
	

	//Getters y Setters
	public String getNombre() {
		return nombrecl;
	}
	public void setNombre(String nombrecl) {
		this.nombrecl = nombrecl;
	}


	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}


	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}


	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}


	public String getCodpostal() {
		return codpostal;
	}
	public void setCodpostal(String codpostal) {
		this.codpostal = codpostal;
	}


	public String getPoblacion() {
		return poblacion;
	}
	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}


	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}

}
