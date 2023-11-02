/* ******************************************************************************* */
/*   File:Ejercicio60.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/11/02 09:42                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/11/02 09:49												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo5;

import java.util.Scanner;

public class Ejercicio60
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int altura = 0;
        do
        {
            System.out.print("Introduzca la alutra: ");
            altura = Integer.parseInt(sc.nextLine());
            if (altura < 4)
            System.out.println("Intentalo de nuevo.");
        } while (altura < 4);

        for (int i = 1; i <= altura; i++)
        {
            if (i == altura || i == altura-1)
            {
                for (int j = 1; j <= 14; j++)
                {
                    if (j > 6 && j<9)
                        System.out.print(" ");
                    else
                        System.out.print("*");
                }
            }
            else
            {
                for (int j = 1; j <= 11; j++)
                {
                    if (j > 3 && j <9)
                        System.out.print(" ");
                    else
                        System.out.print("*");
                }
            }
        System.out.println("");
        }
    }
}
