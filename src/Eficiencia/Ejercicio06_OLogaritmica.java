package Eficiencia;

import java.util.Scanner;

/*
* EJERCICIO 6. Complejidad logarítmica — O(log n)
* Idea
* En vez de avanzar de 1 en 1, el problema se reduce a la mitad.
*
* */

public class Ejercicio06_OLogaritmica {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el valor de n: ");
        int n = sc.nextInt();

        int contador = 0;

        for (int i = n; i > 1; i = i / 2) {
            contador++;
            System.out.println("Valor actual de i: " + i);
        }

        System.out.println("Total de iteraciones: " + contador);
        System.out.println("Complejidad: O(log n)");

        sc.close();
    }
}

/*
* Si n = 16, el comportamiento sería:
16
8
4
2
1
Solo unas pocas iteraciones.
* */
