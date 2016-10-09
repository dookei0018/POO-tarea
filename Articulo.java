public class Articulo{
	private String descripcion;
	private double precio;

	public Articulo (String descripcion, double precio){
		this.descripcion=descripcion;
		this.precio=precio;
	}

	public void setDescripcion(String descripcion){
			this.descripcion=descripcion;
		}

		public String getDescripcion(){
			return descripcion;
		}

		public void setPrecio(double precio){
			this.precio=precio;
		}

		public double getPrecio(){
			return precio;
		}

		public void CalcularIva(double precio){
			double iva = precio*(.16);
			precio = precio + iva;
		}
}
