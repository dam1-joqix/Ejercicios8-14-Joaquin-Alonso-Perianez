package ejercicio10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import ejercicio08.Libro;

public class Metodos {
	public static ListaLibros listaLibros= new ListaLibros();
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
	public static void mostrar(ArrayList<Libro10> lista) {
		
	}
}
