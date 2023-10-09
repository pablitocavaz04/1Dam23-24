/* ******************************************************************************* */
/*   File:Ejercicio04.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/10/09 09:23                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/10/09 09:27											       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo3;

import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduzca el primer numero: ");
    double x = sc.nextDouble();
    System.out.print("Introduzca el segundo numero: ");
    double y = sc.nextDouble();
    
    System.out.println("x = " + x);
    System.out.println("y = " + y);
    System.out.println("x + y = " + (x + y));
    System.out.println("x - y = " + (x - y));
    System.out.println("x / y = " + (x / y));
    System.out.println("x * y = " + (x * y));
    }
}
