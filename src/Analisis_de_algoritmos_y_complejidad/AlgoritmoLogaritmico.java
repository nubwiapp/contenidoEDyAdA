package Analisis_de_algoritmos_y_complejidad;

public class AlgoritmoLogaritmico {

    public static void main(String[] args) {

        int n = 100;
        int contador = 0;

        int i = 1;

        while(i < n){

            System.out.println("Valor: " + i);

            i = i * 2;

            contador++;

        }

        System.out.println("Total de ejecuciones: " + contador);

    }
}
