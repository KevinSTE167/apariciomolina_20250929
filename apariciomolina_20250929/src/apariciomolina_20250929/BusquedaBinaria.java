/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apariciomolina_20250929;

public class BusquedaBinaria {
    //metodo para realizar una busqueda binaria de un arreglo unidimencional
    public int buscarEnteroArray(int[] arreglo, int valorBuscado){
       //se declaran las variables de inicio y fin
        int inicio = 0;
        int fin = arreglo.length;
        //se realiza la ejecucion de busqueda mientras el arreglo tenga al menos un elemento
        while(inicio <= fin){
            //se obtiene la posicion del centro del arreglo
            int medio = (inicio + fin)/2;
            //se evalua si el elemento en la posicion media es igual al valor buscado
            if(arreglo[medio] == valorBuscado){
            
                return medio;
            //se evalua si el elemento en la posicion media es menor al valor buscado    
            }else if (arreglo[medio] < valorBuscado){
            
                inicio = medio + 1;
            //se reduce el elemento es mayor, por lo tanto, el fin cambia
            }else{
            
                fin = medio - 1;
                
            }
            
        }
        //se devuelve -1 cuando no hay valores encontrados
        return -1; 
    }
    
    public void buscarEnteroMatriz(int[][] matriz, int objetivo){
        //se declara las filas y columnas para conocer la dimension de la matriz
        int filas = matriz.length;
        int columnas =  matriz[0].length;
        //se establece el inicio y fin de la matriz
        int inicio = 0;
        //cantidad total de elementos en la matriz
        int fin = (filas * columnas) - 1;
        //bandeja que infdica si el valor fue encontrado o no en la matriz
        boolean encontrado = false;
        //se realiza una repeticion mientra la matriz posea al menos un elemento
        while(inicio <= fin){
            //se reduce el el punto medio de la matriz
            int medio = (inicio + fin)/2;
            //se simula el arreglo bidimencional como un areeglo unidimencional
            //¿cual fila es? (cuantas filas completas existen antes del punto medio)
            int f = medio/columnas;
            //¿cual columna es? (posicion exacta de la columna)
            int c = medio%columnas;
            //se evalua si el valor buscado dse encuentra en la posicion unidimencional
            if(matriz[f][c] == objetivo){
                
                System.out.println("En la matriz, el elemento encontrado esta en la posicion ["+f+"]["+c+"]");
                //se establece la bandera como verdadera 
                encontrado = true;
                break;
            //se evalua si el elemento en la posicion media es menor al valor buscado    
            }else if (matriz[f][c] < objetivo){
                
                inicio = medio + 1;
            //se reduce el elemento es mayor, por lo tanto, el fin cambia
            }else{
            
                fin = medio - 1;
                
            }
        }//fin del while
        
        //se evalua la bandera por si a caso no se ha encontrado ningun valor
        if(encontrado == false){
            //se imprime la salida en la consola
            System.out.println("El elemento buscado no ha sido encontrado en la matriz");
            
        }
    }//fin del metodo buscarEnteroMatriz
    
}
