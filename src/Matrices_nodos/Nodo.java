package Matrices_nodos;

class Nodo {
    int fila;
    int columna;
    int valor;
    Nodo siguiente;

    public Nodo(int fila, int columna, int valor) {
        this.fila = fila;
        this.columna = columna;
        this.valor = valor;
        this.siguiente = null;
    }
}
