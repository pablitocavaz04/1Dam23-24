/* ******************************************************************************* */
/*   File:Ejercicio07.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/10/09 10:29                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/10/09 10:35												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo4;

import java.util.Scanner;

public class Ejercicio07 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca las tres notas de las que vas a realizar la media: ");
        float nota1 = sc.nextFloat();
        float nota2 = sc.nextFloat();
        float nota3 = sc.nextFloat();
        System.out.printf("La media de sus tres notas es %.2f",((nota1+nota2+nota3)/3));
    }
}
