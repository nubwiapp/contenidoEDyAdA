package Eficiencia;
/*
* EJERCICIO 8. Comparación general de operaciones
* Este ejercicio es excelente para cerrar la clase.
*
* */
public class Ejercicio08_ComparacionBigO {

    public static void main(String[] args) {
        int[] valoresN = {10, 100, 1000};

        for (int n : valoresN) {
            System.out.println("====================================");
            System.out.println("Analizando con n = " + n);

            // O(1)
            int opConstante = 1;

            // O(n)
            int opLineal = 0;
            for (int i = 0; i < n; i++) {
                opLineal++;
            }

            // O(n^2)
            int opCuadratica = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    opCuadratica++;
                }
            }

            // O(log n)
            int opLogaritmica = 0;
            for (int i = n; i > 1; i = i / 2) {
                opLogaritmica++;
            }

            // O(n log n)
            int opNLogN = 0;
            for (int i = 0; i < n; i++) {
                for (int j = n; j > 1; j = j / 2) {
                    opNLogN++;
                }
            }

            System.out.println("O(1)      -> Operaciones: " + opConstante);
            System.out.println("O(n)      -> Operaciones: " + opLineal);
            System.out.println("O(n^2)    -> Operaciones: " + opCuadratica);
            System.out.println("O(log n)  -> Operaciones: " + opLogaritmica);
            System.out.println("O(n log n)-> Operaciones: " + opNLogN);
        }
    }
}
