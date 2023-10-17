/* ******************************************************************************* */
/*   File:Ejercicio08.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/10/17 14:46                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/10/17 14:51												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo5;

import java.util.Scanner;

public class Ejercicio08 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un numero: ");
        int num = sc.nextInt();
        int i;
        i = 0;
        System.out.println("La tabla de multiplicar de "+num+" es");
        do 
        {
            System.out.println(num+" x "+i+" = "+num*i);
            i++;
        } while (i<=10);
    }
}
