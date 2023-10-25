/* ******************************************************************************* */
/*   File:Ejercicio33.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/10/25 10:56                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/10/25 11:03												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo5;

import java.util.Scanner;

public class Ejercicio33 
{
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la altura de la U: ");
        int altura = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= altura; i++) 
        {
            if (i != altura) 
            {
                for (int j = 1; j <= altura; j++) 
                {
                    if (j == 1 || j == altura) 
                        System.out.print("* ");
                    else
                    System.out.print("  ");
                }
            }
            else
            {
                for (int j = 1; j <= altura-1; j++) 
                {
                    if (j==1)
                        System.out.print("  ");
                    else
                    System.out.print("* ");
                }
            }
        System.out.println(" ");
        }
    }
}
