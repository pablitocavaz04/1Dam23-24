/* ******************************************************************************* */
/*   File:Ejercicio05.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/12/11 09:39                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/12/11 09:46												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo7.Array_Bidimensionales;

public class Ejercicio05 {
    public static void main(String[] args) {
        int [][] num = new int[6][10]; //Array de 6 filas por 10 columnas
        int fila;
        int columna;
        int valorMax = 0;
        int filaMax = 0;
        int columnaMax = 0;
        int valorMin = 1000;
        int filaMin = 0;
        int columnaMin = 0;
        for(fila = 0; fila < 6; fila++)
        {
            for(columna = 0; columna < 10; columna++)
            {
                num[fila][columna] = (int)(Math.random()*1001);
                System.out.printf("%3d ",num[fila][columna]);
                if (valorMax < num[fila][columna])
                {
                    valorMax = num[fila][columna];
                    filaMax = fila;
                    columnaMax = columna;
                }
                if (valorMin > num[fila][columna])
                {
                    valorMin = num[fila][columna];
                    filaMin = fila;
                    columnaMin = columna;
                }
            }
            System.out.println();
        }
        System.out.println("La posicion del valor Max es, fila "+filaMax+" columna "+columnaMax+" y el numero es : "+valorMax);
        System.out.println("La posicion del valor Min es, fila "+filaMin+" columna "+columnaMin+" y el numero es : "+valorMin);
    }
}
