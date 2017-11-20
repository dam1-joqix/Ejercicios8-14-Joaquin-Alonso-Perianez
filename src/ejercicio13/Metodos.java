package ejercicio13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

/**
 * Esta clase guarda metodos para la funcionalidad del programa
 * 
 * @author Joaquin Alonso Perianez
 *
 */
public class Metodos {
	/**
	 * Este metodo lee un archivo json y muestra los objetos producto contenidos en
	 * el por pantalla
	 */
	public static void leerJson() {
		FileInputStream fis = null;
		JsonReader reader = null;
		Gson gson = new Gson();
		try {
			fis = new FileInputStream("src\\ejercicio13\\productos.json");
			reader = new JsonReader(new InputStreamReader(fis, "UTF-8"));
			reader.beginArray();
			while (reader.hasNext()) {
				Producto producto = gson.fromJson(reader, Producto.class);
				System.out.println(producto);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
