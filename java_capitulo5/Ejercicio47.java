/* ******************************************************************************* */
/*   File:Ejercicio47.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/10/30 10:31                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/10/30 10:43												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo5;

import java.util.Scanner;

public class Ejercicio47
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int altura = 0;
        do 
        {
            System.out.print("Por favor, introduzca la altura (número impar mayor o igual a 5): ");
            altura = Integer.parseInt(sc.nextLine());
            if (altura < 5 || altura%2 == 0)
            System.out.println("La altura introducida no es correcta");
        } while (altura < 5 || altura%2 == 0);

        for (int i = 1; i <= altura/2+1; i++)
        {
            for (int j = 1; j <= 6; j++)
            {
                if (i == 1 || i == altura/2+1)
                    System.out.print("M");
                else if(j == 1 || j == 6)
                    System.out.print("M");    
                else
                System.out.print(" ");
            }  
        System.out.println(" ");  
        }
        for (int i = 1; i <= altura/2; i++)
        {
            for (int j = 1; j <= 6; j++)
            {
                if (i == altura/2)
                System.out.print("M");
                else if (j == 1 || j == 6)
                System.out.print("M");
                else
                System.out.print(" ");
            }
        System.out.println(" ");
        }
    }
}
