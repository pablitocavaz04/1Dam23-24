/* ******************************************************************************* */
/*   File:Ejercicio06.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/10/09 10:19                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/10/09 10:28												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo4;

import java.util.Scanner;

public class Ejercicio06 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la altura desde la que va a caer el objeto(m): ");
        double altura = sc.nextDouble();
        double raiz = Math.sqrt((altura*2)/9.81);
        System.out.printf("El tiempo que va a tardar cayendo desde una altura %.2f es %.2f segundos",altura,raiz);

    }
}
