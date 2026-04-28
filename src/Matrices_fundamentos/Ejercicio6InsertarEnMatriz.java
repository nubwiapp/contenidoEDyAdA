package Matrices_fundamentos;

public class Ejercicio6InsertarEnMatriz {
    public static void main(String[] args) {
        int[][] matriz = {
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}
        };

        int usuario = 1;
        int pelicula = 2;

        matriz[usuario][pelicula] = 1;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
