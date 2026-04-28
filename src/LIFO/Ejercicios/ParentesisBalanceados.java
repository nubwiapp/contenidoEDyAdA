package LIFO.Ejercicios;

import java.util.Stack;
/*
* Ejercicio 3: Validar paréntesis balanceados
* Un clásico de entrevistas técnicas. Verifica si una expresión tiene los paréntesis correctamente balanceados.
* */
public class ParentesisBalanceados {
    public static boolean estaBalanceado(String expresion) {
        Stack<Character> pila = new Stack<>();

        for (char c : expresion.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                pila.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (pila.isEmpty()) return false;

                char tope = pila.pop();
                if (!coinciden(tope, c)) return false;
            }
        }

        return pila.isEmpty();
    }

    private static boolean coinciden(char apertura, char cierre) {
        return (apertura == '(' && cierre == ')') ||
                (apertura == '[' && cierre == ']') ||
                (apertura == '{' && cierre == '}');
    }

    public static void main(String[] args) {
        System.out.println(estaBalanceado("(a+b)"));        // true
        System.out.println(estaBalanceado("{[a+b]*(c-d)}")); // true
        System.out.println(estaBalanceado("(a+b]"));        // false
        System.out.println(estaBalanceado("((a+b)"));       // false
    }
}
