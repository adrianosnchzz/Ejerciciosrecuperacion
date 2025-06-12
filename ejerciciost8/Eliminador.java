package ejerciciost8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Eliminador {

    public static void eliminarPalabra(String nombreArchivo, String palabraAEliminar) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(nombreArchivo));

            
            String nuevoNombreArchivo = generarNuevoNombre(nombreArchivo);
            
            BufferedWriter bw = new BufferedWriter(new FileWriter(nuevoNombreArchivo));
            
            String linea;
            while ((linea = br.readLine()) != null) {
            
                String nuevaLinea = linea.replaceAll("\\b" + palabraAEliminar + "\\b", "");
                
                
                nuevaLinea = nuevaLinea.replaceAll("\\s+", " ").trim();

                bw.write(nuevaLinea);
                bw.newLine();
            }
            br.close();
            bw.close();

            System.out.println("Se ha creado el archivo: " + nuevoNombreArchivo);
        } catch (IOException e) {
            System.out.println("Error al procesar el archivo: " + e.getMessage());
        }
    }

    
    private static String generarNuevoNombre(String nombreArchivo) {
        int punto = nombreArchivo.lastIndexOf('.');
        if (punto == -1) {
          
            return nombreArchivo + "_2";
        } else {
            String nombre = nombreArchivo.substring(0, punto);
            String extension = nombreArchivo.substring(punto);
            return nombre + "_2" + extension;
        }
    }
}