//Importamos las ultilidades para el programa
import java.io.BufferedReader; 
import java.io.InputStreamReader;
import java.util.ArrayList;//utilidad para usar objetos ArrayList
import java.io.IOException;//utilidad de IN/OUT

public class Main {
	
	public static void generamenu() {
		System.out.println("####################");
		System.out.println("1.-  Introducir datos de un Producto");
		System.out.println("2.-  Introducir datos de un cliente");
		System.out.println("3.-  Hacer un pedido");
		System.out.println("0.-  Salir");
	}



	public static Producto dataProd() throws IOException{
		java.io.BufferedReader in= new BufferedReader (new InputStreamReader(System.in));
		
		 String codigo=null;
		 String nombre=null;
		 String descripcion=null;
		 String stock=null;
		 String pasillo=null;
		 String estanteria=null;
		 String estante=null;
		 String pendientes=null;
		
		System.out.println("Rellene los siguientes datos del PRODUCTO: ");
		System.out.println("Código: ");
		codigo = in.readLine();
		System.out.println("Nombre: ");
		nombre = in.readLine();
		System.out.println("Descripción: ");
		descripcion = in.readLine();
		System.out.println("Stock: ");
		stock = in.readLine();
		System.out.println("Localizacion: ");
		//localizacion = in.readLine();
		System.out.println("Pasillo: ");
		pasillo = in.readLine();
		System.out.println("Estantería: ");
		estanteria = in.readLine();
		System.out.println("Estante: ");
		estante = in.readLine();
		System.out.println("Pendientes: ");
		pendientes = in.readLine();

		Producto producto = new Producto(codigo,nombre,descripcion,stock,pasillo,estanteria,estante,pendientes);
		
		return producto;
	}
	
	public static Cliente dataCliente() throws IOException{
		java.io.BufferedReader in= new BufferedReader (new InputStreamReader(System.in));
		
		String nombre=null;
		String apellidos=null;
		String email=null;
		String telefono=null;
		String calle=null;
		String numero=null;
		String codpostal=null;
		String poblacion=null;
		String pais=null;
		
		System.out.println("Rellene los siguientes datos del CLIENTE: ");
		System.out.println("Nombre: ");
		nombre = in.readLine();
		System.out.println("Apellidos(2): ");
		apellidos = in.readLine();
		System.out.println("Email: ");
		email = in.readLine();
		System.out.println("Telefono: ");
		telefono = in.readLine();
		System.out.println("Dirección: ");
		System.out.println("Calle: ");
		calle = in.readLine();
		System.out.println("Numero: ");
		numero = in.readLine();
		System.out.println("Código Postal: ");
		codpostal = in.readLine();
		System.out.println("Población: ");
		poblacion = in.readLine();
		System.out.println("País: ");
		pais = in.readLine();
		
		Cliente cliente = new Cliente(nombre,apellidos,email,telefono,calle,numero,codpostal,poblacion,pais);
		return cliente;
	}
	
	public static void main(String[] args) throws IOException {
		
		ArrayList<Producto> productos = new ArrayList<Producto>();
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		int menu = -1;
		
		java.io.BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		while (menu != 0) {
			generamenu();
			menu = Integer.parseInt(in.readLine());
			
			switch (menu) {
			case 1:
				Producto producto_correcto = dataProd();
				productos.add(producto_correcto);
				break;
			case 2:
				Cliente cliente_correcto = dataCliente();
				clientes.add(cliente_correcto);
				break;
			case 0:
				break;
			}
		}
		productos.forEach((Producto)->System.out.println(Producto));
		clientes.forEach((Cliente)->System.out.println(Cliente));
	}
}
