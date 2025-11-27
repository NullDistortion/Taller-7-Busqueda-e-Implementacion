package edu.u2.sorting;
import edu.u2.sorting.node.Node;

public class Paso2 {
     /*
    busca la ultima ocurrencia en un arreglo
    metodo: recorrido inverso (de atras hacia adelante)
     */

    public static int lastOcurrenceArray(int[] arr, int key){

        //validacion para nulos o vacios
        if (arr == null || arr.length == 0){
            return -1;
        }

        //recorrido de atras hacia adelante
        for (int i = arr.length - 1; i >=0; i--){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }



    public class SLLSearch {
    /*
    ultima ocurrencia en la SLL
    metodo: recorrido completo actualizando la referencia last
     */

        public NodeLast findLast(NodeLast head, int key){
            NodeLast last = null;       //almacena la ultima coincidencia
            NodeLast current = head;    //puntero para recorrer la lista

            //ssi encontramos el valor, actualizamos last
            while (current != null){
                if (current.data == key){
                    last = current;
                }
                current = current.next;
            }
            return last; //devuelve el ultimo nodo encontrado o null si no se encontro
        }
    }

}
