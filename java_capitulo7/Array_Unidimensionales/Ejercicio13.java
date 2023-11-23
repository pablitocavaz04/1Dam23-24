/* ******************************************************************************* */
/*   File:Ejercicio13.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/11/23 08:53                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/11/23 09:02												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo7.Array_Unidimensionales;

import java.util.Scanner;

public class Ejercicio13
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int [] numeros = new int[100];
        int maximo = 0;
        int minimo = 500;
        for (int i = 0; i < numeros.length; i++)
        {
            numeros[i] = (int)(Math.random()*501);
            System.out.print(numeros[i]+" ");
            if (numeros[i] > maximo)
                maximo = numeros[i];
            if (numeros[i] < minimo)
                minimo = numeros[i];
        }
        System.out.println();
        System.out.print("¿Qué quieres destacar?(1 - mínimo, 2 - máximo: )");
        int opcion = Integer.parseInt(sc.nextLine());
        switch (opcion)
        {
            case 1:
                for (int i = 0; i < numeros.length; i++)
                {
                    if (numeros[i] == minimo)
                        System.out.print("***"+numeros[i]+"*** ");
                    else
                        System.out.print(numeros[i]+" ");
                }
                break;
        
            case 2:
                for (int i = 0; i < numeros.length; i++)
                {
                    if (numeros[i] == maximo)
                        System.out.print("***"+numeros[i]+"*** ");
                    else
                        System.out.print(numeros[i]+" ");
                }
                break;
                
            default:
                break;
        }
    }
}
