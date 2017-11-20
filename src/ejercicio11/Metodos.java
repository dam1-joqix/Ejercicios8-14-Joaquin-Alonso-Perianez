package ejercicio11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import com.thoughtworks.xstream.XStream;

/*
 * Esta clase guarda metodos para el funcionamiento del programa
 * @author Joaquin Alonso Perianez
 *
 */
public class Metodos {
	/**
	 * Obtiene un objeto blog a partir de un xml
	 * @return
	 */
	public static Blog deserializar() {
		System.out.println("Deserializando");
		XStream xstream = new XStream();
		xstream.alias("blog", Blog.class);
		xstream.alias("autor", Autor.class);
		xstream.alias("entrada", Entrada.class);
		xstream.addImplicitCollection(Blog.class, "entradas");
		Blog blog = new Blog();
		try {
			blog = (Blog) xstream.fromXML(new FileInputStream("src\\ejercicio11\\blog.xml"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("XML deserializqado");
		return blog;
	}
	/**
	 * Muestra los datos de un objeto blog
	 * @param blog
	 */
	public static void mostrar(Blog blog) {
		System.out.println("Datos leidos: ");
		System.out.println(blog);

	}

}
