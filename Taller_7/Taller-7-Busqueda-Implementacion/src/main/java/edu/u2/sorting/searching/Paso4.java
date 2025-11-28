package edu.u2.sorting.searching;

public class Paso4 {

    public static int searchCentinel(int[] a, int key) {
        if (a == null || a.length == 0) return -1;

        int n = a.length;
        int last = a[n - 1];

        if (last == key) return n - 1;

        a[n - 1] = key; // centinela
        int i = 0;

        while (a[i] != key) {
            i++;
        }

        a[n - 1] = last;

        if (i < n - 1) return i;
        return -1;
    }
}
