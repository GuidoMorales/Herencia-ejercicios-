/*
Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
tendremos una clase Pelicula con el título, director y duración de la película (en horas).
Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
que se pide a continuación:

En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:

• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
package ColecServicio;

import ColecEntidad.Pelicula;
import java.util.*;
import java.util.Scanner;

public class PeliculaServ {
    
    Scanner teclado = new Scanner(System.in).useDelimiter("\n");
    ArrayList < Pelicula > pelis = new ArrayList();
    String titulo, director,op;
    Double horas;
        
    public void crearPeli() {
        do {                        
            System.out.println("--------------------------------------");
            System.out.println("Ingrese el título de la Película");
            titulo = teclado.next();
            System.out.println("Ingrese el director de la Película");
            director = teclado.next();
            System.out.println("Ingrese la cantidad ade horas de la Película");
            horas = teclado.nextDouble();
            
            Pelicula p = new Pelicula(titulo,director,horas);
            pelis.add(p);
            System.out.println("------- Película agregada -----");            
            System.out.println("Desea crear otra peli ? (S/N) ");
            op = teclado.next();
        } while (op.equalsIgnoreCase("S"));
    }
    
    public void mostrarPelis() {
        System.out.println("---------------------------------------");
        System.out.println("Mostrando todas las peliculas");
        for (Pelicula peli : pelis) {
            System.out.println(peli);
        }
        pelis.sort(Pelicula.compararDuracion);
        Collections.reverse(pelis);
        System.out.println("---------------------------------------------");
        System.out.println("Mostrando las peliculas por mayor duración");        
        for (Pelicula peli : pelis) {
            System.out.println(peli);
        }        
        System.out.println("---------------------------------------------");
        System.out.println("Mostrando las peliculas de menor a mayor duración");     
        pelis.sort(Pelicula.compararDuracion);
        for (Pelicula peli : pelis) {
            System.out.println(peli);
        }
        System.out.println("---------------------------------------------");
        System.out.println("Mostrando las peliculas de mayor a 1 hora");   
        for (Pelicula peli : pelis) {
            if (peli.getDuracion() >= 1) {
                System.out.println(peli);                
            }            
        }
        
        System.out.println("---------------------------------------------");
        System.out.println("Mostrando las peliculas por título de forma alfabética"); 
        pelis.sort(Pelicula.compararTitulo);
        for (Pelicula peli : pelis) {
            System.out.println(peli);            
        }
        
        System.out.println("---------------------------------------------");
        System.out.println("Mostrando las peliculas por Director de forma alfabética"); 
        pelis.sort(Pelicula.compararDirector);
        for (Pelicula peli : pelis) {
            System.out.println(peli);            
        }    
}    
}

