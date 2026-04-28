package Matrices_nodos;

public class Ejercicio9InsertarListaDispersa {
    public static void main(String[] args) {
        ListaDispersa lista = new ListaDispersa();

        lista.insertar(0, 2, 1);
        lista.insertar(2, 0, 1);

        lista.recorrer();
    }
}
