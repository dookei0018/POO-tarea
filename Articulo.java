public class Articulo
{
	private String descripcion;
	private double precio;

	public Articulo(String descripcion, double precio)
	{
		this.descripcion = descripcion;
		this.precio = precio;	
	}
	
	public String getDescripcion(){ return descripcion; }
	public void setDescripcion(String descripcion){ this.descripcion = descripcion; }
	public Double getPrecio(){ return precio; }
	public void setPrecio(double precio){ this.precio = precio; }

	public double precioConIVA(){ return precio * 1.16; }
}
