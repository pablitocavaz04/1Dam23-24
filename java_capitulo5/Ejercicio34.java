/* ******************************************************************************* */
/*   File:Ejercicio34.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/10/25 11:05                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/10/25 11:05												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo5;

import java.util.Scanner;

public class Ejercicio34 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Porfavor, introduzca un número: ");
        int num1 = Integer.parseInt(sc.nextLine());
        System.out.print("Introduzca otro número: ");
        int num2 = Integer.parseInt(sc.nextLine());
        int aux1 = 0;
        int aux2 = 0;
        long numPar = 0;
        long numImpar = 0;
        while (num1 > 0) 
        {
            aux1 = (aux1 * 10) + num1%10;
            aux2 = (aux2 * 10) + num2%10;
            num1 /= 10;
            num2 /= 10;
        }

        while (aux1 > 0) 
        {
            //Numero 1
            if ((aux1%10)%2 == 0) 
                numPar = (numPar * 10)+aux1%10;
            else
                numImpar = (numImpar * 10)+aux1%10;
            //Numero2
            if ((aux2%10)%2 == 0) 
                numPar = (numPar * 10)+aux2%10;
            else
                numImpar = (numImpar * 10)+aux2%10;
            aux1 /= 10;
            aux2 /= 10;
            
        }
        System.out.println("El numero formado por los dígitos pares es : "+numPar);
        System.out.println("El numero formado por los dígitos impares es : "+numImpar);
    }
}
