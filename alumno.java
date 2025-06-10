package ejerciciocomparable;

public class alumno implements Comparable<alumno>{
private String nombre;
private Integer nota;

public alumno(String nombre, Integer nota) {
	this.nombre=nombre;
	this.nota=nota;
	
}

@Override
public String toString() {
    return "Nombre: " + this.nombre + ", Nota: " + this.nota;
}










public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public Integer getNota() {
	return nota;
}
public void setNota(Integer nota) {
	this.nota = nota;
}

@Override
public int compareTo(alumno o) {
	int comparacion= this.nombre.compareTo(o.nombre);
	if (comparacion==0) comparacion=Integer.compare(this.nota, o.nota);
	return comparacion;
}















}
