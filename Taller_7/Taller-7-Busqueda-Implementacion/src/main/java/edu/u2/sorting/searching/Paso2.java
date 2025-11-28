package edu.u2.sorting.searching;

import edu.u2.sorting.node.Node;

public class Paso2 {

    public static int lastOccurrenceArray(int[] arr, int key) {
        if (arr == null) return -1;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == key) return i;
        }
        return -1;
    }

    public static int indexOfLast(Node head, int key) {
        int index = 0;
        int last = -1;

        Node current = head;
        while (current != null) {
            if (current.data == key) last = index;
            current = current.next;
            index++;
        }
        return last;
    }

}
