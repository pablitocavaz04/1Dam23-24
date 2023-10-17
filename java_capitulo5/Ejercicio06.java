/* ******************************************************************************* */
/*   File:Ejercicio06.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/10/17 13:25                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/10/17 13:26												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo5;

public class Ejercicio06 
{
    public static void main(String[] args) 
    {
        int i;
        i = 320;
        System.out.print("Los numeros son = ");
        do 
        {
            System.out.print(i+" ");
            i-=20;
        } while (i >= 160);
    }
}
