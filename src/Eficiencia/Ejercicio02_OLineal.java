package Eficiencia;

import java.util.Scanner;


/*
* EJERCICIO 2. Complejidad lineal — O(n)
* Idea
* El número de operaciones crece proporcionalmente con n.
** */

public class Ejercicio02_OLineal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el valor de n: ");
        int n = sc.nextInt();

        int contador = 0;

        for (int i = 0; i < n; i++) {
            contador++;
            System.out.println("Iteración: " + i);
        }

        System.out.println("Total de operaciones del ciclo: " + contador);
        System.out.println("Complejidad: O(n)");

        sc.close();
    }
}

/*
* Si n = 5, el ciclo repite 5 veces.
* Si n = 100, repite 100 veces.
* Entonces el crecimiento es lineal.
*
* */