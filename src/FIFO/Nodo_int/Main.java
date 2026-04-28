package FIFO.Nodo_int;

import FIFO.Nodo_string.ColaString;

public class Main {
    public static void main(String[] args) {

        ColaString cola = new ColaString();

        cola.encolar("Juan");
        cola.encolar("Maria");
        cola.encolar("Pedro");

        cola.mostrar();

        System.out.println("Frente: " + cola.verFrente());

        System.out.println("Atendido: " + cola.desencolar());

        cola.mostrar();
    }
}
