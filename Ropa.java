public class Ropa extends Articulo
{
	private int talla;

	public Ropa(int talla, String descripcion, double precio)
	{
		super(descripcion, precio);
		this.talla = talla;
	}
		
	public int getTalla(){ return talla; }
	public void setTalla(int talla){ this.talla = talla; }
}