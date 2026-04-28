package FIFO.Ejercicio_1_cola_con_prioridad_simulada;

class ColaPrioridad {
    private ColaSimple alta;
    private ColaSimple media;
    private ColaSimple baja;

    public ColaPrioridad() {
        alta = new ColaSimple();
        media = new ColaSimple();
        baja = new ColaSimple();
    }

    public void encolar(String nombre, int prioridad) {
        if (prioridad == 1) {
            alta.encolar(nombre);
        } else if (prioridad == 2) {
            media.encolar(nombre);
        } else if (prioridad == 3) {
            baja.encolar(nombre);
        } else {
            System.out.println("Prioridad inválida");
        }
    }

    public String desencolar() {
        if (!alta.estaVacia()) {
            return alta.desencolar();
        } else if (!media.estaVacia()) {
            return media.desencolar();
        } else if (!baja.estaVacia()) {
            return baja.desencolar();
        } else {
            return "No hay elementos en la cola";
        }
    }

    public void mostrar() {
        System.out.print("Prioridad alta: ");
        alta.mostrar();

        System.out.print("Prioridad media: ");
        media.mostrar();

        System.out.print("Prioridad baja: ");
        baja.mostrar();
    }
}
