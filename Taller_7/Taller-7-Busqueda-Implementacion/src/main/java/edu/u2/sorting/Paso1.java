package edu.u2.sorting;

public class Paso1 {
    //NODO (Para la Lista Enlazada)
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

        @Override
        public String toString() {
            return "Node{data=" + data + "}";
        }
    }

    //---> Busqueda en Arrays: Busca la primera ocurrencia de un valor en un arreglo
    /**
     * @param a   Arreglo de enteros
     * @param key Valor a buscar
     * @return El índice de la primera coincidencia, o -1 si no existe o el arreglo es nulo
     */
    public static int indexOfFirst(int[] a, int key) {
        // Caso Borde 1: Arreglo nulo
        if (a == null || a.length == 0) {
            return -1;
        }
        // Búsqueda Lineal
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                return i;
            }
        }
        return -1; //Si no se encontró
    }

    //---> Busqueda en Lista Enlazada: Busca la primera ocurrencia de un valor en una lista enlazada

    /**
     * * @param head Nodo cabeza de la lista
     * @param key Valor a buscar
     * @return El objeto Node de la primera coincidencia, o null si no existe
     */
    public static Node findFirst(Node head, int key) {
        // Caso Borde 1: Lista vacía
        if (head == null) {
            return null;
        }

        Node current = head;

        // Recorremos mientras existan nodos
        while (current != null) {
            if (current.data == key) {
                return current;
            }
            current = current.next; //Pasamos al siguiente
        }

        return null; // Llegamos al final y no se encontro
    }
}