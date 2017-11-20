package ejercicio11;
/**
 * Esta clase guarda la información de una entrada (titulo y descripción)
 * @author Joaquin Alonso Perianez
 *
 */
public class Entrada {
	String titulo;
	String descripcion;
	public Entrada(String titulo, String descripcion) {
		super();
		this.titulo = titulo;
		this.descripcion = descripcion;
	}
	public Entrada() {
		super();
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	@Override
	public String toString(){
		return "Titulo: "+titulo+"\n\t"+"descripción:\n\t"+descripcion;
		
	}
}
