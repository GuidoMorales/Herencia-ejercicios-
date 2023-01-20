/*
Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)
Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.
Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario.
 */
package ColecServicio;

import java.util.*;

public class PaisesServ {

    Scanner teclado = new Scanner(System.in).useDelimiter("\n");

    HashSet< String> paises = new HashSet();
    String op;

    public void guardarPais() {

        do {
            System.out.println("Ingrese el nombre del país que desea guardar");
            paises.add(teclado.next());
            System.out.println("----------- País agregado al conjunto --------------");
            System.out.println(" ");
            System.out.println("Dese agregar otro país ? (S/N)");
            op = teclado.next();
        } while (op.equalsIgnoreCase("S"));
        System.out.println("---  Se agregaron todos los paises --------");
        System.out.println("--- Los paises agregados son: ");
        for (String paise : paises) {
            System.out.println(paise);
        }
    }

    public void ordenAlfa() {
        ArrayList< String> paisesLista = new ArrayList(paises);
        Collections.sort(paisesLista);
        System.out.println("------ Países ordenados alfabéticamente -----------");
        for (String string : paisesLista) {
            System.out.println(string);
        }
    }

    public void recorrerPaises() {
        System.out.println("---------------------------");
        System.out.println("Ingrese un país");
        op = teclado.next();
        Iterator< String> it = paises.iterator();
        while (it.hasNext()) {
            if (it.next().equalsIgnoreCase(op)) {
                it.remove();
            } else {
                System.out.println("No se encuentra el país ingresado");
            }

        }
        System.out.println("-------- Los paises de la lista son --------------");
        for (String paise : paises) {
            System.out.println(paise);
        }
    }

}
