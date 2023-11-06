/* ******************************************************************************* */
/*   File:Ejercicio67.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/11/02 11:09                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/11/06 08:57												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo5;

import java.util.Scanner;

public class Ejercicio67
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el número de escalones: ");
        int numEscalones = Integer.parseInt(sc.nextLine());
        System.out.print("Introduzca la altura de cada escalón: ");
        int altEscalon = Integer.parseInt(sc.nextLine());
        int anchura = 4;
        for (int i = 1; i <= numEscalones*altEscalon; i++)
        {
            for (int j = 1; j <= anchura; j++)
                System.out.print("*");
        if (i % altEscalon == 0)
            anchura +=4;
        System.out.println();
        }
    }
}
