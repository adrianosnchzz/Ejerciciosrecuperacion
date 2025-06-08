package EjercicioMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class ej {
public static void main(String[] args) {
	Map<String, Integer> productos = new HashMap();
	productos.put("pan", 10);
	productos.put("queso", 8);
	productos.put("tomate", 0);
	productos.put("aceite", 13);
	
	
	Scanner entrada= new Scanner(System.in);
	
	
	for (String imp: productos.keySet()) {
		
			System.out.println("En el almacen hay "+ imp +" con una cantidad de "+productos.get(imp));
		}
	 
	
	System.out.println("Añade o resta el numero de panes ");
	int num = entrada.nextInt(); 
	productos.put("pan", productos.getOrDefault("pan", 0)+num);
	 System.out.println("Pulse 1 si quiere borrar el producto pan");
	
	 int opc= entrada.nextInt();
	 if (opc==1) {
	 productos.remove("pan");
	 }else {
		 System.out.println("Ha elegido no borrar el producto");
	 }
	
	
	for (String clave: productos.keySet()) {
		if (productos.get(clave)>0) {
			System.out.println("si hay del producto "+ clave +" con una cantidad de "+productos.get(clave));
		}else { 
			System.out.println("no quedan unidades del producto "+clave);
			
		}
		

}
	productos.put("pan", productos.getOrDefault("queso", 4)+3);
	 
	String productoMayor = null;
     int mayorCantidad = 0;

     for (Map.Entry<String, Integer> entry : productos.entrySet()) {
         if (entry.getValue() > mayorCantidad) {
             mayorCantidad = entry.getValue();          
             productoMayor = entry.getKey();             
         }
     }
     
     System.out.println("El producto con mayor cantidad de stock es "+productoMayor+" con una cantidad de "+mayorCantidad);
	
}
}
