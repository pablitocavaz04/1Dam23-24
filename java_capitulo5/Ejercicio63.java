/* ******************************************************************************* */
/*   File:Ejercicio63.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/11/02 10:13                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/11/06 09:41												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo5;

import java.util.Scanner;

public class Ejercicio63
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la altura de la primera pirámide: ");
        int piramide1 = Integer.parseInt(sc.nextLine());
        System.out.print("Introduzca la altura de la segunda piramide :");
        int piramide2 = Integer.parseInt(sc.nextLine());
        int altura = 0;
        int alturaPir2 = piramide2;
        int alturaPir1 = piramide1;
        if (piramide1 > piramide2)
            altura = piramide1;
        else
            altura = piramide2;
    
        for (int i = 1; i <= altura ; i++)
        {
            if (piramide1 > piramide2)
            {
                if (i <= piramide1-piramide2) {
                    for (int j = 1; j <= altura-i; j++)
                    System.out.print(" ");
                    for (int j = 1; j <= i*2-1; j++)
                        System.out.print("*");
                
                }
                else if (i > piramide1-piramide2 )
                {
                    for (int j = 1; j <= altura-i; j++)
                        System.out.print(" ");
                    for (int j = 1; j <= i*2-1; j++)
                        System.out.print("*");
                    for (int j = 1; j <= alturaPir2*2-1; j++)
                        System.out.print(" ");
                    for (int j = 1; j <= (i-(piramide2+1))*2-1; j++)
                        System.out.print("*");
                alturaPir2--;
                }
            }
            else if (piramide2 > piramide1)
            {
                if (i <= piramide2-piramide1)
                {
                    for (int j = 1; j <= (piramide1*2)+piramide2-i; j++)
                        System.out.print(" ");
                    for (int j = 1; j <= i*2-1; j++)
                        System.out.print("*");
                }
                else if (i > piramide2-piramide1)
                {
                    for (int j = 1; j <= piramide1-(i-(piramide2-piramide1)); j++)
                        System.out.print(" ");
                    for (int j = 1; j <= (i-(piramide2-piramide1))*2-1; j++)
                        System.out.print("*");
                    for (int j = 1; j <= alturaPir1*2-1; j++)
                        System.out.print(" ");
                    for (int j = 1; j <= i*2-1; j++)
                        System.out.print("*");
                    alturaPir1--;
                }
            }
        System.out.println();
        }
    }
}
