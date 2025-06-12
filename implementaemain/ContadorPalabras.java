package implementaemain;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ContadorPalabras {

  
    public static void contarPalabras(String nombreArchivo) {
        try {
            int palabras = 0;
            FileReader fr = new FileReader(nombreArchivo);
            BufferedReader br = new BufferedReader(fr);
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] palabrasLinea = linea.split("\\s+");
                palabras += palabrasLinea.length;
            }
            br.close();
            System.out.println(nombreArchivo + " contiene " + palabras + " palabras");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}