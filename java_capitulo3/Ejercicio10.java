/* ******************************************************************************* */
/*   File:Ejercicio10.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/10/09 09:43                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/10/09 09:44												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo3;

import java.util.Scanner;

public class Ejercicio10 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, introduzca el número de Mb: ");
        double mb = sc.nextDouble();
        System.out.println(mb + "Mb son " +  (mb * 1024) + "Kb");
    }
}
