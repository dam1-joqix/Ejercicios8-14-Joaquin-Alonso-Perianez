package ejercicio10;
//TODO comentar


public class Libro10 {
	public String ISBN;
	public String titulo;
	public String autor;
	public String editorial;

	public Libro10() {
		
	}
	
	public String getAutor() {
		return autor;
	}
	public String getEditorial() {
		return editorial;
	}
	public String getISBN() {
		return ISBN;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	@Override
	public String toString() {
		String devuelve="ISBN: "+ISBN+" Título: "+titulo+" Autor: "+autor+" Editorial: "+editorial+" \n";
		
		return devuelve;
	}

}
