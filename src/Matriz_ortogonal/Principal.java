package Matriz_ortogonal;

public class Principal {
    public static void main(String[] args) {
        MatrizOrtogonal matriz = new MatrizOrtogonal(4, 4);

        matriz.insertar(0, 2, 1);
        matriz.insertar(2, 1, 8);
        matriz.insertar(1, 1, 5);

        matriz.mostrarPorFilas();
        System.out.println();

        matriz.mostrarPorColumnas();
        System.out.println();

        matriz.mostrarMatrizCompleta();
        System.out.println();

        System.out.println("Valor en (2,1): " + matriz.buscar(2, 1));
        System.out.println("Valor en (3,3): " + matriz.buscar(3, 3));
    }
}
