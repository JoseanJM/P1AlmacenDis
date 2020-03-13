//Importamos las ultilidades para el programa
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;//utilidad para usar objetos ArrayList
import java.io.IOException;

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
	
	public static Pedido dataPedido() throws IOException{
		java.io.BufferedReader in= new BufferedReader (new InputStreamReader(System.in));
		
		String producto=null;
		String cantidad=null;
		String calle=null;
		String numero=null;
		String codPostal=null;
		String poblacion=null;
		String pais=null;
		String destinatario=null;
		String fechaEntrega=null;
		
		System.out.println("Rellene los siguientes datos del PEDIDO: ");
		System.out.println("Producto: ");
		producto = in.readLine();
		System.out.println("Cantidad: ");
		cantidad = in.readLine();
		System.out.println("Rellene la direccion de envio:");
		System.out.println("Calle: ");
		calle = in.readLine();
		System.out.println("Número: ");
		numero = in.readLine();
		System.out.println("Codigo Postal: ");
		codPostal = in.readLine();
		System.out.println("Poblacion: ");
		poblacion = in.readLine();
		System.out.println("Pais: ");
		pais = in.readLine();
		System.out.println("Destinatario: ");
		destinatario = in.readLine();
		System.out.println("Fecha de entrega aprox: ");
		fechaEntrega = in.readLine();
		
		
		Pedido pedido = new Pedido(producto,cantidad,calle,numero,codPostal,poblacion,pais,destinatario,fechaEntrega);
		return pedido;
	}
	public static  void writeToFile(String xml, String fileName) throws IOException {
	    BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
	    try {
			writer.write(xml);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			writer.close();
		}
	}
	
	public static void main(String[] args) throws IOException {
		
		ArrayList<Producto> productos = new ArrayList<Producto>();
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		ArrayList<Pedido> pedidos= new ArrayList<Pedido>();
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
			case 3:
				Pedido pedido_correcto = dataPedido();
				pedidos.add(pedido_correcto);
				break;
			case 0:
				break;
			}
		}
		//Traza para ver que me guarda cada pedido,producto,cliente que inserto
		/*
		productos.forEach((Producto)->System.out.println(Producto));
		clientes.forEach((Cliente)->System.out.println(Cliente));
		pedidos.forEach((Pedido)->System.out.println(Pedido));
		*/
		
		String header = "<?xml version=\"1.0\" encoding=\"UTF-8\">\n";
		String root = "<almacen>\n";
		String xml = "";
		xml += header + root;
		for (Producto a: productos) {
			xml += a;
			System.out.println(xml);
		}
		for (Cliente b: clientes) {
			xml += b;
			System.out.println(xml);
		}
		for (Pedido c: pedidos) {
			xml += c;
			System.out.println(xml);
		}
		String close_root = "\n</almacen>";

		xml += close_root;
		writeToFile(xml, "Almacen.xml");
	}
}
