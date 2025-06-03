package pagina57;

import java.util.HashSet;
import java.util.Set;

public class main {
	
    public static void main(String[] args) {
        Set<Alumno> clase = new HashSet<>();
        Alumno a1 = new Alumno("ana", "12345n", 14);
        Alumno a2 = new Alumno("pepe", "76543m", 15);
        Alumno a3 = new Alumno("pepe", "2345g", 13);
        Alumno a4 = new Alumno("Pepe", "2345g", 13);
        clase.add(a1);
        clase.add(a2);
        clase.add(a3);
        clase.add(a4);

        System.out.println("HashCode de a3: " + a3.hashCode());
        System.out.println("HashCode de a4: " + a4.hashCode());

      System.out.println("iquals es "+ a3.equals(a4));
       
        }
    }

