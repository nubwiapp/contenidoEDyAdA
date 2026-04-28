package Listas_conceptos;

public class ListaSimple {

    Nodo cabeza;

    public ListaSimple() {

        cabeza = null;
    }


    /*INSERTAR AL INICIO*/
    public void insertarInicio(int dato) {

        /*Insertar al inicio es O(1).*/
        Nodo nuevo = new Nodo(dato);
        nuevo.siguiente = cabeza;
        cabeza = nuevo;

    }

    /*INSERTAR AL FINAL*/
    public void insertarFinal(int dato) {

        Nodo nuevo = new Nodo(dato);

        if (cabeza == null) {
            cabeza = nuevo;
        } else {

            Nodo actual = cabeza;

             while (actual.siguiente != null) {
                actual = actual.siguiente;
            }

            actual.siguiente = nuevo;
        }

    }


    /*RECORRER LA LISTA*/

    public void recorrer() {

        Nodo actual = cabeza;

        while (actual != null) {

            System.out.print(actual.dato + " -> ");

            actual = actual.siguiente;

        }

        System.out.println("null");

    }

    /*BUSCAR EN LA LISTA*/
    public boolean buscar(int valor) {

        Nodo actual = cabeza;

        while (actual != null) {

            if (actual.dato == valor) {
                return true;
            }

            actual = actual.siguiente;
        }

        return false;
    }

    /*ELIMINAR DE LA LISTA*/
    public void eliminar(int valor) {

        Nodo actual = cabeza;
        Nodo anterior = null;

        while (actual != null) {

            if (actual.dato == valor) {

                if (anterior == null) {
                    cabeza = actual.siguiente;
                } else {
                    anterior.siguiente = actual.siguiente;
                }

                return;
            }

            anterior = actual;
            actual = actual.siguiente;
        }

    }
}
