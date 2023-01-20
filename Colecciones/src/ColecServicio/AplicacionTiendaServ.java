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
package ColecServicio;

import java.util.*;

public class AplicacionTiendaServ {

    Scanner teclado = new Scanner(System.in).useDelimiter("\n");
    HashMap<String, Integer> productos = new HashMap();
    String producto;
    Integer precio;

    public void agregarProducto() {
        System.out.println("Ingrese el producto que desea vender y su precio");
        producto = teclado.next();
        precio = teclado.nextInt();
        productos.put(producto, precio);
        System.out.println("----- Se ha agregado correctamente el producto -------");

    }

    public void modificarPrecio() {
        System.out.println("Los productos ingresados son: ");
        for (Map.Entry<String, Integer> entry : productos.entrySet()) {
            System.out.println("Producto: " + entry.getKey() + "precio: " + entry.getValue());
        }
        System.out.println("Qué producto desea modificar su precio?");
        producto = teclado.next();
        for (Map.Entry<String, Integer> entry : productos.entrySet()) { 
            if (producto.equalsIgnoreCase(entry.getKey())) {
                System.out.println("Que precio quiere poner?");
                Integer precio2 = teclado.nextInt();
                precio = entry.setValue(precio2);
            }
        }
    }

    public void eliminarProducto() {
        System.out.println("Que producto desea eliminar?");
        producto = teclado.next();
        productos.remove(producto);
        System.out.println("---------Producto eliminado-------");
    }

    public void mostrarProducto() {
        for (Map.Entry<String, Integer> entry : productos.entrySet()) {
            System.out.println("Producto: " + entry.getKey() + ""
                    + " precio: " + entry.getValue());
        }
    }
}
