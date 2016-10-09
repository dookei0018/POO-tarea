public class CarritoDeCompras{
  private String descripcion;
  private double precio;

	public CarritoDeCompras(String descripcion, double precio) {
		this.descripcion = descripcion;
		this.precio = precio;
	}

  public void finalizar(){
    int preciofinal = 0;
      for (int i=0;i < carrito.length; i ++){
        preciofinal=preciofinal + carcompras[i];
    }
    System.out.println(preciofinal);
  }

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}


}
