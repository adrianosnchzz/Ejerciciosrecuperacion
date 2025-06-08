package ejercicioiterator1;

import java.util.ArrayList;
import java.util.Iterator;

public class CatalogoLibros {
public static void main(String[] args) {
	
	
	ArrayList <Libro> catalogo= new ArrayList<Libro>();
	Libro l1= new Libro ("Pepe","El principito",1987);
	Libro l2= new Libro ("Maria","Caperucita roja",1999);
	Libro l3= new Libro ("Manuel","Pepa pig",2015);
	Libro l4= new Libro ("Luisa","Spiderman",2019);
	

	catalogo.add(l1);
	catalogo.add(l2);
	catalogo.add(l3);
	catalogo.add(l4);
	
Iterator<Libro> Catalogolibros= catalogo.iterator();
System.out.println("Hecho con Iterator");
while(Catalogolibros.hasNext()) {
    Libro libro = Catalogolibros.next(); 
    libro.mostrarInfo(); 
	
    
   
    	
    }
System.out.println("Echo con for each");
for(Libro libros: catalogo) {
	libros.mostrarInfo(); 
	
	
}

	
	
}
}
