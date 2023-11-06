/* ******************************************************************************* */
/*   File:Ejercicio04.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/11/06 10:22                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/11/06 10:24												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo6;

public class Ejercicio04
{
    public static void main(String[] args)
    {
        for (int i = 1; i <= 20; i++)
            System.out.print((int)(Math.random()*11)+" ");
        System.out.println();
    }
}
