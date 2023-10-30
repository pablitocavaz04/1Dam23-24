/* ******************************************************************************* */
/*   File:Ejercicio50.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/10/31 00:25                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/10/31 00:39												       */
/*                                                                                 */
/* ******************************************************************************* */

package java_capitulo5;

import java.util.Scanner;

public class Ejercicio53
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la altura de la figura : ");
        int altura = Integer.parseInt(sc.nextLine());
        for (int i = altura; i>=1 ; i--)
        {
            for (int j = i; j >=1; j--)
                System.out.print("*");
        System.out.println("");
        }
    }
}
