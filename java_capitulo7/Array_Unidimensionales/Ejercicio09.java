
/* ******************************************************************************* */
/*   File:Ejercicio09.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/11/20 09:29                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/11/20 09:36												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo7.Array_Unidimensionales;

import java.util.Scanner;

public class Ejercicio09
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int [] numeros = new int[8];
        for (int i = 0; i < numeros.length; i++)
        {
            System.out.print("Introduzca el numero "+(i+1)+" : ");
            numeros[i] = Integer.parseInt(sc.nextLine());
        }

        for (int i = 0; i < numeros.length; i++)
        {
            if (numeros[i] %2 == 0)
                System.out.println("El numero "+numeros[i]+" es par");
            else
                System.out.println("El numero "+numeros[i]+" es impar");

        }
    }
}
