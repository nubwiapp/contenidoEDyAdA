package FIFO;

import java.util.LinkedList;
import java.util.Queue;

public class ColaLinkedList {
    public static void main(String[] args) {

        Queue<String> cola = new LinkedList<>();

        // enqueue - Insertar al final
        cola.add("A");
        cola.add("B");
        cola.add("C");

        System.out.println("Cola: " + cola);

        // peek - Ver el primero
        System.out.println("Primero: " + cola.peek());

        // dequeue - Eliminar del inicio
        System.out.println("Atendido: " + cola.poll());

        System.out.println("Cola después: " + cola);
    }
}
