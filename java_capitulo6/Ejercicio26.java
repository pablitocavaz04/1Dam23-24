/* ******************************************************************************* */
/*   File:Ejercicio26.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/11/09 11:00                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/11/09 11:04												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo6;

import java.util.Scanner;

public class Ejercicio26
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la altura de la tableta : ");
        int altura = Integer.parseInt(sc.nextLine());
        System.out.print("Introduzca la anchura de la tableta : ");
        int anchura = Integer.parseInt(sc.nextLine());
        int auxI = (int)(Math.random()*altura)+1;
        int auxJ = (int)(Math.random()*anchura)+1;
        for (int i = 1; i <= altura; i++)
        {
            for (int j = 1; j <= anchura; j++)
            {
                if (i == auxI && j == auxJ)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
        System.out.println();
        }
    }
}
