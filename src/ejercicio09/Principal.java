package ejercicio09;

/**
 * Este programa lee un fichero xml y muestra los empleados contenidos en el
 * cuyo sueldo es mayor a 30000
 * 
 * @author Joaquin Alonso Perianez
 *
 */
public class Principal {

	public static void main(String[] args) {
	
		Metodos.mostrarSueldoSuperior30000(Metodos.getEmpleados());

	}

}
