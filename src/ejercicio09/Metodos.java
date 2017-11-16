package ejercicio09;
//TODO comentar
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;


import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

public class Metodos {
	public static void mostrarSueldoSuperior30000(ArrayList<Empleado>empleados) {
		System.out.println("Estos son los empleados cuyo sueldo es superior o igual a 30000");
		Collections.sort(empleados);
		for (Empleado empleado : empleados) {
			if(empleado.getSalario()>=30000) {
				System.out.println(empleado);
			}
		}
	}
	public static ArrayList<Empleado> getEmpleados() {
		ArrayList<Empleado> listaEmpleados = new ArrayList<>();
		try {
			Empleado empAux = null;
			Direccion dirAux = null;
			XMLInputFactory factory = XMLInputFactory.newInstance();
			XMLStreamReader reader = factory.createXMLStreamReader(new FileReader("src\\ejercicio09\\empleados.xml"));
			System.out.println("leyendo xml");
			while (reader.hasNext()) {
				int event = reader.next();// registramos el evento
				if (event == XMLStreamConstants.START_ELEMENT) {
					// si es un elemento de apertura
					String nodo = reader.getLocalName();
					switch (nodo) {
					case "empleado":
						empAux=new Empleado();
						empAux.setId(reader.getAttributeValue(0));
						break;
					case "nombre":
						empAux.setNombre(reader.getElementText());
						break;
					case "apellido":
						empAux.setApellido(reader.getElementText());
						break;
					case "salario":
						empAux.setSalario(Integer.parseInt(reader.getElementText()));
						break;
					case "cargo":
						empAux.setCargo(reader.getElementText());
						break;
					case "direccion":
						dirAux=new Direccion();
						break;
					case "ciudad":
						dirAux.setCiudad(reader.getElementText());
						break;
					case "provincia":
						dirAux.setProvincia(reader.getElementText());
						break;
					case "cp":
						dirAux.setCp(reader.getElementText());
						break;
					case "calle":
						dirAux.setCalle(reader.getElementText());
						break;
					case "departamento":
						empAux.setDepartamento(reader.getElementText());
					}//fin switch
				}//fin if
				if(event==XMLStreamConstants.END_ELEMENT&&reader.getLocalName().equals("empleado")) {
					listaEmpleados.add(empAux);
				}
				if(event==XMLStreamConstants.END_ELEMENT&&reader.getLocalName().equals("direccion")) {
					empAux.setDireccion(dirAux);
				}
			}//fin while
			
			reader.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (XMLStreamException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO
		return listaEmpleados;
	}
}
