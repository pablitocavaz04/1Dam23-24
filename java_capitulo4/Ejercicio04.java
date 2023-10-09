/* ******************************************************************************* */
/*   File:Ejercicio04.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/10/09 10:08                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/10/09 10:12												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo4;

import java.util.Scanner;

public class Ejercicio04 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la cantidad de horas trabajadas: ");
        float horas = sc.nextFloat();
        if (horas<=40)
            System.out.printf("El salario que te corresponde es = %.2f",(horas*12));
        else
            System.out.printf("El salario que te corresponde es = %.2f",(horas*16));
    }
}
