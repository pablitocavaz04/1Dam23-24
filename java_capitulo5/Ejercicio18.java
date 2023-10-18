/* ******************************************************************************* */
/*   File:Ejercicio18.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/10/18 12:21                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/10/18 12:29												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo5;

import java.util.Scanner;

public class Ejercicio18 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        do 
        {
            System.out.print("Introduzca el primer numero: ");
            num1 = Integer.parseInt(sc.nextLine());
            System.out.print("Introduzca el segundo numero: ");
            num2 = Integer.parseInt(sc.nextLine());
            if (num1 == num2)
                System.out.println("Los numeros introducidos son incorrectos.");
        } while (num1 == num2);

        if (num1 > num2 ) 
        {
            int aux = num1;
            num1 = num2;
            num2 = aux;
            
        }
        for (int i = num1; i <= num2; i+=7)
            System.out.print(i+" ");

        System.out.println();
    }
}
