package ejercicio11;

import java.util.ArrayList;

public class Blog {
	Autor autor;
	ArrayList<Entrada> entradas;
	public Blog() {
		entradas=new ArrayList<>();
	}
	public Blog(Autor autor, ArrayList<Entrada> entradas) {
		super();
		this.autor = autor;
		this.entradas = entradas;
	}
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	public ArrayList<Entrada> getEntradas() {
		return entradas;
	}
	public void setEntradas(ArrayList<Entrada> entradas) {
		this.entradas = entradas;
	}
	@Override
	public String toString() {
		String devuelve=autor.toString();
		devuelve+="\nEntradas:\n";
		for (Entrada entrada:entradas) {
			devuelve+=entrada+"\n";
		}
		return devuelve;
	}
}
