package Listas_conceptos;

public class MainListaCircular {

    public static void main(String[] args) {

            Listas_conceptos.ListaCircular lista = new Listas_conceptos.ListaCircular();

            lista.insertar(10);
            lista.insertar(20);
            lista.insertar(30);
            lista.insertar(40);

            System.out.println("Lista circular:");
            lista.recorrer();

            System.out.println("Buscar 20: " + lista.buscar(20));

            System.out.println("Cantidad de nodos: " + lista.contar());

            System.out.println("Eliminar 20");
            lista.eliminar(20);

            lista.recorrer();

        }

}
