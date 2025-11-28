package edu.u2.sorting.main;

import edu.u2.sorting.node.Node;
import edu.u2.sorting.info.Datasets;
import edu.u2.sorting.searching.*;

import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class Main {

    private static final int[] A = Datasets.getArrayA(); // [8, 3, 6, 3, 9, 7, 2, 3] [cite: 2]
    private static final int[] B = Datasets.getArrayB(); // [1, 2, 3, 5, 7, 9, 11, 15] (Ordenado) [cite: 4]
    private static final int[] C = Datasets.getArrayC(); // [2, 2, 2, 2, 2] [cite: 5]
    private static final int[] D = Datasets.getArrayD(); // [] (Vacío) [cite: 6]
    private static final Node SLL = Datasets.getListaEjemplo(); // 3 -> 1 -> 3 -> 2 [cite: 8, 9]

    public static void main(String[] args) {

        paso1_primeraOcurrencia();
        separador();
        paso2_ultimaOcurrencia();
        separador();
        paso3_findAll();
        separador();
        paso4_centinela();
        separador();
        paso5_busquedaBinaria();

    }

    private static void separador() {
        System.out.println("\n-------------------------------------------------\n");
    }

    // --- Paso 1: Primera Ocurrencia
    private static void paso1_primeraOcurrencia() {
        System.out.println("1. Primera Ocurrencia (indexOfFirst)");

        // Array - Clave presente (7)
        int key1_arr = 7;
        int result1_arr = Paso1.indexOfFirst(A, key1_arr);
        System.out.printf("paso 1: indexOfFirst (Array, int)\ndataset usado: A %s, key=%d\nresultado: Índice: %d\n", arrayToString(A), key1_arr, result1_arr);

        // Array - Clave duplicada (3)
        int key2_arr = 3;
        int result2_arr = Paso1.indexOfFirst(A, key2_arr);
        System.out.printf("paso 1: indexOfFirst (Array, int)\ndataset usado: A %s, key=%d\nresultado: Índice: %d\n", arrayToString(A), key2_arr, result2_arr);

        // Array - Vacío (Caso Borde)
        int key3_arr = 5;
        int result3_arr = Paso1.indexOfFirst(D, key3_arr);
        System.out.printf("paso 1: indexOfFirst (Array, int)\ndataset usado: D %s (Vacío), key=%d\nresultado: Índice: %d\n", arrayToString(D), key3_arr, result3_arr);

        // SLL - Clave presente (3)
        int key1_sll = 3;
        int result1_sll = Paso1.indexOfFirst(SLL, key1_sll);
        System.out.printf("paso 1: indexOfFirst (SLL, int)\ndataset usado: SLL 3->1->3->2, key=%d\nresultado: Índice: %d\n", key1_sll, result1_sll);
    }

    // --- Paso 2: Última Ocurrencia
    private static void paso2_ultimaOcurrencia() {
        System.out.println("2. Última Ocurrencia");

        // Array - De atrás hacia adelante (3)
        int key1_arr = 3;
        int result1_arr = Paso2.lastOccurrenceArray(A, key1_arr);
        System.out.printf("paso 2: lastOccurrenceArray (Array)\ndataset usado: A %s, key=%d\nresultado: Índice: %d\n", arrayToString(A), key1_arr, result1_arr);

        // Array - Todas coinciden (2)
        int key2_arr = 2;
        int result2_arr = Paso2.lastOccurrenceArray(C, key2_arr);
        System.out.printf("paso 2: lastOccurrenceArray (Array)\ndataset usado: C %s (Duplicados), key=%d\nresultado: Índice: %d\n", arrayToString(C), key2_arr, result2_arr);

        // SLL - Una pasada guardando last (3)
        int key1_sll = 3;
        int result1_sll = Paso2.indexOfLast(SLL, key1_sll);
        System.out.printf("paso 2: indexOfLast (SLL)\ndataset usado: SLL 3->1->3->2, key=%d\nresultado: Índice: %d\n", key1_sll, result1_sll);
    }

    // --- Paso 3: findAll por predicado
    private static void paso3_findAll() {
        System.out.println("3. findAll por Predicado");

        // Array - Predicado "Par"
        IntPredicate p1_arr = Paso3.isPair();
        List<Integer> result1_arr = Paso3.findAll(A, p1_arr);
        System.out.printf("paso 3: findAll (Array)\ndataset usado: A %s, Predicado: 'isPair()'\nresultado: Índices: %s\n", arrayToString(A), result1_arr);

        // Array - Predicado "Igual a key"
        int key_eq = 3;
        IntPredicate p2_arr = Paso3.equals(key_eq);
        List<Integer> result2_arr = Paso3.findAll(A, p2_arr);
        System.out.printf("paso 3: findAll (Array)\ndataset usado: A %s, Predicado: 'equals(%d)'\nresultado: Índices: %s\n", arrayToString(A), key_eq, result2_arr);

        // SLL - Predicado "Valor < 3"
        int value_lt = 3;
        Predicate<Node> p1_sll = n -> n.data < value_lt;
        List<Integer> result1_sll = Paso3.findAllIndexes(SLL, p1_sll);
        System.out.printf("paso 3: findAllIndexes (SLL)\ndataset usado: SLL 3->1->3->2, Predicado: 'val < %d'\nresultado: Índices: %s\n", value_lt, result1_sll);
    }

    // --- Paso 4: Secuencial con Centinela
    private static void paso4_centinela() {
        System.out.println("4. Secuencial con Centinela");

        // Array - Clave presente (9)
        int key1 = 9;
        int result1 = Paso4.searchCentinel(A, key1);
        System.out.printf("paso 4: searchCentinel\ndataset usado: A %s, key=%d\nresultado: Índice: %d\n", arrayToString(A), key1, result1);

        // Array - Clave no presente (42)
        int key2 = 42;
        int result2 = Paso4.searchCentinel(A, key2);
        System.out.printf("paso 4: searchCentinel\ndataset usado: A %s, key=%d\nresultado: Índice: %d\n", arrayToString(A), key2, result2);

        // Array - Caso borde vacío (D)
        int key3 = 5;
        int result3 = Paso4.searchCentinel(D, key3);
        System.out.printf("paso 4: searchCentinel\ndataset usado: D %s (Vacío), key=%d\nresultado: Índice: %d\n", arrayToString(D), key3, result3);
    }

    // --- Paso 5: Búsqueda Binaria
    private static void paso5_busquedaBinaria() {
        System.out.println("5. Búsqueda Binaria");

        // Array - Iterativa (Búsqueda estándar) (7)
        int key1 = 7;
        int result1 = Paso5.binarySearch(B, key1);
        System.out.printf("paso 5: binarySearch (Estándar)\ndataset usado: B %s (Ordenado), key=%d\nresultado: Índice: %d\n", arrayToString(B), key1, result1);

        // Array - Clave no presente (42)
        int key2 = 42;
        int result2 = Paso5.binarySearch(B, key2);
        System.out.printf("paso 5: binarySearch (Estándar)\ndataset usado: B %s (Ordenado), key=%d\nresultado: Índice: %d\n", arrayToString(B), key2, result2);

        // Array - Opcional (binarySearchFirst)
        int key3 = 2;
        int result3 = Paso5.binarySearchFirst(C, key3);
        System.out.printf("paso 5: binarySearchFirst (Lower Bound)\ndataset usado: C %s (Duplicados), key=%d\nresultado: Primer Índice (Lower Bound): %d\n", arrayToString(C), key3, result3);
    }

    private static String arrayToString(int[] a) {
        if (a == null) return "null";
        if (a.length == 0) return "[]";
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < a.length; i++) {
            sb.append(a[i]);
            if (i < a.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}