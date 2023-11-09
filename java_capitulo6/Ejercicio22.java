/* ******************************************************************************* */
/*   File:Ejercicio22.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/11/09 09:56                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/11/09 10:09												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo6;

import java.util.Scanner;

public class Ejercicio22
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, introduzca la longitud de la serpiente: ");
        int longitud = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= longitud; i++)
        {
            int position = (int)(Math.random()*2)-1;
            if (i == 1)
            {
                for (int j = 1; j <= 13; j++)
                {
                    if (j == 13)
                        System.out.print("@");
                    else
                        System.out.print(" ");
                }
            }
            else
            {
                int newPosition = 13-position;
                for (int j = 1; j <= newPosition; j++)
                {
                    if (j == newPosition)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
