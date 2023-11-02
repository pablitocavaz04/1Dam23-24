/* ******************************************************************************* */
/*   File:Ejercicio61.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/11/02 09:52                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/11/02 10:06												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo5;

import java.util.Scanner;

public class Ejercicio61
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int altura = 0;
        do
        {
            System.out.print("Introduzca la altura de la V: ");
            altura = Integer.parseInt(sc.nextLine());
            if (altura <3 )
                System.out.println("Intentalo de nuevo.");
        } while (altura <3);
        for (int i = 1; i <= altura; i++)
        {
            for (int j = 1; j <= i-1; j++)
                System.out.print(" ");
            for (int j = 1; j <= 3; j++)
                System.out.print("*");
            for (int j = 1; j <= (altura-i)*2; j++)
                System.out.print(" ");
            for (int j = 1; j <= 3; j++)
                System.out.print("*");
        System.out.println(" ");
        }
    }
}
