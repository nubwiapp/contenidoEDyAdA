package FIFO.Nodo_string;

public class MainColaString {
    static void main(String[] args) {

        ColaString colaString = new ColaString();

        colaString.encolar("Juan");
        colaString.encolar("Maria");
        colaString.encolar("Pedro");

        colaString.mostrar();

        System.out.println("Frente: " + colaString.verFrente());

        System.out.println("Atendido: " + colaString.desencolar());

        colaString.mostrar();
    }
}
