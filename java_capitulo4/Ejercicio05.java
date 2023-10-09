/* ******************************************************************************* */
/*   File:Ejercicio05.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/10/09 10:14                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/10/09 10:19												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo4;

import java.util.Scanner;

public class Ejercicio05 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");
        System.out.print("Introduzca el valor de a: ");
        float a = sc.nextFloat();
        System.out.print("Introduzca el valor de b: ");
        float b = sc.nextFloat();
        System.out.printf("x = %.2f",(b/a));
    }
}
