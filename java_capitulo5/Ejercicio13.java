/* ******************************************************************************* */
/*   File:Ejercicio13.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/10/18 10:51                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/10/18 10:57												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo5;

import java.util.Scanner;

public class Ejercicio13 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int neg,pos,n;
        pos = 0;
        neg = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Introduzca un numero positivo o negativo: ");
            n = Integer.parseInt(sc.nextLine());
            if (n > 0)
                pos++;
            else
                neg++;
        }
        System.out.println("Has introducido "+pos+" numeros positivos y "+neg+" numeros negativos.");
    }
}
