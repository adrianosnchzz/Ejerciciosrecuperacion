
package ejerciciocomparable;

import java.util.ArrayList;
import java.util.Collections;

public class main {
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
		
		Collections.sort(alumnos);
		System.out.println(alumnos);
		
	
		
		
			
	}
}
