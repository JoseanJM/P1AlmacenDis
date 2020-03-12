import java.util.Scanner;

public class MenuConsola {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		
		 String codigo;
		 String nombre;
		 String descripcion;
		 String stock;
		 String localizacion;
		 String pasillo;
		 String estanteria;
		 String estante;
		 String pendientes;
		
		System.out.println("Rellene los siguientes datos del PRODUCTO: ");
		System.out.println("Código: ");
		codigo = sc.nextLine();
		//JSON.parse();
		//JSON.stringify(new codigo(codigo));
		System.out.println("Nombre: ");
		nombre = sc.nextLine();
		System.out.println("Descripción: ");
		descripcion = sc.nextLine();
		System.out.println("Stock: ");
		stock = sc.nextLine();
		System.out.println("Localizacion: ");
		localizacion = sc.nextLine();
		System.out.println("Pasillo: ");
		pasillo = sc.nextLine();
		System.out.println("Estantería: ");
		estanteria = sc.nextLine();
		System.out.println("Estante: ");
		estante = sc.nextLine();
		System.out.println("Pendientes: ");
		pendientes = sc.nextLine();
		
		System.out.println("El codigo es: "+codigo);
		System.out.println("\nEl nombre es: "+nombre);
		System.out.println("\nLa descripcion es: "+descripcion);
		System.out.println("\nEl stock es: "+stock);
		System.out.println("\nLa localizacion es: "+localizacion);
		System.out.println("\nEl pasillo es: "+pasillo);
		System.out.println("\nLa estanteria es: "+estanteria);
		System.out.println("\nEl estante es: "+estante);
		System.out.println("\nHay pendientes: "+pendientes);
		
	}
	

}
