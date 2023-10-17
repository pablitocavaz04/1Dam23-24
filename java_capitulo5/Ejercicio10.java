/* ******************************************************************************* */
/*   File:Ejercicio10.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/10/17 15:22                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/10/17 15:30												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo5;

import java.util.Scanner;

public class Ejercicio10 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int i;
        i=1;
        int total;
        total = 0;
        System.out.print("Introduzca un numero: ");
        int numeros = Integer.parseInt(sc.nextLine());
        while (numeros >= 0) 
        {
            total += numeros;
            i++;
            System.out.print("Introduzca el "+i+" numero: ");
            numeros = Integer.parseInt(sc.nextLine());
        }
        System.out.println("La media de los "+(i-1)+" numeros es = "+total/(i-1));
    }
}
