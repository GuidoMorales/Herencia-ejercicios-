/*
Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio: 

HACER: Como, introducir un elemento, modificar su precio, eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). 

El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package colecciones;

import ColecServicio.AplicacionTiendaServ;
import java.util.*;


public class AplicacionTiendaMain {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        AplicacionTiendaServ tiendaserv = new AplicacionTiendaServ();        
        
        int op;
        do {
            System.out.println("-----------------");
            System.out.println("ingrese su opcion \n"
                    + "1. Agregar producto\n"
                    + "2. Modificar precio\n"
                    + "3. Eliminar producto\n"
                    + "4. Mostrar producto\n"
                    + "5. Salir\n");                    
           op = teclado.nextInt();      
           switch (op) {
               case 1: 
                   tiendaserv.agregarProducto();
                   break;
               case 2:
                   tiendaserv.modificarPrecio();
                   break;
               case 3:
                   tiendaserv.eliminarProducto();
                   break;
               case 4:
                   tiendaserv.mostrarProducto();
                   break;               
               case 5:
                   System.out.println(" Saliendo ");
                   break;
               default: 
                   System.out.println(" La opción es incorrecta ");
           }               
        } while (op != 5);        
    }
    
}
