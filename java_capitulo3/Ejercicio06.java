/* ******************************************************************************* */
/*   File:Ejercicio06.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/10/09 09:29                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/10/09 09:31											       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo3;

import java.util.Scanner;

public class Ejercicio06
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Área de un triangulo");
        System.out.println("---------------------");
        System.out.print("Por favor, introduzca la longitud de la base (cm): ");
        double base = sc.nextDouble();
        System.out.print("Introduzca la altura (cm): ");
        double altura = sc.nextDouble();
        System.out.println("El área del rectángulo es " + ((base * altura/2)) + " cm²");
    }
}
