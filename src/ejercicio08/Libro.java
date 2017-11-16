package ejercicio08;
//TODO comentar
import java.util.ArrayList;

public class Libro {
	public String ISBN;
	public String titulo;
	public ArrayList<String> autores;
	public String editorial;

	public Libro() {
		autores=new ArrayList<>();
	}
	
	public ArrayList<String> getAutores() {
		return autores;
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
	public void setAutores(ArrayList<String> autores) {
		this.autores = autores;
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
		String devuelve="ISBN: "+ISBN+" Título: "+titulo+" Editorial: "+editorial+" Autores: \n\t";
		for (int i = 0; i < autores.size(); i++) {
			devuelve+=autores.get(i)+" , ";
		}
		return devuelve;
	}

}
