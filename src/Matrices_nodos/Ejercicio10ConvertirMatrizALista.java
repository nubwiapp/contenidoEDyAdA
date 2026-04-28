package Matrices_nodos;

public class Ejercicio10ConvertirMatrizALista {
    public static void main(String[] args) {
        int[][] matriz = {
                {0, 0, 1, 0},
                {0, 0, 0, 0},
                {1, 0, 0, 0},
                {0, 0, 0, 0}
        };

        ListaDispersa lista = new ListaDispersa();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] != 0) {
                    lista.insertar(i, j, matriz[i][j]);
                }
            }
        }

        lista.recorrer();
    }
}
