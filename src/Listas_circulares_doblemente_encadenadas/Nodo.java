package Listas_circulares_doblemente_encadenadas;

public class Nodo {

    int dato;
    Nodo siguiente;
    Nodo anterior;

    public Nodo(int dato) {

        this.dato = dato;
        this.siguiente = this;
        this.anterior = this;

    }


}
