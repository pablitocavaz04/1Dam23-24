/* ******************************************************************************* */
/*   File:Ejercicio66.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/11/02 10:59                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/11/02 11:08												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo5;

import java.util.Scanner;

public class Ejercicio66
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int altura = 0;
        do {
            System.out.print("Introduzca la altura de la figura: ");
            altura = Integer.parseInt(sc.nextLine());
            if (altura < 3 && altura%2 ==0)
                System.out.println("La altura no es correcta porfavor intentalo de nuevo.");
        } while (altura < 3 && altura%2 ==0);
        int espacios = 0;
        for (int i = 1; i <= altura; i++)
        {
            if (i <= altura/2+1)
                espacios++;
            else
                espacios--;
            for (int j = 1; j <= espacios-1; j++)
                System.out.print(" ");
            for (int j = 1; j <= 6; j++)
            {
                if (j == 1 || j == 6)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
        System.out.println();
        }
    }
}
