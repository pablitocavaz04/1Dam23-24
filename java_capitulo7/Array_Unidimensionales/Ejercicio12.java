/* ******************************************************************************* */
/*   File:Ejercicio12.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/11/20 10:47                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/11/23 08:52												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo7.Array_Unidimensionales;

import java.util.Scanner;

public class Ejercicio12
{
    public static void main(String[] args)
    {
        int [] aInicial = new int[10];
        int [] aFinal  = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < aInicial.length; i++)
        {
            System.out.print("Introduzca un numero para la posicion del array "+i+" : ");
            aInicial[i] = Integer.parseInt(sc.nextLine());
        }
        for (int i = 0; i < aInicial.length; i++)
        {
            System.out.println("Posicion "+i+" = "+aInicial[i]);
        }
        int inical = 0;
        int fiinal = 0;
        do
        {
            System.out.print("Introduzca la primera posicion :");
            inical = Integer.parseInt(sc.nextLine());
            System.out.print("Introduzca la segunda posicion :");
            fiinal = Integer.parseInt(sc.nextLine());
            if (inical > fiinal)
            System.out.println("La posicion primera debe ser menor que la segunda.");
        } while (inical>fiinal);
        int primerdig = 0;
        int segundig = 0;
        
        for (int i = 0; i < 10; i++)
        {
            if (i == inical)
            {
                primerdig = aInicial[i]; 
                aFinal[i+1] = aInicial[i];
            }
            else if (i == fiinal)
                aFinal[i] = primerdig;
            else if (i == 9)
                aFinal[0] = aInicial[i];
            else
            aFinal[i+1] = aInicial[i];

        }
        for (int i = 0; i < aFinal.length; i++) {
            System.out.println("Posicion "+i+" = "+aFinal[i]);
        }
    }
}
