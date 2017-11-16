package ejercicio10;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import ejercicio08.Libro;

public class Metodos {
	public static ListaLibros listaLibros= new ListaLibros();
	public static void añadirLibros() {
		do {
		Libro lib = new Libro();
		lib.setISBN(MetodosGenericos.pideString("ISBN"));
		lib.setTitulo(MetodosGenericos.pideString("título"));
		lib.setAutores(pideAutores());
		lib.setEditorial(MetodosGenericos.pideString("editorial"));
		listaLibros.add(lib);
		System.out.println("¿Desea añadir más libros?");
		}while(MetodosGenericos.pideString("opcion").equalsIgnoreCase("si"));
	}

	private static ArrayList<String> pideAutores() {
		ArrayList<String>autores=new ArrayList<>();
		do {
			autores.add(MetodosGenericos.pideString("autor"));
			System.out.println("¿Desea introducir más autores?");
		}while(MetodosGenericos.pideString("opcion").equalsIgnoreCase("si"));
		return null;
	}
	public static void escribirXML() {
		XStream xStream=new XStream(new DomDriver("UTF-8"));
		System.out.println("Creando xml");
		try {//TODO
			xStream.alias("libros",ListaLibros.class);
			xStream.alias("libro",Libro.class);
			xStream.addImplicitCollection(ListaLibros.class, "lista");
			xStream.toXML(listaLibros, new FileOutputStream("src\\ejercicio10\\libros-10.xml"));
			System.out.println("Xml creado");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
