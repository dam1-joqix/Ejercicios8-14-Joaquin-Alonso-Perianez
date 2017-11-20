package ejercicio10;
import java.util.ArrayList;
import java.util.List;
/**
 * Esta clase guarda una lista de objetos libro
 * @author alumno
 *
 */
public class ListaLibros {
	private List<Libro10> lista = new ArrayList<Libro10>();

	public ListaLibros() {
	}

	public void add(Libro10 lib) {
		lista.add(lib);
	}

	public List<Libro10> getListaLibro() {
		return lista;
	}
}
