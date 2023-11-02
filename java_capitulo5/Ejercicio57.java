/* ******************************************************************************* */
/*   File:Ejercicio57.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/11/02 08:38                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/11/02 08:50												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo5;

import java.util.Scanner;

public class Ejercicio57
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la altura: ");
        int altura = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= altura; i++)
        {
            for (int j = 1; j <= altura; j++) {
                if (i == 1)
                    System.out.print("*");
                else
                {
                    if (j == i || j == altura)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
            } 
        System.out.println("");   
        }
    }
}
