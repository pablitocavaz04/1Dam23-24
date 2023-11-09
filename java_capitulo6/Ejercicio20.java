/* ******************************************************************************* */
/*   File:Ejercicio20.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/11/09 09:33                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/11/09 09:45												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo6;

import java.util.Scanner;

public class Ejercicio20
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, indique la capacidad de la cuba en liros : ");
        int capacidad = Integer.parseInt(sc.nextLine());
        int litros = (int)(Math.random()*capacidad)+1;
        for (int i = 1; i <= capacidad; i++)
        {
            for (int j = 1; j <= 6; j++)
            {
                if (i == capacidad)
                    System.out.print("*");
                else
                {
                    if (i <= capacidad-litros)
                    {
                        if (j == 1 || j == 6)
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    }
                    else
                    {
                        if (j == 1 || j == 6)
                            System.out.print("*");
                        else
                            System.out.print("=");
                    }
                }
            }
            System.out.println();
        }

    }
}
