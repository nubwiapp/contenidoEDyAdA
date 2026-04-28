package Listas_conceptos;

public class ListaCircular {

    Nodo cabeza;

    public ListaCircular() {

        cabeza = null;
    }




    /*INSERTAR EN UNA LISTA CIRCULAR*/

    public void insertar(int dato) {

        Nodo nuevo = new Nodo(dato);

        if (cabeza == null) {
            cabeza = nuevo;
            nuevo.siguiente = cabeza;

        } else {

            Nodo actual = cabeza;

            while (actual.siguiente != cabeza) {
                actual = actual.siguiente;
            }

            actual.siguiente = nuevo;
            nuevo.siguiente = cabeza;

        }
    }






    /*RECORRER LA LISTA CIRCULAR*/

    public void recorrer() {

        if (cabeza == null) {
            return;
        }

        Nodo actual = cabeza;

        //Usamos do-while porque la lista circular no tiene null.

        do {

            System.out.print(actual.dato + " → ");
            actual = actual.siguiente;

        } while (actual != cabeza);

        System.out.println("(vuelve a cabeza)");

    }


    /*BUSCAR EN LA LISTA CIRCULAR*/

    public boolean buscar(int valor) {

        if (cabeza == null) {
            return false;
        }

        Nodo actual = cabeza;

        do {

            if (actual.dato == valor) {
                return true;
            }

            actual = actual.siguiente;

        } while (actual != cabeza);

        return false;
    }


    public void eliminar(int valor) {

        if (cabeza == null) {
            return;
        }

        Nodo actual = cabeza;
        Nodo anterior = null;

        do {

            if (actual.dato == valor) {

                // caso: un solo nodo
                if (actual == cabeza && actual.siguiente == cabeza) {
                    cabeza = null;
                    return;
                }

                // eliminar cabeza
                if (actual == cabeza) {

                    Nodo ultimo = cabeza;

                    while (ultimo.siguiente != cabeza) {
                        ultimo = ultimo.siguiente;
                    }

                    cabeza = cabeza.siguiente;
                    ultimo.siguiente = cabeza;

                    return;
                }

                // eliminar nodo intermedio
                anterior.siguiente = actual.siguiente;
                return;
            }

            anterior = actual;
            actual = actual.siguiente;

        } while (actual != cabeza);
    }


    /*CONTAR NODOS*/

    public int contar() {

        if (cabeza == null) {
            return 0;
        }

        int contador = 0;
        Listas_conceptos.Nodo actual = cabeza;

        do {

            contador++;
            actual = actual.siguiente;

        } while (actual != cabeza);

        return contador;
    }
}

//¿Por qué en una lista circular no podemos usar while(actual != null)?