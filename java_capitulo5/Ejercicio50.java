/* ******************************************************************************* */
/*   File:Ejercicio50.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/10/30 10:53                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/10/30 10:53												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo5;

import java.util.Scanner;

public class Ejercicio50 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int altura = 0;
        int asteriscos = 0;
        do
        {
            System.out.print("Introduzca la altura(5 como mínimo): ");
            altura = Integer.parseInt(sc.nextLine());
            System.out.print("Introduzca el número de espacios entre los numeros(1 como minimo): ");
            asteriscos = Integer.parseInt(sc.nextLine());
        } while (altura <5 || asteriscos <1);

        for (int i = 1; i <= altura; i++) 
        {
            for (int j = 1; j <= 9+asteriscos*2; j++)
            {
                if (i ==1 || i==3 || i==altura)
                {
                    if ((j>=2 && j<=asteriscos+1) || j >= asteriscos+5 && j<=asteriscos*2+5)
                    System.out.print(" ");
                    else
                    System.out.print("*");  
                }
                else
                if (j==1 || j==asteriscos+2 || j== asteriscos*2+6)
                System.out.print("*");
                else
                System.out.print(" ");
              
            }
        System.out.println(" ");
        }

    }
}
