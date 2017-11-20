package ejercicio12;
import java.util.ArrayList;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ejercicio08.Libro;
/**
 * Esta clase guarda metodos para la funcionalidad del programa
 * @author Joaquin Alonso Perianez
 *
 */
public class Utilidades {
	/**
	 * Este metodo muestra los libros contenidos en una lista
	 * @param lista
	 */
	public static void mostrarLista(ArrayList<Libro> lista){
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
	}
	/**
	 * ESte metodo muestra el contenido de una lista de libros como json
	 * @param lista
	 */
	public static void serializarAJSON(ArrayList<Libro> lista){
		Gson prettyGson=new GsonBuilder().setPrettyPrinting().create();
		System.out.println(prettyGson.toJson(lista));
	}
}
