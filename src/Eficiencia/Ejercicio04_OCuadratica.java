package Eficiencia;

import java.util.Scanner;

/*
* EJERCICIO 4. Complejidad cuadrática — O(n²)
* Idea
* Un ciclo dentro de otro ciclo.
*
* */

public class Ejercicio04_OCuadratica {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el valor de n: ");
        int n = sc.nextInt();

        int contador = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                contador++;
                System.out.println("i = " + i + ", j = " + j);
            }
        }

        System.out.println("Total de operaciones: " + contador);
        System.out.println("Complejidad: O(n^2)");

        sc.close();
    }
}

/*
* Si n = 3, se ejecuta:
* 3 veces el ciclo externo
* y por cada una, 3 veces el interno
* Entonces:
* 3 × 3 = 9
* Si n = 10, serían 100 repeticiones.
*
* */
