package Matriz_ortogonal;

public class MatrizOrtogonal {
    private NodoOrtogonal[] filas;
    private NodoOrtogonal[] columnas;
    private int numFilas;
    private int numColumnas;

    public MatrizOrtogonal(int numFilas, int numColumnas) {
        this.numFilas = numFilas;
        this.numColumnas = numColumnas;

        filas = new NodoOrtogonal[numFilas];
        columnas = new NodoOrtogonal[numColumnas];
    }

    public void insertar(int fila, int columna, int valor) {
        if (fila < 0 || fila >= numFilas || columna < 0 || columna >= numColumnas) {
            System.out.println("Posición fuera de rango.");
            return;
        }

        if (valor == 0) {
            System.out.println("No se insertan ceros en una matriz dispersa.");
            return;
        }

        NodoOrtogonal nuevo = new NodoOrtogonal(fila, columna, valor);

        insertarEnFila(nuevo);
        insertarEnColumna(nuevo);
    }

    //caso 3
    //nuevo → [1 | 1 | 5 | null | null]
    //insertar (1,1,5) en filas
    //caso 2 *****************************************
    //insertar (2,1,8) en filas
    //nuevo → [2 | 1 | 8 | null | null]
    //caso 1 *****************************************
    //insertar (0,2,1) en filas
    //nuevo → [0 | 2 | 1 | null | null]
    private void insertarEnFila(NodoOrtogonal nuevo) {
        int fila = nuevo.fila;
        //caso 3
        //fila = 1
        //caso 2
        //fila = 2
        //caso 1
        //fila = 0


      //caso 3
      //if (filas[1] == null || 1 < filas[1].columna)
      //Como filas[1] está vacía, entra.
      //caso 2
      //if (filas[2] == null || 1 < filas[2].columna)
      //Como filas[2] == null, es verdadero.
      //caso 1
      //if (filas[0] == null || 2 < filas[0].columna)
      //Como filas[0] todavía es null, la condición da verdadero.
        if (filas[fila] == null || nuevo.columna < filas[fila].columna) {
            //caso 3
            //nuevo.derecha = filas[1];  -> [1 | 1 | 5 | null | null]
            //caso 2
            //nuevo.derecha = filas[2];  -> [2 | 1 | 8 | null | null]
            //caso 1 *************************************
            //nuevo.derecha = filas[0]; -> [0 | 2 | 1 | null | null]
             nuevo.derecha = filas[fila];
            //filas[1] = nuevo;
            //caso 2
            //filas[2] = nuevo;
            //caso 1
            //filas[0] = nuevo
            filas[fila] = nuevo;
            //filas[0] → [0 | 2 | 1 | null | null]
            //filas[1] → [1 | 1 | 5 | null | null]
            //filas[2] → [2 | 1 | 8 | null | null]
            //filas[3] → null
            return;
        }

        NodoOrtogonal actual = filas[fila];
        while (actual.derecha != null && actual.derecha.columna < nuevo.columna) {
            actual = actual.derecha;
        }

        // Si ya existe un nodo en esa posición, se actualiza el valor
        if (actual.derecha != null &&
                actual.derecha.columna == nuevo.columna) {
            actual.derecha.valor = nuevo.valor;
            return;
        }

        nuevo.derecha = actual.derecha;
        actual.derecha = nuevo;
    }

    //3 - insertar (1,1,5) : nuevo → [1 | 1 | 5 | null | null] : Ya existe en columnas[1]:
    //2 - insertar (2,1,8) : nuevo → [2 | 1 | 8 | null | null]
    //1 - insertar (0,2,1) : nuevo → [0 | 2 | 1 | null | null]
    private void insertarEnColumna(NodoOrtogonal nuevo) {
        //3 - columna = 1
        //2 - columna = 1
        //1 - columna = 2
        int columna = nuevo.columna;

        //3 - if (columnas[1] == null || 1 < 2) da verdadero
        //2 - if (columnas[1] == null || 2 < columnas[1].fila)  : Como columnas[1] == null, entra
        //1 - if (columnas[2] == null || 0 < columnas[2].fila)
        if (columnas[columna] == null || nuevo.fila < columnas[columna].fila) {
            nuevo.abajo = columnas[columna];
            //nuevo → [1 | 1 | 5 | null | • ]
           //                             |
           //                             v
           //                        [2 | 1 | 8 | null | null]
            columnas[columna] = nuevo;
            //Como columnas[1] == null queda: columnas[1] -> [2 | 1 | 8 | null | null]
            //Como columnas[2] = null, queda: columnas[2] -> [0 | 2 | 1 | null | null]

           // columnas[0] → null
           // columnas[1] → [1 | 1 | 5 | null | • ]
           //                                   |
           //                                   v
           //                              [2 | 1 | 8 | null | null]

           // columnas[2] → [0 | 2 | 1 | null | null]
           // columnas[3] → null
            return;
        }

        NodoOrtogonal actual = columnas[columna];
        while (actual.abajo != null && actual.abajo.fila < nuevo.fila) {
            actual = actual.abajo;
        }

        // Si ya existe un nodo en esa posición, no duplicar
        if (actual.abajo != null &&
                actual.abajo.fila == nuevo.fila) {
            actual.abajo.valor = nuevo.valor;
            return;
        }

        nuevo.abajo = actual.abajo;
        actual.abajo = nuevo;
    }

    public void mostrarPorFilas() {
        System.out.println("Recorrido por filas:");
        for (int i = 0; i < numFilas; i++) {
            System.out.print("Fila " + i + ": ");
            NodoOrtogonal actual = filas[i];
            while (actual != null) {
                System.out.print("(" + actual.fila + "," + actual.columna + "," + actual.valor + ") ");
                actual = actual.derecha;
            }
            System.out.println();
        }
    }

    public void mostrarPorColumnas() {
        System.out.println("Recorrido por columnas:");
        for (int j = 0; j < numColumnas; j++) {
            System.out.print("Columna " + j + ": ");
            NodoOrtogonal actual = columnas[j];
            while (actual != null) {
                System.out.print("(" + actual.fila + "," + actual.columna + "," + actual.valor + ") ");
                actual = actual.abajo;
            }
            System.out.println();
        }
    }

    public void mostrarMatrizCompleta() {
        System.out.println("Matriz completa:");
        for (int i = 0; i < numFilas; i++) {
            NodoOrtogonal actual = filas[i];
            for (int j = 0; j < numColumnas; j++) {
                if (actual != null && actual.columna == j) {
                    System.out.print(actual.valor + "\t");
                    actual = actual.derecha;
                } else {
                    System.out.print("0\t");
                }
            }
            System.out.println();
        }
    }

    public int buscar(int fila, int columna) {
        if (fila < 0 || fila >= numFilas || columna < 0 || columna >= numColumnas) {
            return 0;
        }

        NodoOrtogonal actual = filas[fila];
        while (actual != null) {
            if (actual.columna == columna) {
                return actual.valor;
            }
            actual = actual.derecha;
        }
        return 0;
    }
}
