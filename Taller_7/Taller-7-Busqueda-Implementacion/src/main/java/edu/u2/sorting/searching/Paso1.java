package edu.u2.sorting.searching;

import edu.u2.sorting.node.Node;

public class Paso1 {

    public static int indexOfFirst(int[] a, int key) {
        if (a == null) return -1;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) return i;
        }
        return -1;
    }

    public static int indexOfFirst(Node head, int key) {
        int index = 0;
        Node current = head;

        while (current != null) {
            if (current.data == key) return index;
            current = current.next;
            index++;
        }
        return -1; // no encontrado
    }

}
