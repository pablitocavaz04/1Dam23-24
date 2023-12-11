/* ******************************************************************************* */
/*   File:Ejercicio04.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/12/11 09:07                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/12/11 09:10												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo7.Array_Bidimensionales;

public class Ejercicio04
{
    public static void main(String[] args)throws InterruptedException
    {
        int [][] num = new int[4][5];//Array de 4 filas por 5 columnas

        //Ahora vamos a asignarle valores entre 100 y 199 de manera aleatoria
        int fila;
        int columna;
        for (fila = 0; fila < 4; fila++)
        {
            for ( columna = 0; columna < 5; columna++)
            {
                num [fila][columna] = (int)(Math.random()*100)+100;
            }    
        }

        //Ahora vamos a mostrar la tabla con la suma de las filas
        int sumaFila;
        for ( fila = 0; fila < 4; fila++)
        {
            sumaFila = 0;
            for ( columna = 0; columna < 5; columna++)
            {
                Thread.sleep(185);
                System.out.printf("%7d  ",num[fila][columna]);
                sumaFila += num[fila][columna];
            }
            Thread.sleep(185);
            System.out.printf("|%7d \n",sumaFila);
        }

        //Ahora vamos a sumar las columnas y ir pintando los resultados
        for(columna = 0; columna <5; columna++)
        {
            Thread.sleep(185);
            System.out.print("----------");
        }
        Thread.sleep(185);
        System.out.println("---------");
        int sumaColumna;
        int sumaTotal = 0;
        for ( columna = 0; columna < 5; columna++)
        {
            sumaColumna = 0;
            for (fila = 0; fila < 4; fila++)
            {
                sumaColumna+= num[fila][columna];
            }
            Thread.sleep(185);
            System.out.printf("%7d  ",sumaColumna);
            sumaTotal +=sumaColumna;
        }
        Thread.sleep(185);
        System.out.printf("|%7d\n  ",sumaTotal);
    }
}
