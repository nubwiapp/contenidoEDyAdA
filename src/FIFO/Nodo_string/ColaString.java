package FIFO.Nodo_string;

public class ColaString {

    private NodoString frente;
    private NodoString fin;

    public ColaString() {
        frente = null;
        fin = null;
    }

    // enqueue Inserta al final - O(1)
    public void encolar(String dato) {
        NodoString nuevo = new NodoString(dato);

        if (fin == null) {
            frente = nuevo;
            fin = nuevo;
        } else {
            fin.siguiente = nuevo;
            fin = nuevo;
        }
    }

    // dequeue Elimina el primero - O(1)
    public String desencolar() {
        if (frente == null) {
            return "Cola vacía";
        }

        String dato = frente.dato;
        frente = frente.siguiente;

        if (frente == null) {
            fin = null;
        }

        return dato;
    }

    // peek Solo consulta el frente - O(1)
    public String verFrente() {
        if (frente == null) {
            return "Cola vacía";
        }
        return frente.dato;
    }

    // mostrar
    public void mostrar() {
        NodoString actual = frente;

        while (actual != null) {
            System.out.print(actual.dato + " -> ");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }
}
