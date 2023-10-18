/* ******************************************************************************* */
/*   File:Ejercicio17.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/10/18 12:03                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/10/18 12:20												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo5;

import java.util.Scanner;

public class Ejercicio17 
{
    public static void main(String[] args) 
    {
        long num;
        long aux;
        long resultado;
        Scanner sc = new Scanner(System.in);
        do 
        {
            System.out.print("Introduce un numero positivo porfavor: ");
            num = Long.parseLong(sc.nextLine());

            if (num < 0)
                System.out.println("El numero introducido no es correcto");
        } while (num < 0);
        aux=0;
        for (long i = num; i <= num+100 ;i++) 
            aux += i;
        System.out.println("La suma es = "+aux);
    }
}
