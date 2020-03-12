
public class Clientes {
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String email;
	private String telefono;
	private String direccion;
	private String calle;
	private String numero;
	private String codpostal;
	private String poblacion;
	private String pais;
	
	
	
	public Clientes(String nombre, String apellido1, String apellido2, String email, String telefono, String direccion,
			String calle, String numero, String codpostal, String poblacion, String pais) {
		super();
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.email = email;
		this.telefono = telefono;
		this.direccion = direccion;
		this.calle = calle;
		this.numero = numero;
		this.codpostal = codpostal;
		this.poblacion = poblacion;
		this.pais = pais;
	}
	
	

	//Getters y Setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido1() {
		return apellido1;
	}
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
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


	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
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




	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
