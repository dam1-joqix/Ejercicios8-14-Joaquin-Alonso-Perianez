package ejercicio13;
/**
 * Esta clase guarda los datos de un producto
 * @author Joaquin Alonso Perianez
 *
 */
public class Producto {
	String referencia;
	String nombre;
	float precio;
	int existencias;
	public Producto(String referencia, String nombre, float precio, int existencias) {
		super();
		this.referencia = referencia;
		this.nombre = nombre;
		this.precio = precio;
		this.existencias = existencias;
	}
	public Producto() {
		super();
	}
	public String getReferencia() {
		return referencia;
	}
	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public int getExistencias() {
		return existencias;
	}
	public void setExistencias(int existencias) {
		this.existencias = existencias;
	}
	@Override
	public String toString() {
		return "Producto [referencia=" + referencia + ", nombre=" + nombre + ", precio=" + precio + ", existencias="
				+ existencias + "]";
	}
}
