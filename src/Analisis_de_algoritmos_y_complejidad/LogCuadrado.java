package Analisis_de_algoritmos_y_complejidad;

public class LogCuadrado {

    public static void main(String[] args) {

        int n = 1024;
        int contador = 0;

        int i = 1;

        /*algoritmo O((log n)²)*/
        while(i < n){

            int j = 1;

            while(j < n){

                contador++;

                j = j * 2;

            }

            i = i * 2;

        }

        System.out.println("Total ejecuciones: " + contador);
    }
}