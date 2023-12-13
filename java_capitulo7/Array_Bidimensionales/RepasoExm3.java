/* ******************************************************************************* */
/*   File:RepasoExm3.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/12/13 10:52                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/12/13 12:08												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo7.Array_Bidimensionales;

import java.util.Scanner;

public class RepasoExm3
{
    public static int[][] valoresMatriz(int[][] matriz)
    {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < matriz.length; i++)
        {
            for (int j = 0; j < matriz.length; j++) 
            {
                System.out.print("Introduzca valores sobre la matriz: ");
                matriz[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
    return matriz;
    }
    public static void pintarMatriz(int[][] matriz)
    {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < matriz.length; i++)
        {
            for (int j = 0; j < matriz.length; j++)
            {
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
    }
    public static int[][] rotarMatrizSentidoHorario(int[][]matriz)
    {
      int ancho = matriz.length;
        int[][] matrizRotada = new int[ancho][ancho];
        for (int i = 0; i < matriz.length; i++)
        {
            for (int j = 0; j < matriz.length; j++)
            {
               matrizRotada[j][ancho-1-i] = matriz[i][j]; 
            }
        }
        return matrizRotada;
    }
    public static int [][] rotarMatrizSentidoAntihorario(int [][]matriz)
    {
        int ancho = matriz.length;
        int[][] matrizRotada = new int[ancho][ancho];
        for (int i = 0; i < matriz.length; i++)
        {
            for (int j = 0; j < matriz.length; j++)
            {
               matrizRotada[ancho-1-j][i] = matriz[i][j]; 
            }
        }
        return matrizRotada;
    }

    public static void main(String[] args)
    {
        int [][] matrizOriginal = new int[3][3];
        matrizOriginal = valoresMatriz(matrizOriginal);
        pintarMatriz(matrizOriginal);
        System.out.println();
        int [][] matrizRotada1 = rotarMatrizSentidoAntihorario(matrizOriginal);
        int [][] matrizRotada2 = rotarMatrizSentidoHorario(matrizOriginal);
        pintarMatriz(matrizRotada1);
        System.out.println();
        pintarMatriz(matrizRotada2);
        
    }
}


//Matriz de 9 numeros 4x3; con menu que rote 90 grados sentido antihorario,y 
//sentido horario