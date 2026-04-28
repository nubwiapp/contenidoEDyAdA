package Analisis_de_algoritmos_y_complejidad;

public class AnalisisAlgoritmos {

    public static void main(String[] args) {

        int n = 10;

        int contador = 0;

        /*Algoritmo O(n)*/
        for(int i = 0; i < n; i++){

            System.out.println("Iteración: " + i);

            contador++;
        }

        System.out.println("Total de ejecuciones: " + contador);

    }
}
