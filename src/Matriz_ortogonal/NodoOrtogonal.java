package Matriz_ortogonal;

class NodoOrtogonal {
    int fila;
    int columna;
    int valor;
    NodoOrtogonal derecha;
    NodoOrtogonal abajo;

    public NodoOrtogonal(int fila, int columna, int valor) {
        this.fila = fila;
        this.columna = columna;
        this.valor = valor;
        this.derecha = null;
        this.abajo = null;
    }
}
