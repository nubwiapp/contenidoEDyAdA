package Matrices_fundamentos;

public class Ejercicio1RecorrerMatriz {
    public static void main(String[] args) {
        int[][] visualizaciones = {
                {1, 0, 0, 1},
                {0, 1, 0, 0},
                {0, 0, 1, 0}
        };

        for (int i = 0; i < visualizaciones.length; i++) {
            for (int j = 0; j < visualizaciones[i].length; j++) {
                System.out.print(visualizaciones[i][j] + " ");
            }
            System.out.println();
        }
    }
}
