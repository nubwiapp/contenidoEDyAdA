package LIFO.Ejercicios;

import java.util.Stack;

public class EjercicioBasico1 {
    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<>();

        // Apilar (push)
        pila.push(10);
        pila.push(20);
        pila.push(30);
        pila.push(40);

        System.out.println("Pila actual: " + pila);
        System.out.println("Tope (peek): " + pila.peek());
        System.out.println("Tamaño: " + pila.size());

        // Desapilar (pop) - sale el último que entró
        System.out.println("\nSacando elementos uno a uno:");
        while (!pila.isEmpty()) {
            System.out.println("Saqué: " + pila.pop());
        }

        System.out.println("¿Vacía? " + pila.isEmpty());
    }
}
