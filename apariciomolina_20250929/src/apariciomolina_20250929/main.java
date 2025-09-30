/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apariciomolina_20250929;

public class main {

    public static void main(String[] args) {
        //instanciamos la variable(referencia o puntero)
        BusquedaBinaria buscar = new BusquedaBinaria();
        //se etablece un arreglo unidimencional
        int[] arreglo = {17,19,21,23,25,27,29,31};
        //se establece una matriz
        int[][] matriz = {
            {1,3,5},
            {7,9,11},
            {13,15,17}
        };
        //se establece un valor a buscar
        int a_buscar = 17;
        //se implementa el metodo correspondiente a la busqueda de valores en
        //arreglos unidimencionales y mediante la herencia se realiza la ejecucion
        //del metodo buscarEnteroArray(), enviando los parametros necesarios
        int posicion = buscar.buscarEnteroArray(arreglo, a_buscar);
        //se evalua el resultado devuelto por el metodo
        if(posicion != -1){
            //se encontro el valor
            System.out.println("El valor: "+a_buscar+" esta en la posicion: "+posicion);
         
        }else{   
            //no se encontro el valor
            System.out.println("No se encontro el valor de "+a_buscar);
            
        }
        //implementacion del metodo de busqueda en una matriz
        buscar.buscarEnteroMatriz(matriz, a_buscar);
        
    }
    
}
