/* ******************************************************************************* */
/*   File:Ejercicio24.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/10/23 12:19                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/10/23 12:47												       */
/*                                                                                 */
/* ******************************************************************************* */

package java_capitulo5;

import java.util.Scanner;

public class Ejercicio24 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la altura de la piramide: ");
        int altura = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= altura; i++) 
        {
            for (int j = 1; j <= altura-i; j++)
                System.out.print(" ");
            for (int j = 1; j < i; j++) 
                System.out.print(j);
            for (int j = i; j >= 1; j--)
                System.out.print(j);
           System.out.println(" ");    
        }

    }
}

/*
 * La piramide de numeros funciona tal que así:
 * Altura t
 *      1
 *     121
 *    12321
 *   1234321
 *  123454321
 * 12345654321
 *1234567654321
 * La cantidad de espacios que tenemos que imprimir es altura menos la fila
 * en la que nos encontramos.
 * La cantidad de digitios que imprimos es altura*2-1,
 */