
public class Producto {
	private String codigo;
	private String nombre;
	private String descripcion;
	private String stock;
	private String pasillo;
	private String estanteria;
	private String estante;
	private String pendientes;
	
	@Override
	public String toString() {
		return ("codigo :"+codigo+"\n"+
				"nombre :"+nombre+"\n"+
				"descripcion :"+descripcion+"\n"+
				"stock :"+stock+"\n"+
				"pasillo :"+pasillo+"\n"+
				"estanteria :"+estanteria+"\n"+
				"estante :"+estante+"\n"+
				"pendientes :"+pendientes+"\n");
	}

	public Producto(String codigo, String nombre, String descripcion, String stock, String pasillo,
			String estanteria, String estante, String pendientes) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.stock = stock;
		this.pasillo = pasillo;
		this.estanteria = estanteria;
		this.estante = estante;
		this.pendientes = pendientes;
		}


	//getters y setters
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public String getStock() {
		return stock;
	}
	public void setStock(String stock) {
		this.stock = stock;
	}

	public String getPasillo() {
		return pasillo;
	}
	public void setPasillo(String pasillo) {
		this.pasillo = pasillo;
	}


	public String getEstanteria() {
		return estanteria;
	}
	public void setEstanteria(String estanteria) {
		this.estanteria = estanteria;
	}
	
	
	public String getEstante() {
		return estante;
	}
	public void setEstante(String estante) {
		this.estante = estante;
	}


	public String getPendientes() {
		return pendientes;
	}
	public void setPendientes(String pendientes) {
		this.pendientes = pendientes;
	}

}
	


