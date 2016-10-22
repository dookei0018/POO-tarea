public class CarritoDeCompras
{
	private Articulo[] articulos;
	private double precioFinal;
	private int count;

	public CarritoDeCompras()
	{
		articulos = new Articulo[5];	
	}

	public Articulo[] getArticulos(){ return articulos; }
	public void setArticulos(Articulo[] articulos){ this.articulos = articulos; }
	public double getPrecioFinal(){ return precioFinal; }
	
	public void agregar(Articulo articulo)
	{
		if (count < 5)
		{
			articulos[count] = articulo;
			count++;
		}
		else
		{
			System.out.println("No hay mas espacio en tu carrito");
		}
	}

	private double calcPT()
	{
		double total = 0;
		for(int i = 0; i < 5; i++)
		{
			total += articulos[i].getPrecio();
		}
		return total;
	}

	public void finalizar()
	{
		System.out.println("Gracias por su compra!!! Total: " + calcPT());
	}
}