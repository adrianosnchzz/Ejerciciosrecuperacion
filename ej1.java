package ejerciciost8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ej1 {

    public static void nuevapalabra(String nombreArchivo) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(nombreArchivo));
            StringBuilder nuevoContenido = new StringBuilder();
            String linea;
            
            while ((linea = br.readLine()) != null) {
                String[] palabras = linea.split("\\s+");
                for (int i = 0; i < palabras.length; i++) {
                    if (!palabras[i].isEmpty()) {
                        palabras[i] = cambiarPalabra(palabras[i]);
                    }
                }
                String lineaCambiada = String.join(" ", palabras);
                nuevoContenido.append(lineaCambiada).append(System.lineSeparator());
            }
            br.close();

            BufferedWriter bw = new BufferedWriter(new FileWriter(nombreArchivo));
            bw.write(nuevoContenido.toString());
            bw.close();

            System.out.println("El archivo ha sido modificado correctamente.");
        } catch (IOException e) {
            System.out.println("Error al procesar el archivo: " + e.getMessage());
        }
    }

    
    private static String cambiarPalabra(String palabra) {
        if (palabra.length() == 0) return palabra;
        return palabra.substring(0, 1).toUpperCase() + palabra.substring(1).toLowerCase();
    }
}