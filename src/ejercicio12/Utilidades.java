package ejercicio12;
import java.util.ArrayList;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import ejercicio08.Libro;
public class Utilidades {
	public static void mostrarLista(ArrayList<Libro> lista){
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
	}
	public static void serializarAJSON(ArrayList<Libro> lista){
		Gson prettyGson=GsonBuilder().setPrettyPrinting().create();
		System.out.println(prettyGson.toJson(lista));
	}
}
