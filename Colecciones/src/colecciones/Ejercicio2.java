/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio2 {

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

        System.out.println("Ingrese la raza que desea eliminar");
        razas.remove(teclado.next());

        Collections.sort(razas);
        for (String raza : razas) {
            System.out.println(raza);
        }
    }
}
