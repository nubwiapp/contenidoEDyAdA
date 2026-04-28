package Matrices_fundamentos;

public class Ejercicio5TuplasDispersas {
    public static void main(String[] args) {
        int[][] matriz = {
                {0, 0, 1, 0},
                {0, 0, 0, 0},
                {1, 0, 0, 0},
                {0, 0, 0, 0}
        };

        System.out.println("Representación dispersa:");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] != 0) {
                    System.out.println("(" + i + ", " + j + ", " + matriz[i][j] + ")");
                }
            }
        }
    }
}
