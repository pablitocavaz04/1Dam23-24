/* ******************************************************************************* */
/*   File:Ejercicio16.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/10/18 11:53                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/10/18 12:02												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo5;

import java.util.Scanner;

public class Ejercicio16 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduca un numero: ");
        int num = Integer.parseInt(sc.nextLine());
        boolean primo;
        primo = true;
        for (int i = 2; i < num/2; i++) 
        {
            if (num%i == 0)
                primo = false;
        }
         if (primo) 
            System.out.println("El numero "+num+" es primo.");
        if (!primo)
            System.out.println("El numero "+num+" no es primo.");
    }
}
