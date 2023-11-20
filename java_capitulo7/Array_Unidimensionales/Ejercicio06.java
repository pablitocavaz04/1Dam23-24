/* ******************************************************************************* */
/*   File:Ejercicio06.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/11/20 08:59                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/11/20 09:15												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo7.Array_Unidimensionales;

import java.util.Scanner;

public class Ejercicio06
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int [] numeros = new int[15];
        int [] copia = new int[15];
        for (int i = 0; i < 15; i++)
        {
            System.out.print("Introduzca el numero "+(i+1)+" : ");
            numeros[i]  = Integer.parseInt(sc.nextLine());
        }
        
        for (int i = 0; i < numeros.length; i++)
        {
            if (i == numeros.length-1)
                copia [0] = numeros[i];
            else
                copia[i+1] = numeros[i];
        }

        for (int i = 0; i < 15; i++)
            System.out.print(copia[i]+" ");
    }
}
