package edu.u2.sorting;

public class Paso4 {

    /**
     * Busca un elemento usando la técnica del Centinela
     * Elimina la comprobación de límites del bucle interno.
     * @param a   Arreglo de enteros
     * @param key Valor a buscar
     * @return El índice de la primera coincidencia
     */
    public static int busquedaCentinela(int[] a, int key) {
        //Arreglo nulo o vacío
        if (a == null || a.length == 0) {
            return -1;
        }

        int n = a.length;
        int last = a[n - 1]; //Guardar el último elemento

        // Si el último elemento ya es el que queremos, retornamos n-1 directamente
        // y ya no ponemos el centinela.
        if (last == key) {
            return n - 1;
        }

        a[n - 1] = key; //Colocar el centinela
        int i = 0;

        // Bucle sin chequeo de límites (i < n)
        // Solo hacemos 1 comparación por vuelta.
        while (a[i] != key) {
            i++;
        }

        a[n - 1] = last; //Restaurar el último elemento

        // Se encontró el dato real o al centinela?
        // Si i < n - 1, lo encontramos antes del centinela
        // Si i == n - 1, ya sabemos que 'last' no era la clave ---> fue el centinela
        if (i < n - 1) {
            return i;
        }
        return -1;
    }
}
