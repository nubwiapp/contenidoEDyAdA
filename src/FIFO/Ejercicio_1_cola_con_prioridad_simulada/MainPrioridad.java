package FIFO.Ejercicio_1_cola_con_prioridad_simulada;

public class MainPrioridad {
    public static void main(String[] args) {
        ColaPrioridad cola = new ColaPrioridad();

        cola.encolar("Ana", 2);
        cola.encolar("Luis", 1);
        cola.encolar("Marta", 2);
        cola.encolar("Pedro", 1);
        cola.encolar("Sofia", 3);

        System.out.println("Estado inicial de la cola:");
        cola.mostrar();

        System.out.println("\nAtendiendo: " + cola.desencolar());
        System.out.println("Atendiendo: " + cola.desencolar());

        System.out.println("\nEstado después de atender 2 elementos:");
        cola.mostrar();
    }
}
