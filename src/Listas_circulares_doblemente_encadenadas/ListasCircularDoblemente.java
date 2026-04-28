package Listas_circulares_doblemente_encadenadas;

public class ListasCircularDoblemente {

    Nodo cabeza;

    /*Insertar en lista circular doble*/
    public void insertar(int dato) {

                            // 10
        Nodo nuevo = new Nodo(dato);


        if (cabeza == null) {
            //[this | 10 | this]
            cabeza = nuevo;
            cabeza.anterior = nuevo;
            cabeza.siguiente = nuevo;
            //[10 | 10 | 10]

        } else {

            Nodo ultimo = cabeza.anterior;

            ultimo.siguiente = nuevo;
            nuevo.anterior = ultimo;

            nuevo.siguiente = cabeza;
            cabeza.anterior = nuevo;

        }

    }

    /*Recorrer lista circular*/
    public void recorrer() {

        if (cabeza == null) {
            System.out.println("La lista está vacía");
            return;
        }

        Nodo actual = cabeza;

        do {
            System.out.print(actual.dato + " -> ");
            actual = actual.siguiente;
        } while (actual != cabeza);

        System.out.println("(vuelve a cabeza)");
    }

    /*Complejidad*/
    public void imprimirLista() {

        if (cabeza == null) {
            System.out.println("La lista está vacía");
            return;
        }

        Nodo actual = cabeza;

        do {
            System.out.println(actual.dato);
            actual = actual.siguiente;
        } while (actual != cabeza);
    }

    /*algoritmo O(n²)*/
    public void analisis(){

        int n =100;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.println(i+j);
            }
        }

        /*Analizar algoritmo logarítmico O(log n)*/
        int i = 1;

        while(i < n){
            i = i * 2;
        }

        /*Analizar algoritmo n log n O(n log n)*/
        for(int k =0;k<n;k++){

            int j = 1;

            while(j<n){
                j=j*2;
            }

        }

    }
}
