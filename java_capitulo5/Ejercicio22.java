/* ******************************************************************************* */
/*   File:Ejercicio22.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/10/19 10:31                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/10/19 10:50												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo5;

import java.util.Scanner;

public class Ejercicio22 
{
    public static void main(String[] args) 
    {
        boolean primo;
        for (int i = 2; i <= 100; i++) 
        {
             primo = true;
            for (int j = 2; j < i; j++) 
            {
                if (i%j == 0) 
                    primo = false;
            }
            if (primo)
                    System.out.print(i+" ");
        }
    }
}
