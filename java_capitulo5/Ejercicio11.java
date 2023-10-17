/* ******************************************************************************* */
/*   File:Ejercicio11.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/10/17 15:31                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/10/17 15:48												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo5;

import java.util.Scanner;

public class Ejercicio11 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un numero : ");
        int numero = Integer.parseInt(sc.nextLine());
        System.out.println("   Numero   |  Cuadrado  |    Cubo    ");
        System.out.println("--------------------------------------");
        for (int i = 0; i < 5; i++) 
        {
            System.out.printf("%11d |%11d | %11d\n",numero,(numero*numero),(numero*numero*numero));
            numero += 1;
        }
    }
}
