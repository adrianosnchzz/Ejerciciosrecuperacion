package implementacionpag33;

public class Alumno implements PersonaCentroEducativo {
	private String nombre;
	private String nia;
	private int edad;
	
	public Alumno (String nombre,String nia,int edad) {
		this.edad=edad;
		this.nia=nia;
		this.nombre=nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNia() {
		return nia;
	}
	public void setNia(String nia) {
		this.nia = nia;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	@Override
    public String toString() {
        return "Nombre: " + nombre;
    }
}
