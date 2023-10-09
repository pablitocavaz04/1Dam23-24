/* ******************************************************************************* */
/*   File:Ejercicio03.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/10/09 09:18                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/10/09 09:21  												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo3;

import java.util.Scanner;

public class Ejercicio03
{
    public static void main(String[] args)
    {
         Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la cantidad de pesetas que quieres convertir: ");
        int pesetas = sc.nextInt();
        int euros= (int) (pesetas /  166.386);
        System.out.printf("%d pesetas son %d euros. ", pesetas,euros);
    }
    
}
