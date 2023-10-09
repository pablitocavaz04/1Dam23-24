/* ******************************************************************************* */
/*   File:Ejercicio01.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/10/09 08:45                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/10/09 08:45												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo3;

import java.util.Scanner;

public class Ejercicio01 
{    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x,y;
        System.out.print("Introduzca el primer numero: ");
        x=sc.nextInt();
        System.out.print("Introduzca el segundo numero: ");
        y=sc.nextInt();
        System.out.printf("La multiplicacion de %d x %d es = %d",x,y,(x*y));
    }
}
