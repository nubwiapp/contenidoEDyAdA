package Analisis_de_algoritmos_y_complejidad;

public class AlgoritmoNLogN {

    public static void main(String[] args) {

        int n = 10;
        int contador = 0;

        /*Algoritmo O(n log n)*/
        for(int i=0;i<n;i++){

            int j=1;

            while(j<n){

                j = j * 2;

                contador++;

            }

        }

        System.out.println("Total de ejecuciones: " + contador);

    }
}
