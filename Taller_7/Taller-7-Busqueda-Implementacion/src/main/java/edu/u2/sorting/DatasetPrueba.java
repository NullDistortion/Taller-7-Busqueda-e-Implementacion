package edu.u2.sorting;

public class DatasetPrueba {
    /**
     * Dataset A: Desordenado con duplicados
     * Útil para: Búsqueda Secuencial, Centinela.
     */
    public static int[] getArrayA() {
        return new int[]{8, 3, 6, 3, 9, 7, 2, 3};
    }

    /**
     * Dataset B: ORDENADO
     * Útil para: Búsqueda Binaria y Secuencial.
     * Claves presentes: 2, 5, 7.
     */
    public static int[] getArrayB() {
        return new int[]{1, 2, 3, 5, 7, 9, 11, 15};
    }

    /**
     * Dataset C: Elementos duplicados masivos
     */
    public static int[] getArrayC() {
        return new int[]{2, 2, 2, 2, 2};
    }

    /**
     * Dataset D: Caso borde: Vacio
     */
    public static int[] getArrayD() {
        return new int[]{};
    }

    /**
     * Genera la Lista Enlazada (SLL) del ejemplo: 3 -> 1 -> 3 -> 2
     * Útil para pruebas de First, Last y All en Nodos.
     */
    public static Node getListaEjemplo() {
        Node head = new Node(3);
        head.next = new Node(1);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        return head;
    }
}
