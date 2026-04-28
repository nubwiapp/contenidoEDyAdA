package Eficiencia;

/*
* EJERCICIO 7. Complejidad n log n — O(n log n)
* Idea
* Un ciclo externo que corre n veces, y dentro otro que divide entre 2.
*
* */
import java.util.Scanner;

public class Ejercicio07_ONLogN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el valor de n: ");
        int n = sc.nextInt();

        int contador = 0;

        for (int i = 0; i < n; i++) {
            for (int j = n; j > 1; j = j / 2) {
                contador++;
                System.out.println("i = " + i + ", j = " + j);
            }
        }

        System.out.println("Total de operaciones: " + contador);
        System.out.println("Complejidad: O(n log n)");

        sc.close();
    }
}

/*
* Se combina:
un crecimiento lineal n
con uno logarítmico log n

Por eso:
O(n log n)
* */
