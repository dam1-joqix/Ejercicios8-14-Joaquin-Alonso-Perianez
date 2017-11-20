package ejercicio09;


/**
 * Esta clase guarda la informacion de un empleado, implementa comparable para poder ordenarlos por sueldo
 * @author Joaquin Alonso Perianez
 *
 */

public class Empleado implements Comparable<Empleado>{
	private String id;
	private String nombre;
	private String apellido;
	private String departamento;
	private int salario;
	private Direccion direccion;
	private String cargo;

	public Empleado() {

	}

	@Override
	public String toString() {

		return "Id: " + id + " Nombre: " + nombre + " Apellido: " + apellido + " Departamento: " + departamento
				+ " Salario: " + salario + " Cargo: " + cargo + " Direcci�n";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	@Override
	public int compareTo(Empleado o) {
		if(this.salario==o.getSalario()) {
			return 0;
		}else {
			if(salario<o.getSalario()) {
				return -1;
			}else {
				return 1;
			}
		}
		
	}

	
}
