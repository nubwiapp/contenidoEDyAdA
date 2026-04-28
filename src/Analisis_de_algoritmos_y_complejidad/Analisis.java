package Analisis_de_algoritmos_y_complejidad;

public class Analisis {

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
