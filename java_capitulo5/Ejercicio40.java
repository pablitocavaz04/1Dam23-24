/* ******************************************************************************* */
/*   File:Ejercicio40.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/10/30 08:39                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/10/30 09:11												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo5;
import java.util.Scanner;

public class Ejercicio40 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int altura;
        do 
        {
            System.out.print("Introduzca la altura: ");
            altura =Integer.parseInt(sc.nextLine());
            if (altura %2 == 0 || altura <3)
            System.out.println("Intentalo de nuevo.");

        } while (altura %2 == 0 || altura <3);

        for (int i = 1; i <= altura/2+1; i++) 
        {
            for (int j = 1; j <= (altura/2+1)-i; j++)
                System.out.print(" ");
            for (int j = 1; j <= i*2-1; j++) 
            {
                if (j == 1 || j == i*2-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
        System.out.println(" ");
        }
        
        for (int i = 0; i < altura/2; i++) {
            for (int j = 0; j <= i; j++)
                System.out.print(" ");
            for (int j = 1; j <= (altura/2-i)*2-1; j++) 
            {
                if (j == 1 || j == (altura/2-i)*2-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
        System.out.println(" ");
        }

    }
}


/*
 * Tenemos que imprimir un rombo por ej de altura 9.
 *          *
 *         * *
 *        *   *
 *       *     *
 *      *       *
 *       *     *
 *        *   *
 *         * *
 *          *
 */