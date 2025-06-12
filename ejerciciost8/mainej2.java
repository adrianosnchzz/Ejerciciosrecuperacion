package ejerciciost8;

import java.util.Scanner;

public class mainej2 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Introduce el nombre del archivo: ");
	        String nombreArchivo = scanner.nextLine();
	        System.out.print("Introduce la palabra a eliminar: ");
	        String palabraAEliminar = scanner.nextLine();
	        Eliminador.eliminarPalabra(nombreArchivo, palabraAEliminar);
	        scanner.close();
	    }
	}

