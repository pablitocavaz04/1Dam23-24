/* ******************************************************************************* */
/*   File:Ejercicio56.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/11/02 08:30                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/11/02 08:37												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo5;

import java.util.Scanner;

public class Ejercicio56
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la altura de la figura : ");
        int altura = Integer.parseInt(sc.nextLine());
        for (int i = altura; i >= 1; i--)
        {
            for (int j = 1; j <= altura-i; j++)
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
                System.out.print("*");
        System.out.println(" ");
        }
    }
}
