public class Usuario{
  private String nombre;
  private String email;
  private String contrasena;
  private CarritoDeCompras [5] carcompras;

	public Usuario(String nombre, String email, String contrasenia,CarritoDeCompras[] carcompras) {
		this.nombre = nombre;
		this.email = email;
		this.contrasena = contrasena;
	}

	public String getNombre() {
		return nombre;
  }
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
  }
  public  void setCarritoDeCompras(CarritoDeCompras[] carcompras){
  this.carcompras=carcompras;
  }
  public CarritoDeCompras[] getcarcompras(){
  return carcompras;
  }

}
