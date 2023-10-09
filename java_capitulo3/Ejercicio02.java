/* ******************************************************************************* */
/*   File:Ejercicio02.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/10/09 08:58                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/10/09 08:58												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo3;

import java.util.Scanner;

public class Ejercicio02 
{
    public static void main(String[] args)
    {
    //     System.out.print("Por favor, introduzca la cantidad de euros que quiere convertir: ");
    // double euros = Double.parseDouble(System.console().readLine());

    // int pesetas = (int) (euros * 166.386);
    
    // System.out.printf("%.2f euros son %d pesetas.", euros, pesetas);
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la cantidad de euros que quieres convertir: ");
        double euros = sc.nextDouble();
        int pesetas = (int) (euros * 166.386);
        System.out.printf("%.2f euros son %d pesetas. ", euros,pesetas);
    }
}
