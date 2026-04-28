package Listas_conceptos;

public class MainListaSimple {

        public static void main(String[] args) {

            ListaSimple lista = new ListaSimple();

            lista.insertarInicio(10);
            lista.insertarInicio(5);
            lista.insertarFinal(20);
            lista.insertarFinal(30);

            System.out.println("Lista:");
            lista.recorrer();

            System.out.println("Buscar 20:");
            System.out.println(lista.buscar(20));

            System.out.println("Eliminar 10");
            lista.eliminar(10);

            lista.recorrer();

        }
}


/*
* Actividad

Crear una lista que permita:
* 1 Insertar 5 números
* 2 Mostrar la lista
* 3️ Buscar un número
* 4️ Eliminar un número
*
* */