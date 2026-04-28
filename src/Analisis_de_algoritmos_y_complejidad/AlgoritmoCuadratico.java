package Analisis_de_algoritmos_y_complejidad;

public class AlgoritmoCuadratico {

    public static void main(String[] args) {

        int n = 5;
        int contador = 0;

        /*Algoritmo O(n²)*/
        for(int i=0;i<n;i++){

            for(int j=0;j<n;j++){

                System.out.println(i + " " + j);

                contador++;

            }

        }

        System.out.println("Total de ejecuciones: " + contador);

    }
}
