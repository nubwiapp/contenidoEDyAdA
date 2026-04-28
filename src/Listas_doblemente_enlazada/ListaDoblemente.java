package Listas_doblemente_enlazada;

public class ListaDoblemente {

    Nodo cabeza;

    /*insertar nodos*/
    public void insertarInicio(int dato) {

         //10-20-30
        Nodo nuevo = new Nodo(dato);

        //nuevo = [ null | 10 | null]
        //nuevo = [ null | 20 | 10]
        //nuevo = [ null | 30 | 20]

        if (cabeza != null) {
            cabeza.anterior = nuevo;
            nuevo.siguiente = cabeza;
        }

        cabeza = nuevo;

        //cabeza = [ null | 30 | 20] <-> [ 30 | 20 | 10] <-> [ 20 | 10 | null]
    }

    /*Recorrer lista hacia adelante*/
    public void recorrer() {

        //cabeza = [ null | 30 | 20] <-> [ 30 | 20 | 10] <-> [ 20 | 10 | null]

        Nodo actual = cabeza;

        while (actual != null) {

            System.out.print(actual.dato + " -> ");
            actual = actual.siguiente;

            //imprimir : 30, 20,
        }

    }

    /*Recorrer la lista hacia atrás*/
    public void recorrerAtras() {

        //cabeza = [ null | 30 | 20] <-> [ 30 | 20 | 10] <-> [ 20 | 10 | null]

        Nodo actual = cabeza;

        while (actual.siguiente != null) {
            actual = actual.siguiente;
        }

        //cabeza = [ null | 30 | 20] <-> [ 30 | 20 | 10] <-> [ 20 | 10 | null]

        while (actual != null) {

            System.out.print(actual.dato + " <- ");
            actual = actual.anterior;

            //imprimir: 10, 20, 30

        }

    }


}
