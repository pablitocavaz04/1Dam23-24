/* ******************************************************************************* */
/*   File:Ejercicio3.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/11/15 12:13                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/11/15 12:39												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo7.Array_Unidimensionales;

import java.util.Scanner;

public class Ejercicio03
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       int []  array1 = new int[10];
       for (int i = 0; i < 10; i++)
       {
            System.out.print("Introduza el numero "+i+" :");
            array1[i] = Integer.parseInt(sc.nextLine());
       }
       for (int i = 9; i >= 0 ; i--)
            System.out.printf("array1[%2d] : %d\n",i,array1[i]);
    }
}
