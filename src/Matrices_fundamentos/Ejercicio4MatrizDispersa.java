package Matrices_fundamentos;

public class Ejercicio4MatrizDispersa {
    public static void main(String[] args) {
        int[][] matriz = {
                {0, 0, 1, 0},
                {0, 0, 0, 0},
                {1, 0, 0, 0},
                {0, 0, 0, 0}
        };

        int ceros = 0;
        int total = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                total++;
                if (matriz[i][j] == 0) {
                    ceros++;
                }
            }
        }

        if (ceros > total / 2) {
            System.out.println("La matriz es dispersa.");
        } else {
            System.out.println("La matriz no es dispersa.");
        }
    }
}
