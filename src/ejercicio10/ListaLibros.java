package ejercicio10;

import java.util.ArrayList;
import java.util.List;

import ejercicio08.Libro;

public class ListaLibros {
	private List<Libro> lista = new ArrayList<Libro>();

	public ListaLibros() {
	}

	public void add(Libro lib) {
		lista.add(lib);
	}

	public List<Libro> getListaLibro() {
		return lista;
	}
}
