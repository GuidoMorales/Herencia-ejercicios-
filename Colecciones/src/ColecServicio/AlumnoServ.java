/*
Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
con sus 3 notas.
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
 */
package ColecServicio;

import ColecEntidad.Alumno;
import java.util.*;
import java.util.Scanner;

public class AlumnoServ {

    Scanner teclado = new Scanner(System.in).useDelimiter("\n");

    ArrayList<Alumno> alumnos = new ArrayList();
    String nombre, op;
    int media, n1,n2,n3;

    public void ingresarDatos() {
        
        do {
            
            ArrayList<Integer> notas = new ArrayList();
            System.out.println("Ingrese el nombre del Alumno");
            nombre = teclado.next();
            
            System.out.println("Ingrese las 3 notas");
            notas.add(teclado.nextInt());
            notas.add(teclado.nextInt());
            notas.add(teclado.nextInt());
            System.out.println("--- Creando alumno----");
            Alumno alu = new Alumno(nombre,notas);
            alumnos.add(alu);
            System.out.println("------- Alumno agregado a la lista --------");
            System.out.println("Desea ingresar otro usuario? (S/N)");
            op = teclado.next();
            
        } while (op.equalsIgnoreCase("S"));

    }

    public void notaFinal() {
        do {   
        
        Alumno aux = new Alumno ();
        System.out.println("Ingrese el nombre del alumno para ver su nota");
        nombre = teclado.next();
        
        int index = 0;        
        for (int i = 0; i < alumnos.size();i++) {
            aux = alumnos.get(i);
                    if (aux.getNombre().equalsIgnoreCase(nombre)) {
                        index = i;
            }            
        }        
        if (alumnos.get(index).getNombre().equalsIgnoreCase(nombre)) {
            n1 = alumnos.get(index).getNotas().get(1);
            n2 = alumnos.get(index).getNotas().get(2);
            n2 = alumnos.get(index).getNotas().get(3);            
            media = (n1 + n2 + n3) / 3;            
            System.out.println("La nota promedio del alumno ingresado es: " + media);
        } else {
            System.out.println("No se encontró el alumno");
        }
        System.out.println("Desea ver la nota de otro alumno? (S/N)");
        op = teclado.next();        
        } while (op.equalsIgnoreCase("S"));
        System.out.println(" ------ Saliendo --------");
        
    }

}

 

