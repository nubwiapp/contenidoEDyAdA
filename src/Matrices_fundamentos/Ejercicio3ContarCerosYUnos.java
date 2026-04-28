package Matrices_fundamentos;

public class Ejercicio3ContarCerosYUnos {
    public static void main(String[] args) {
        int[][] visualizaciones = {
                {0, 0, 1, 0},
                {0, 0, 0, 0},
                {1, 0, 0, 0},
                {0, 0, 0, 0}
        };

        int ceros = 0;
        int unos = 0;

        for (int i = 0; i < visualizaciones.length; i++) {
            for (int j = 0; j < visualizaciones[i].length; j++) {
                if (visualizaciones[i][j] == 0) {
                    ceros++;
                } else {
                    unos++;
                }
            }
        }

        System.out.println("Cantidad de ceros: " + ceros);
        System.out.println("Cantidad de unos: " + unos);
    }
}
