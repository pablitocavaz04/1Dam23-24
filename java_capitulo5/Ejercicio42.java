
/* ******************************************************************************* */
/*   File:Ejercicio42.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/10/30 09:41                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/10/30 09:55												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo5;

import java.util.Scanner;

public class Ejercicio42 
{
    public static boolean esPrimo(int x)
    {
        boolean si = true;
        for (int i = 2; i <= x/2; i++) 
        {
            if (x%i == 0)
                si = false;
        }
        return si;

    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un numero entero positivo: ");
        int numero = Integer.parseInt(sc.nextLine());
        for (int i = numero; i < numero+5; i++) 
        {
            if (esPrimo(i)) 
            System.out.println(i+" es primo");
            else 
            System.out.println(i+" no es primo");
        }

    }
}
