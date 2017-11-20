package ejercicio14;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import com.google.gson.stream.JsonWriter;

import ejercicio08.Libro;

/**
 * Esta clase guarda los metodos necesarios para la funcionalidad del programa
 * 
 * @author alumno
 *
 */
public class Metodos {
	/**
	 * Este metodo lee un xml y lo devuelve como lista de objetos libro
	 * 
	 * @return
	 */
	public static ArrayList<Libro> leerXML() {
		ArrayList<Libro> lista = new ArrayList<>();
		Libro lib = null;
		XMLInputFactory factory = null;
		XMLStreamReader reader = null;
		System.out.println("leyendo xml");
		try {
			factory = XMLInputFactory.newInstance();
			reader = factory.createXMLStreamReader(new FileReader("src\\ejercicio14\\libros-14.xml"));
			while (reader.hasNext()) {// siempre que se pueda leer
				int event = reader.next();
				if (event == XMLStreamConstants.START_ELEMENT) {// si es una
																// etiqueta de
																// apertura
					String nodo = reader.getLocalName();// obtiene el nombre
					switch (nodo) {
					case "libro":
						lib = new Libro();
						break;
					case "ISBN":
						lib.setISBN(reader.getElementText());
						break;
					case "titulo":
						lib.setTitulo(reader.getElementText());// obtengo el
																// texto del
																// atributo
						break;
					case "autor":
						lib.getAutores().add(reader.getElementText());// añado
																		// el
																		// autor
						break;
					case "editorial":
						lib.setEditorial(reader.getElementText());
						break;
					default:
						break;
					}
				}
				if (event == XMLStreamConstants.END_ELEMENT && reader.getLocalName() == "libro") {
					lista.add(lib);// cuando acaba la etiqueta libro añado el
									// libro la lista
					System.out.println("*Elemento leido");
				}

			}
		} catch (FileNotFoundException e) {
			System.out.println("\tArchivo xml no encontrado");
			e.printStackTrace();
		} catch (XMLStreamException e) {
			System.out.println("\tXMLStreamException");
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (XMLStreamException e) {
				e.printStackTrace();
			}
		}

		return lista;
	}

	/**
	 * Este metodo crea un json a partir de una lista de libros
	 * 
	 * @param libros
	 */
	public static void crearJSON(ArrayList<Libro> libros) {
		System.out.println("creando json");
		JsonWriter writer = null;
		try {
			writer = new JsonWriter(new FileWriter("src\\ejercicio14\\libros.json"));
			Iterator<Libro> itLib = libros.iterator();
			writer.beginArray();
			while (itLib.hasNext()) {
				Libro lib = itLib.next();
				writer.beginObject();
				writer.name("ISBN").value(lib.getISBN());
				writer.name("titulo").value(lib.getTitulo());
				writer.name("autores");
				writer.beginArray();
				List<String> autores = lib.getAutores();
				for (int i = 0; i < autores.size(); i++) {
					writer.value(autores.get(i));
				}
				writer.endArray();
				writer.name("editorial").value(lib.getEditorial());
				writer.endObject();
			}
			writer.endArray();
			writer.close();
			System.out.println("json creado");
		} catch (IOException e) {
			System.out.println("json no creado");
			e.printStackTrace();
		}
	}
}
