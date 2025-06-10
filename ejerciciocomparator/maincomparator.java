package ejerciciocomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.*;
import ejerciciocomparable.alumno;

public class maincomparator {
public static void main(String[] args) {
	ArrayList<alumno> alumnos= new ArrayList<alumno>();
	alumno a1= new alumno("lucia",6);
	alumno a2= new alumno("antonia",7);
	alumno a3= new alumno("maria",9);
	alumno a4= new alumno("jose",8);
	alumno a5= new alumno("antonio",3);

	alumnos.add(a1);
	alumnos.add(a2);
	alumnos.add(a3);
	alumnos.add(a4);
	alumnos.add(a5);
	

    System.out.println("Alumnos antes de ordenar:");
    for (alumno a : alumnos) {
        System.out.println(a);
    }

    
    Collections.sort(alumnos, new Comparator<alumno>() {
        @Override
        public int compare(alumno alumno1, alumno alumno2) {
            
            int notaComparison = Double.compare(alumno2.getNota(), alumno1.getNota()); 

            
            
               
                return alumno1.getNombre().compareTo(alumno2.getNombre()); 
            
        }
    });

    System.out.println("Alumnos después de ordenar ");
    for (alumno a : alumnos) {
        System.out.println(a);
    }
    
    
}
}




