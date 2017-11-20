package ejercicio12;
//TODO comentar

import java.util.ArrayList;

import ejercicio08.Libro;
import ejercicio08.Metodos;
/**
 * El programa lee un xml de libros con varios autores y los convierte a objetos de la clase libro
 * @author Joaquin Alonso Perianez
 *
 */
public class Principal {

	public static void main(String[] args) {
		ArrayList<Libro> libros=Metodos.obtenerLibros();
		System.out.println("Estos son los objetos a serializar");
		Utilidades.mostrarLista(libros);
		System.out.println("Este es el json creado");
		Utilidades.serializarAJSON(libros);
		
		

	}

}
