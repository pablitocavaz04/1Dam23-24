package java_capitulo7.Array_Bidimensionales;

public class RepasoExm2 {

    // Método para mostrar la matriz
    public static void mostrarMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }

    // Método para rotar la matriz en sentido horario
    public static int[][] rotarMatriz(int[][] matriz) {
        int n = matriz.length;
        int[][] matrizRotada = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrizRotada[j][n - 1 - i] = matriz[i][j];
            }
        }

        return matrizRotada;
    }
    public static void main(String[] args) {
        // Crear la matriz inicial 3x3 con algunos valores
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Mostrar la matriz original
        System.out.println("Matriz Original:");
        mostrarMatriz(matriz);

        // Rotar la matriz 90 grados en sentido horario
        int[][] matrizRotada = rotarMatriz(matriz);

        // Mostrar la matriz rotada
        System.out.println("\nMatriz Rotada:");
        mostrarMatriz(matrizRotada);
    }
}
