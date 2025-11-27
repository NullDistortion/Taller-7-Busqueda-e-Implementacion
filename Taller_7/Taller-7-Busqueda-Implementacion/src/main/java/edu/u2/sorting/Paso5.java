public class Paso5 {

    /**
     * Busca un elemento 'key' en un arreglo ordenado 'a' de forma iterativa.
     * @param a   Arreglo de enteros (Debe estar ORDENADO).
     * @param key Valor a buscar.
     * @return El índice del elemento si se encuentra, o -1 si no existe.
     */
    public static int binarySearchFirst(int[] a, int key) {
        int low = 0;
        int high = a.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (a[mid] == key) {
                result = mid;     // Guardamos el índice encontrado
                high = mid - 1;   // Seguimos buscando a la izquierda por si hay otro antes
            } else if (a[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }
}