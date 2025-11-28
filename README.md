# README — Taller de Búsquedas (Arrays y SLL)

Este proyecto implementa métodos clásicos de búsqueda en arreglos (int[]) y listas enlazadas simples (SLL). Cada paso corresponde a un requerimiento del taller y se encuentra organizado en clases dentro del paquete `edu.u2.sorting.searching`.

## Estructura del Proyecto

```
src/
└── main/java/edu/u2/sorting
    ├── info/
    │   └── Datasets.java
    ├── node/
    │   └── Node.java
    ├── searching/
    │   ├── Paso1.java
    │   ├── Paso2.java
    │   ├── Paso3.java
    │   ├── Paso4.java
    │   └── Paso5.java
    └── main/
        └── Main.java
```

## Datasets

- **A** = [8, 3, 6, 3, 9, 7, 2, 3]
- **B** = [1, 2, 3, 5, 7, 9, 11, 15]
- **C** = [2, 2, 2, 2, 2]
- **D** = []
- **SLL** = 3 → 1 → 3 → 2

## Métodos Implementados

### Paso 1 – Primera Ocurrencia
- `indexOfFirst(int[] arr, int key)`
- `indexOfFirst(Node head, int key)`

### Paso 2 – Última Ocurrencia
- `lastOccurrenceArray(int[] arr, int key)`
- `indexOfLast(Node head, int key)`

### Paso 3 – findAll por Predicado
- `findAll(int[] arr, IntPredicate p)`
- `findAllIndexes(Node head, Predicate<Node> p)`
- Predicados: `isPair()`, `equals(key)`, `lessThan`, `greaterThan`

### Paso 4 – Búsqueda con Centinela
- `searchCentinel(int[] arr, int key)`

### Paso 5 – Búsqueda Binaria
- `binarySearch(int[] arr, int key)`
- `binarySearchFirst(int[] arr, int key)`

## Demo Automático

`Main.java` ejecuta automáticamente todos los pasos, mostrando:

- Paso #
- Dataset usado
- Predicado (si aplica)
- Resultado

