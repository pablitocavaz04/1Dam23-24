/* ******************************************************************************* */
/*   File:Ejercicio69.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/11/06 08:32                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/11/06 08:50												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo5;

import java.util.Scanner;

public class Ejercicio69
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la alutra de la pirámide maya: ");
        int altura = Integer.parseInt(sc.nextLine());
        int anchura = 6;
        for (int i = 1; i <= altura; i++)
        {
            //Pintamos espacios
            for (int j = 1; j <= altura-i; j++)
                System.out.print(" ");
            if (i%2 != 0)
            {
                for (int j = 1; j <= anchura; j++)
                    System.out.print("*");

            }else if (i%2 == 0)
            {
                for (int j = 1; j <= anchura; j++)
                {
                    if (j >i && j<i+5)
                        System.out.print(" ");
                    else
                        System.out.print("*");
                }
            }
        System.out.println();
        anchura+=2;
        }
    }
}
