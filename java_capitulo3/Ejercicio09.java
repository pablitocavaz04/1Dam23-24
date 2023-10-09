/* ******************************************************************************* */
/*   File:Ejercicio09.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/10/09 09:39                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/10/09 09:41												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo3;

import java.util.Scanner;

public class Ejercicio09
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        final double PI = 3.141592654;
        System.out.println("Volumen de un cono");
        System.out.println("------------------");
        System.out.print("Por favor, introduzca la altura (cm): ");
        double h = sc.nextDouble();
        System.out.print("Introduzca el radio de la base (cm): ");
        double r =sc.nextDouble();
        double v = (1.0/3.0) * PI * r * r * h;
        System.out.println("El volumen del cono es de " +  v + " cm³");
    }    
}
