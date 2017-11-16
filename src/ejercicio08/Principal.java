package ejercicio08;
//TODO comentar

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		ArrayList<Libro> libros=Metodos.obtenerLibros();
		Metodos.mostrarLibros(libros);

	}

}
