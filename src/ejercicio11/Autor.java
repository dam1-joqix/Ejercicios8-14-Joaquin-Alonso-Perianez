package ejercicio11;
/**
 * Esta clase guarda la informacion de un autor
 * @author Joaquin Alonso Perianez
 *
 */
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
