package FIFO.Nodo_int;

public class Cola {

    private Nodo frente;
    private Nodo fin;

    public Cola() {
        frente = null;
        fin = null;
    }

    // enqueue Insertar al final
    public void encolar(int valor) {
        Nodo nuevo = new Nodo(valor);

        if (fin == null) {
            frente = nuevo;
            fin = nuevo;
        } else {
            fin.siguiente = nuevo;
            fin = nuevo;
        }
    }

    // dequeue Eliminar del inicio
    public int desencolar() {
        if (frente == null) {
            System.out.println("Cola vacía");
            return -1;
        }

        int valor = frente.valor;
        frente = frente.siguiente;

        if (frente == null) {
            fin = null;
        }

        return valor;
    }

    // peek Ver el primero
    public int verFrente() {
        if (frente == null) {
            return -1;
        }
        return frente.valor;
    }

    // imprimir
    public void mostrar() {
        Nodo actual = frente;

        while (actual != null) {
            System.out.print(actual.valor + " -> ");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }
}
