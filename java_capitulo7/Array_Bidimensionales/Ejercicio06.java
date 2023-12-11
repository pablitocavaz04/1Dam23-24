/* ******************************************************************************* */
/*   File:Ejercicio06.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/12/11 11:00                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/12/11 11:00												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo7.Array_Bidimensionales;
public class Ejercicio06 {
    public static boolean repetido(int[][] valores, int valor, int posicion){
        boolean repetido = false;
        int columnas = valores[0].length;
        for(int i=0; i < posicion && !repetido;i++){
            int fila = i/columnas;
            int columna = i%columnas;
            repetido = valores[fila][columna]==valor;
        }
        return repetido;
    }

    public static int[][] rellenaMatriz(int filas, int columnas){
        int[][] valores = new int[filas][columnas];
        for(int i=0; i < filas*columnas;i++){
            int valor = 0;
            do {
                valor = (int)(Math.random()*filas*columnas +1);
            } while (repetido(valores, valor, i));
            valores[i/columnas][i%columnas] = valor;
        }
        return valores;
    }

    public static void imprimeMatriz(int[][] valores){
        for(int i=0;i<valores.length;i++){
            for(int j=0;j<valores[i].length;j++){
                System.out.printf("%4d ", valores[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] valores = rellenaMatriz(10, 10);
        imprimeMatriz(valores);
    }
    
}
