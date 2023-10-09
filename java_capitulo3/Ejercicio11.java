/* ******************************************************************************* */
/*   File:Ejercicio11.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/10/09 09:45                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/10/09 09:46											       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo3;

import java.util.Scanner;

public class Ejercicio11 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, introduzca el número de Kb: ");
        double kb = sc.nextDouble();
        System.out.println(kb + "Kb son " +  (kb / 1024) + "Mb");
    }    
}
