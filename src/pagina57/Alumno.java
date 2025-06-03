package pagina57;

import java.util.Objects;

public class Alumno {
private String nombre;
private String dni;
private int edad;



public  Alumno (String nombre,String dni,int edad) {
	this.dni= dni;
	this.edad=edad;
	this.nombre=nombre;
}

@Override
public int hashCode() {
	 return Objects.hash(nombre,edad,dni);
	 
}


@Override
	public boolean equals(Object obj) {
		if (this==obj) return true;
		if (obj== null) return false;
		if (getClass() != obj.getClass()) return false; 
		Alumno comparacion= (Alumno) obj;
		return super.equals(obj);
	}


public String getDni() {
	return dni;
}
public void setDni(String dni) {
	this.dni = dni;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public int getEdad() {
	return edad;
}
public void setEdad(int edad) {
	this.edad = edad;
}

}
