/* ******************************************************************************* */
/*   File:Ejercicio07.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/10/09 09:33                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/10/09 09:34												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo3;

import java.util.Scanner;

public class Ejercicio07
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, introduzca la base imponible (precio del artículo sin IVA): ");
        double baseImponible = sc.nextDouble();

        System.out.printf("\nBase imponible %8.2f €\n", baseImponible);
        System.out.printf("IVA (21%%)      %8.2f €\n", (baseImponible * 0.21));
        System.out.printf("-------------------------\n");
        System.out.printf("Total          %8.2f €\n", (baseImponible * 1.21));
    }
}
