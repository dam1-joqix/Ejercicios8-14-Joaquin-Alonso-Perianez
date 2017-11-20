package ejercicio11;

public class Autor {
	String nombre;
	public Autor() {
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Autor(String nombre) {
		super();
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return " Autor: " + nombre;
	}
}
