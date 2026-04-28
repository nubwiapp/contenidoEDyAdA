package Eficiencia;

import java.util.Scanner;

/*
* EJERCICIO 3. Dos ciclos separados — O(n + n) = O(n)
* Idea
* Aquí hay dos ciclos, pero no están uno dentro del otro.
* Entonces no se multiplican, se suman.
*
* */

public class Ejercicio03_ODosCiclosSeparados {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el valor de n: ");
        int n = sc.nextInt();

        int contador = 0;

        System.out.println("Primer ciclo:");
        for (int i = 0; i < n; i++) {
            contador++;
            System.out.println("i = " + i);
        }

        System.out.println("Segundo ciclo:");
        for (int j = 0; j < n; j++) {
            contador++;
            System.out.println("j = " + j);
        }

        System.out.println("Total de operaciones: " + contador);
        System.out.println("Análisis: O(n + n) = O(2n) = O(n)");

        sc.close();
    }
}

/*
* Se suele creen que dos for ya significan O(n²), pero eso es falso.
* Solo es O(n²) si están anidados.
*
* */
