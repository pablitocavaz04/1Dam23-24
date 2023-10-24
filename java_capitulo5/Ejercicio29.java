/* ******************************************************************************* */
/*   File:Ejercicio28.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/10/24 13:35                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/10/24 13:43												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo5;

import java.util.Scanner;

public class Ejercicio29 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un numero: ");
        int limite = Integer.parseInt(sc.nextLine());
        System.out.print("Introduzca un numero por el cual no puede ser divisibles :");
        int nodiv = Integer.parseInt(sc.nextLine());
        System.out.println("Los numeros menores positivos que "+limite+" y que no son divisibles entre "+nodiv+" son :");
        for (int i = 1; i <= limite; i++) {
            if (i%nodiv != 0 ) {
                System.out.print(i+" ");
            }
        }
    }
}
