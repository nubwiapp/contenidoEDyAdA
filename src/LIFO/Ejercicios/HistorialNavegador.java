package LIFO.Ejercicios;

import java.util.Stack;


/*
Ejercicio de Aplicación 1: Historial de navegación (estilo navegador web)
Cuando navegas en un browser y presionas "atrás", regresas a la última página visitada. Eso es LIFO puro.
* */

public class HistorialNavegador {
    private Stack<String> historial = new Stack<>();
    private String paginaActual = "inicio.html";

    public void visitar(String pagina) {
        historial.push(paginaActual);
        paginaActual = pagina;
        System.out.println("Visitando: " + pagina);
    }

    public void atras() {
        if (historial.isEmpty()) {
            System.out.println("No hay páginas anteriores.");
            return;
        }
        paginaActual = historial.pop();
        System.out.println("Regresando a: " + paginaActual);
    }

    public void mostrarActual() {
        System.out.println("Página actual: " + paginaActual);
    }

    public static void main(String[] args) {
        HistorialNavegador navegador = new HistorialNavegador();

        navegador.visitar("google.com");
        navegador.visitar("youtube.com");
        navegador.visitar("github.com");
        navegador.mostrarActual();        // github.com

        navegador.atras();                 // regresa a youtube.com
        navegador.atras();                 // regresa a google.com
        navegador.mostrarActual();        // google.com
    }
}
