package ejercicio10;

/**
 * Este programa crea un xml de objetos libro y despues los lee y muestra
 * 
 * @author Joaquin Alonso Perianez
 *
 */
public class Principal {

	public static void main(String[] args) {
		// TODO
		Metodos.añadirLibros();
		Metodos.escribirXML();
		Metodos.mostrar(Metodos.deserializar());

	}

}
