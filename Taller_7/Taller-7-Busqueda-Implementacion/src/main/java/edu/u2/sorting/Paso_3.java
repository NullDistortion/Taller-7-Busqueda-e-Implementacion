package edu.u2.sorting;

import edu.u2.sorting.node.Node;

import java.util.ArrayList;

public class Paso_3 { //
    //Con Array
    public static void findAllByKey(int[] vector, int predicate) { //==key
        ArrayList<Integer> coincidendes = new ArrayList<>();
        int cases = 0;

        for (int j : vector) {
            if (j == predicate) {
                coincidendes.add(j);
                cases++;
            }
        }
        System.out.println(coincidendes);
        System.out.println("cases: " + cases);
    }

    public static void findAllByUmbralMinor(int[] vector, int predicate) { //umbral menor
        ArrayList<Integer> coincidendes = new ArrayList<>();
        int cases = 0;

        for (int j : vector) {
            if (j < predicate) {
                coincidendes.add(j);
                cases++;
            }
        }
        System.out.println(coincidendes);
        System.out.println("cases: " + cases);
    }

    public static void findAllByUmbralMayor(int[] vector, int predicate) { //umbral mayor
        ArrayList<Integer> coincidendes = new ArrayList<>();
        int cases = 0;

        for (int j : vector) {
            if (j > predicate) {
                coincidendes.add(j);
                cases++;
            }
        }
        System.out.println(coincidendes);
        System.out.println("cases: " + cases);
    }

    public static void findAllByPair(int[] vector) {
        ArrayList<Integer> coincidendes = new ArrayList<>();
        int cases = 0;

        for (int j : vector) {
            if (isPair(j)) {
                coincidendes.add(j);
                cases++;
            }
        }
        System.out.println(coincidendes);
        System.out.println("cases: " + cases);
    }

    public static boolean isPair(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        int[] vector = {1, 5, 3, 4, 9, 7, 9, 9, 9, 6, 2};
        findAllByKey(vector, 9);
        findAllByUmbralMinor(vector, 7);
        findAllByUmbralMayor(vector, 5);
        findAllByPair(vector);
    }

    //con SLL
    public static void findAll(Node head, int predicate) {
        
    }

}