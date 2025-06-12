package implementaemain;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el nombre del archivo : ");
        String nombreArchivo = scanner.nextLine();
        ContadorPalabras.contarPalabras(nombreArchivo);
        scanner.close();
    }
}