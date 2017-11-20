package ejercicio14;

/**
 * Este emtodo lee un xml de libros y crea un json con los datos contenidos en
 * el
 * 
 * @author Joaquin Alonso Perianez
 *
 */
public class Principal {

	public static void main(String[] args) {
		Metodos.crearJSON(Metodos.leerXML());

	}

}
