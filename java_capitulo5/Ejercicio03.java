/* ******************************************************************************* */
/*   File:Ejercicio03.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/10/17 13:14                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/10/17 13:14												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo5;

public class Ejercicio03 
{
    public static void main(String[] args) 
    {
        int i;
        i = 0;
        System.out.print("Los multiplos de 5 son = ");
        do 
        {
            System.out.print(i+" ");
            i += 5;
        } while (i <= 100);    
    }
}
