/* ******************************************************************************* */
/*   File:Ejercicio28.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/10/24 13:31                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/10/24 13:35												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo5;

import java.util.Scanner;

public class Ejercicio28
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, introduzca un numero entero: ");
        int numero = Integer.parseInt(sc.nextLine());
        int total = 1;
        for (int i = 1; i <= numero; i++)
            total*=i;
        System.out.println(numero+"! = "+total);
    }
}
