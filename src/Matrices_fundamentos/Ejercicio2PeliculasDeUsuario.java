package Matrices_fundamentos;

public class Ejercicio2PeliculasDeUsuario {
    public static void main(String[] args) {
        int[][] visualizaciones = {
                {1, 0, 0, 1},
                {0, 1, 1, 0},
                {0, 0, 1, 0}
        };

        int usuarioBuscado = 1; // usuario en posición 1

        System.out.println("Películas vistas por el usuario " + usuarioBuscado + ":");

        for (int j = 0; j < visualizaciones[usuarioBuscado].length; j++) {
            if (visualizaciones[usuarioBuscado][j] == 1) {
                System.out.println("Película " + j);
            }
        }
    }
}
