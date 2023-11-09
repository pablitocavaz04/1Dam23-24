/* ******************************************************************************* */
/*   File:Ejercicio17.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/11/09 08:53                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/11/09 09:19												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo6;

import java.util.Scanner;

public class Ejercicio17
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la altura de la pecera : ");
        int altura = Integer.parseInt(sc.nextLine());
        System.out.print("Ahora introduzca la anchura de la pecera : ");
        int anchura = Integer.parseInt(sc.nextLine());
        int pezI = (int)(Math.random()*altura)+1;
        int pezJ = (int)(Math.random()*anchura)+1;
        if (pezI == 1 )
            pezI++;
        else if (pezI == altura)
            pezI--;
        else if (pezJ == 1)
            pezJ ++;
        else if (pezJ == anchura)
            pezJ--;
            
        //entre 6 y 1 es *6 +1 , es decir entre 7 y 2; es *6 +2
        for (int i = 1; i <= altura; i++)
        {
            for (int j = 1; j <= anchura; j++)
            {
                if (i == 1 || i == altura)
                    System.out.print("* ");
                else
                {
                    if (j == 1 || j == anchura)
                        System.out.print("* ");
                    else if (i == pezI && j == pezJ)
                        System.out.print("& ");
                    else
                        System.out.print("  ");
                }
                  
            }
        System.out.println();
        }
    }
}
