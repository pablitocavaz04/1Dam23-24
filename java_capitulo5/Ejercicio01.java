/* ******************************************************************************* */
/*   File:Ejercicio01.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/10/17 13:03                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/10/17 13:03												       */
/*                                                                                 */
/* ******************************************************************************* */

package java_capitulo5;

public class Ejercicio01 
{
    public static void main(String[] args) 
    {
        System.out.print("Los numeros multiplos de 5 son = ");
        for (int i = 0; i <= 100; i++) 
        {
            if (i%5 == 0) {
                System.out.print(i+" ");
            }
        }
    }
}
