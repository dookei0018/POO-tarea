import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Bienvenido al sistema, porfavor proporcione los siguientes datos:\n\n");
		System.out.print("Nombre:\t\t\t");
		String nombre = in.nextLine();
		System.out.print("Correo electronico:\t");
		String email = in.nextLine();
		System.out.print("Contraseña:\t\t");
		String contrasena = in.nextLine();
		CarritoDeCompras carrito = new CarritoDeCompras();
		Usuario usuario = new Usuario(nombre, email, contrasena, carrito);
		System.out.println("\n\n");
		for(int i = 0; i < 5; i++)
		{
			System.out.println("Agregando el articulo numero " + (i + 1));
			System.out.println("\tCual es su descripcion:");
			String descripcion = in.nextLine();
			System.out.println("\tCual es el precio:");
			double precio = in.nextDouble();
			carrito.agregar(new Articulo(descripcion, precio));
			in.nextLine();
		}
		System.out.println("\n\n");
		carrito.finalizar();
