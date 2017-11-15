package ejercicio09;

public class Direccion {
	private String ciudad, provincia, cp, calle;
	public Direccion() {
		// TODO Auto-generated constructor stub
	}
	public Direccion(String ciudad, String provincia, String cp, String calle) {
		super();
		this.ciudad = ciudad;
		this.provincia = provincia;
		this.cp = cp;
		this.calle = calle;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public String getCp() {
		return cp;
	}
	public void setCp(String cp) {
		this.cp = cp;
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	@Override
	public String toString() {
		return "\n\tCalle "+calle+" "+ciudad+"("+provincia+") "+cp;
	}
}
