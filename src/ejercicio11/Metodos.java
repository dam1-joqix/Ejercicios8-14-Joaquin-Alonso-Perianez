package ejercicio11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;


import com.thoughtworks.xstream.XStream;

public class Metodos {

	public static Blog deserializar() {
		System.out.println("Deserializando");
		XStream xstream=new XStream();
		xstream.alias("blog", Blog.class);
		xstream.alias("autor",Autor.class);
		xstream.alias("entrada",Entrada.class);
		xstream.addImplicitCollection(Blog.class,"entradas");
		Blog blog=new Blog();
		try {
			blog=(Blog)xstream.fromXML(new FileInputStream("src\\ejercicio11\\blog.xml"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("XML deserializqado");
		return blog;
	}

	public static void mostrar(Blog blog) {
		System.out.println("Datos leidos: ");
		System.out.println(blog);
		
	}

}
