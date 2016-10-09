public class Ropa extends Articulo {
	private String talla;

	public Ropa(String talla, String descripcion, double precio){
		super (descripcion, precio);
		this.talla=talla;
	}

	public void setTalla (String talla) {
		this.talla=talla;
	}

	public String getTalla(){
		return talla;
	}
}
