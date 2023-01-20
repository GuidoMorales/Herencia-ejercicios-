/*
 
 */
package colecciones;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        ArrayList< String> razas = new ArrayList();
        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        String opcion = " ";

        do {
            System.out.println("Ingrese una raza de perro");
            razas.add(teclado.next());
            System.out.println(" ¿ Quiere ingresar otra raza de perro (S) o prefiere salir (N) ? ");
            opcion = teclado.next();

        } while (opcion.equalsIgnoreCase("S"));

        for (String raza : razas) {
            System.out.println(raza);
        }

    }

}
