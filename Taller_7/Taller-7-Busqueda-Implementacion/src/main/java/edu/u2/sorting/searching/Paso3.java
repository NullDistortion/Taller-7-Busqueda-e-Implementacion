package edu.u2.sorting.searching;

import edu.u2.sorting.node.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class Paso3 {

    public static List<Integer> findAll(int[] a, IntPredicate p) {
        List<Integer> result = new ArrayList<>();
        if (a == null) return result;

        for (int i = 0; i < a.length; i++) {
            if (p.test(a[i])) {
                result.add(i);
            }
        }
        return result;
    }

    public static List<Integer> findAllIndexes(Node head, Predicate<Node> p) {
        List<Integer> result = new ArrayList<>();
        int index = 0;
        Node current = head;

        while (current != null) {
            if (p.test(current)) result.add(index);
            current = current.next;
            index++;
        }
        return result;
    }



    public static IntPredicate isPair() {
        return x -> x % 2 == 0;
    }

    public static IntPredicate equals(int key) {
        return x -> x == key;
    }

    public static IntPredicate lessThan(int value) {
        return x -> x < value;
    }

    public static IntPredicate greaterThan(int value) {
        return x -> x > value;
    }
}
