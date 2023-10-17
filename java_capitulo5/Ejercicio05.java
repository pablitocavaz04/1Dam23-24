/* ******************************************************************************* */
/*   File:Ejercicio05.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/10/17 13:23                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/10/17 13:24												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo5;

public class Ejercicio05 
{
    public static void main(String[] args) 
    {
        int i;
        i = 320;
        System.out.print("Los numeros son = ");
        while (i >= 160) 
        {
            System.out.print(i+"");
            i-=20;
        }
    }    
}
