package ejercicio10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import ejercicio08.Libro;
/**
 * Esta clase guarda metodos para la funcionalidad del programa
 * @author Joaquin Alonso Perianez
 *
 */
public class Metodos {
	
	public static ListaLibros listaLibros= new ListaLibros();
	/**
	 * Este metodo añade libros a una lista de libros
	 */
	public static void añadirLibros() {
		do {
		Libro10 lib = new Libro10();
		lib.setISBN(MetodosGenericos.pideString("ISBN"));
		lib.setTitulo(MetodosGenericos.pideString("título"));
		lib.setAutor(MetodosGenericos.pideString("autor"));
		lib.setEditorial(MetodosGenericos.pideString("editorial"));
		listaLibros.add(lib);
		System.out.println("¿Desea añadir más libros?");
		}while(MetodosGenericos.pideString("opcion").equalsIgnoreCase("si"));
	}

	/**
	 * Este metodo escribe un xml a partir de una lista de libros
	 */
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
	/**
	 * Este metodo lee un xml y obtiene una lista de objetos tipo libro
	 * @return
	 */
	public static ArrayList<Libro10> deserializar(){
		XStream xStream = new XStream();
		xStream.alias("libros",ListaLibros.class);
		xStream.alias("libro",Libro.class);
		xStream.addImplicitCollection(ListaLibros.class, "lista");
		List<Libro10>listaDeLibros=null;
			
			try {
				ListaLibros libros;
				libros=(ListaLibros) xStream.fromXML(new FileInputStream("src\\ejercicio10\\libros-10.xml"));
				listaDeLibros=libros.getListaLibro();
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			}
		
		
		return (ArrayList<Libro10>) listaDeLibros; //TODO
	}
	/**
	 * Este metodo muestra el contenido de una lista de libros
	 * @param lista
	 */
	public static void mostrar(ArrayList<Libro10> lista) {
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
	}
}
