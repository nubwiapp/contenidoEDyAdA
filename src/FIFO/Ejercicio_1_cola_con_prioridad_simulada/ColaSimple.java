package FIFO.Ejercicio_1_cola_con_prioridad_simulada;

class ColaSimple {
    private Nodo frente;
    private Nodo fin;

    public ColaSimple() {
        frente = null;
        fin = null;
    }

    public void encolar(String nombre) {
        Nodo nuevo = new Nodo(nombre);

        if (fin == null) {
            frente = nuevo;
            fin = nuevo;
        } else {
            fin.siguiente = nuevo;
            fin = nuevo;
        }
    }

    public String desencolar() {
        if (frente == null) {
            return null;
        }

        String nombre = frente.nombre;
        frente = frente.siguiente;

        if (frente == null) {
            fin = null;
        }

        return nombre;
    }

    public boolean estaVacia() {
        return frente == null;
    }

    public void mostrar() {
        Nodo actual = frente;

        while (actual != null) {
            System.out.print(actual.nombre + " -> ");
            actual = actual.siguiente;
        }

        System.out.println("null");
    }
}
