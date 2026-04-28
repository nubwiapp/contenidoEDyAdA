package Matrices_fundamentos;

public class Ejercicio7ActualizarMatriz {

    public static void main(String[] args) {

        // 1. Crear la matriz
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Matriz original:");
        mostrarMatriz(matriz);

        // 2. Actualizar un valor
        actualizarValor(matriz, 1, 1, 99); // fila 1, columna 1

        System.out.println("\nMatriz después de actualizar:");
        mostrarMatriz(matriz);
    }

    // Método para mostrar la matriz
    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Método para actualizar un valor
    public static void actualizarValor(int[][] matriz, int fila, int columna, int nuevoValor) {

        // Validación de límites
        if (fila < 0 || fila >= matriz.length || columna < 0 || columna >= matriz[0].length) {
            System.out.println("Posición fuera de rango");
            return;
        }

        // Actualización
        matriz[fila][columna] = nuevoValor;
    }
}
