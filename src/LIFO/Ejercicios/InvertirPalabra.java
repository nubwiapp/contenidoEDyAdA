package LIFO.Ejercicios;

import java.util.Stack;
/*
Ejercicio 2: Invertir una palabra usando una pila
Este es el ejemplo clásico para "ver" el comportamiento LIFO.
* */
public class InvertirPalabra {
    public static String invertir(String palabra) {
        Stack<Character> pila = new Stack<>();

        // Apilamos cada caracter
        for (char letra : palabra.toCharArray()) {
            pila.push(letra);
        }

        // Desapilamos: salen en orden inverso
        StringBuilder resultado = new StringBuilder();
        while (!pila.isEmpty()) {
            resultado.append(pila.pop());
        }

        return resultado.toString();
    }

    public static void main(String[] args) {
        System.out.println(invertir("HOLA"));      // ALOH
        System.out.println(invertir("CARLOS"));    // SOLRAC
        System.out.println(invertir("LIFO"));      // OFIL
    }
}
