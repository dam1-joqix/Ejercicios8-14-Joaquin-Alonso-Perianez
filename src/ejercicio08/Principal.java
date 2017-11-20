package ejercicio08;


import java.util.ArrayList;
/**
 * El programa lee un xml de libros con varios autores y los convierte a objetos de la clase libro
 * @author Joaquin Alonso Perianez
 *
 */
public class Principal {

	public static void main(String[] args) {
		ArrayList<Libro> libros=Metodos.obtenerLibros();
		Metodos.mostrarLibros(libros);

	}

}
