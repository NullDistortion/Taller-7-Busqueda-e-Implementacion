package edu.u2.sorting.searching;

public class Paso5 {

    public static int binarySearch(int[] a, int key) {
        if (a == null) return -1;

        int low = 0;
        int high = a.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (a[mid] == key) return mid;
            if (a[mid] < key) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    public static int binarySearchFirst(int[] a, int key) {
        if (a == null) return -1;

        int low = 0;
        int high = a.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (a[mid] == key) {
                result = mid;
                high = mid - 1;
            } else if (a[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }
}
