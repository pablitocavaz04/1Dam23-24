/* ******************************************************************************* */
/*   File:Ejercicio2.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/11/15 12:06                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/11/15 12:13												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo7.Array_Unidimensionales;

public class Ejercicio02
{
    public static void main(String[] args)
    {
        String [] simbolo = new String[10];

        simbolo [0] = "a";
        simbolo [1] = "x";
        simbolo [4] = "@";
        simbolo [6] = " ";
        simbolo [7] = "+";
        simbolo [8] = "Q";
        for (int i = 0; i < simbolo.length; i++)
        System.out.println("simbolo[" + i + "]: " + simbolo[i]);
         
    }
}
