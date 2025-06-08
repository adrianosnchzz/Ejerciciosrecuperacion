package ejercicioiterator1;

public class Libro {
private String titulo;
private String autor;
private Integer aniopublicacion;






public Libro (String titulo,String autor,Integer aniopublicacion) {
	this.aniopublicacion=aniopublicacion;
	this.autor=autor;
	this.titulo=titulo;
}



public void mostrarInfo() {
    System.out.println(titulo + " = " + autor + " (" + aniopublicacion + ")");
}

public String getTitulo() {
	return titulo;
}
public void setTitulo(String titulo) {
	this.titulo = titulo;
}
public String getAutor() {
	return autor;
}
public void setAutor(String autor) {
	this.autor = autor;
}
public Integer getAniopublicacion() {
	return aniopublicacion;
}
public void setAniopublicacion(Integer aniopublicacion) {
	this.aniopublicacion = aniopublicacion;
}


}
