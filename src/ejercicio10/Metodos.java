package ejercicio10;

import java.util.ArrayList;

import ejercicio08.Libro;

public class Metodos {
	public static ArrayList<Libro>libros=new ArrayList<>();
	public void a�adirLibros() {
		do {
		Libro lib = new Libro();
		lib.setISBN(MetodosGenericos.pideString("ISBN"));
		lib.setTitulo(MetodosGenericos.pideString("t�tulo"));
		lib.setAutores(pideAutores());
		lib.setEditorial(MetodosGenericos.pideString("editorial"));
		libros.add(lib);
		System.out.println("�Desea a�adir m�s libros?");
		}while(MetodosGenericos.pideString("opcion").equalsIgnoreCase("si"));
	}

	private static ArrayList<String> pideAutores() {
		ArrayList<String>autores=new ArrayList<>();
		do {
			autores.add(MetodosGenericos.pideString("autor"));
			System.out.println("�Desea introducir m�s autores?");
		}while(MetodosGenericos.pideString("opcion").equalsIgnoreCase("si"));
		return null;
	}
}
