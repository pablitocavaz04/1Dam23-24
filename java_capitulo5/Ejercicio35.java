/* ******************************************************************************* */
/*   File:Ejercicio35.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/10/25 11:51                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/10/25 12:43												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo5;

import java.util.Scanner;

public class Ejercicio35 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int altura;
        do 
        {
            System.out.print("Introduzca la altura de la x: ");
            altura = Integer.parseInt(sc.nextLine());
            if (altura < 3)
                System.out.println("El numero introducido es erroneo.");
        } while (altura < 3);
        for (int i = 1; i <= altura; i++) 
        {
            for (int j = 1; j <= altura; j++) 
            {
                if (j == i || j==altura-i+1)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}


/*
    *   *
     * *
      *
     * *
    *   *

    En la fila 1 los * se pintan en la 1 y 5 posicion
    En la fila 2 los * se pintan en la 2 y 4 posicion
    En la fila 3 los * se pintan en la 3 posicion
    En la fila 4 los * se pintan en la 2 y 4 posicion
    En la fila 5 los * se pintan en la 1 y 5 posicion
 */