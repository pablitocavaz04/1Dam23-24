/* ******************************************************************************* */
/*   File:Ejercicio65.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/11/02 10:51                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/11/02 10:58												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo5;

import java.util.Scanner;

public class Ejercicio65
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la altura de la A: ");
        int altura = Integer.parseInt(sc.nextLine());
        System.out.print("Introduzca la fila del palito horizontal: ");
        int palito = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= altura; i++)
        {
            for (int j = 1; j <= altura-i; j++)
            System.out.print(" ");
            for (int j = 1; j <= i*2-1; j++)
            {
                if (i == palito)
                    System.out.print("*");
                else
                {
                    if (j == 1 || j == i*2-1)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
            }
        System.out.println();
        }
    }
}
