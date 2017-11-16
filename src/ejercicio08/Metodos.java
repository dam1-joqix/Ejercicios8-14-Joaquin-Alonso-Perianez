package ejercicio08;
//TODO comentar
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

public class Metodos {
	/**
	 * Este método devuelve una lista de objetos tipo libro cuyos datos obtiene de
	 * un archivo xml
	 * 
	 * @return lista de libros
	 */
	public static ArrayList<Libro> obtenerLibros() {
		ArrayList<Libro> lista = new ArrayList<>();
		Libro lib = null;
		XMLInputFactory factory = null;
		XMLStreamReader reader = null;
		System.out.println("leyendo xml");
		try {
			factory = XMLInputFactory.newInstance();
			reader = factory.createXMLStreamReader(new FileReader("src\\ejercicio08\\libros.xml"));
			while (reader.hasNext()) {// siempre que se pueda leer
				int event = reader.next();
				if (event == XMLStreamConstants.START_ELEMENT) {// si es una etiqueta de apertura
					String nodo = reader.getLocalName();// obtiene el nombre
					switch (nodo) {
					case "libro":
						lib = new Libro();
						lib.setISBN(reader.getAttributeValue(0));// obtengo el primer atributo (solo hay uno en este
																	// caso)
						break;
					case "titulo":
						lib.setTitulo(reader.getElementText());// obtengo el texto del atributo
						break;
					case "autor":
						lib.getAutores().add(reader.getElementText());// añado el autor
						break;
					case "editorial":
						lib.setEditorial(reader.getElementText());
						break;
					default:
						break;
					}
				}
				if (event == XMLStreamConstants.END_ELEMENT && reader.getLocalName() == "libro") {
					lista.add(lib);//cuando acaba la etiqueta libro añado el libro la lista
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
	 * Este método recibe un arrayList de libros y los muestra por pantalla
	 * 
	 * @param libros
	 *            lista de libros
	 */
	public static void mostrarLibros(ArrayList<Libro> libros) {
		System.out.println("Estos son los datos de los libros: ");
		for (Libro libro : libros) {
			System.out.println(libro);
		}

	}

}
