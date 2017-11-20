package ejercicio10;
import java.util.Scanner;

public class MetodosGenericos {
	/**
	 * Este metodo pide un dato por teclado y lo devuelve como String
	 * @param tipo
	 * @return
	 */
	public static String pideString(String tipo) {
		String palabra="";
		Scanner scan =new Scanner(System.in);
		boolean correcto=false;
		System.out.println("Introduce "+tipo);
		do {
			try {
				palabra=scan.nextLine();
				correcto=true;
			}catch(Exception e) {
				System.out.println("introduce de nuevo "+tipo);
			}
		}while(!correcto);
		return palabra;
	}
}
