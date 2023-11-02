/* ******************************************************************************* */
/*   File:Ejercicio59.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/11/02 08:57                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/11/02 09:41												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo5;

import java.util.Scanner;

public class Ejercicio59
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la altura del árbol: ");
        int altura = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= altura; i++)
        {
            if (i == 1)
            {
                for (int j = 1; j <= altura-2; j++) 
                {
                    if (j == altura-2)
                    System.out.print("*");
                    else 
                    System.out.print(" ");
                }
            }
            else if (i == altura) 
            {
                for (int j = 1; j <= altura-2; j++) 
                {
                    if (j == altura-2)
                    System.out.print("Y");
                    else 
                    System.out.print(" ");
                }
            }
            else if (i == altura-1) 
            {
                for (int j = 1; j <= (i-1)*2-1; j++)
                    System.out.print("^");
            }
            else
            {
                for (int j = 1; j <= (altura-1)-i; j++)
                    System.out.print(" ");
                for (int j = 1; j <= (i-1)*2-1; j++)
                {
                    if (j == 1 || j == (i-1)*2-1)
                        System.out.print("^");
                    else
                        System.out.print(" ");
                }
            }
        System.out.println("");
        }
    }
}

