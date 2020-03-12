
public class Pedidos {
	private String productos;
	private String cantidad;
	private String direccionEntrega;
	private String calle;
	private String numero;
	private String codPostal;
	private String poblacion;
	private String pais;
	private String destinatario;
	private String fechaEntrega;
	
	
	
	public Pedidos(String productos, String cantidad, String direccionEntrega, String calle, String numero,
			String codPostal, String poblacion, String pais, String destinatario, String fechaEntrega) {
		super();
		this.productos = productos;
		this.cantidad = cantidad;
		this.direccionEntrega = direccionEntrega;
		this.calle = calle;
		this.numero = numero;
		this.codPostal = codPostal;
		this.poblacion = poblacion;
		this.pais = pais;
		this.destinatario = destinatario;
		this.fechaEntrega = fechaEntrega;
	}

	//getters y setters
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String getProductos() {
		return productos;
	}

	public void setProductos(String productos) {
		this.productos = productos;
	}

	public String getCantidad() {
		return cantidad;
	}

	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}

	public String getDireccionEntrega() {
		return direccionEntrega;
	}

	public void setDireccionEntrega(String direccionEntrega) {
		this.direccionEntrega = direccionEntrega;
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

	public String getCodPostal() {
		return codPostal;
	}

	public void setCodPostal(String codPostal) {
		this.codPostal = codPostal;
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

	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}

	public String getFechaEntrega() {
		return fechaEntrega;
	}

	public void setFechaEntrega(String fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

}
