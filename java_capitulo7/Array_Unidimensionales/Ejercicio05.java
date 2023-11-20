/* ******************************************************************************* */
/*   File:Ejercicio05.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/11/20 08:44                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/11/20 08:59												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo7.Array_Unidimensionales;

import java.util.Scanner;

public class Ejercicio05
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int [] numeros = new int[10];
        int maximo = 0;
        int minimo = 10000;
        for (int i = 0; i < 10; i++)
        {
            System.out.print("Introduzca el numero "+(i+1)+" : ");
            numeros[i] = Integer.parseInt(sc.nextLine());
        }
       for (int i = 0; i < 10; i++)
       {
            if (numeros[i] > maximo) 
                maximo = numeros[i];
            else if (numeros[i] < minimo)
                minimo = numeros[i];
       }
       System.out.println("EL valor máximo "+maximo);
       System.out.println("EL valor mínimo "+minimo);
    }
}
