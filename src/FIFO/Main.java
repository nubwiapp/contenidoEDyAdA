package FIFO;

import FIFO.Nodo_int.Cola;

public class Main {
    public static void main(String[] args) {

        Cola cola = new Cola();

        cola.encolar(10);
        cola.encolar(20);
        cola.encolar(30);

        cola.mostrar();

        System.out.println("Atendido: " + cola.desencolar());

        cola.mostrar();
    }
}
