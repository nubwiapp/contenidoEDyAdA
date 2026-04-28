package Matrices_nodos;

class ListaDispersa {

    Nodo cabeza;

    public void insertar(int fila, int columna, int valor) {
        Nodo nuevo = new Nodo(fila, columna, valor);
        //[ 0 | 0 | 5 | null ]
        //cabeza y aux
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo aux = cabeza;
            while (aux.siguiente != null) {
                aux = aux.siguiente;
            }
            aux.siguiente = nuevo;
        }
    }

    public void recorrer() {
        Nodo aux = cabeza;
        while (aux != null) {
            System.out.println("(" + aux.fila + ", " + aux.columna + ", " + aux.valor + ")");
            aux = aux.siguiente;
        }
    }
}
