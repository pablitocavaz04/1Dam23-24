/* ******************************************************************************* */
/*   File:Ejercicio06.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2024/01/15 08:15                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2024/01/15 08:34												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo9.Ejercicio6;

import java_capitulo9.Ejercicio6.TIempo.Tiempo;

public class Ejercicio06
{
    public static void main(String[] args)
    {
        Tiempo t1 = new Tiempo(1, 20, 30);
        Tiempo t2 = new Tiempo(0, 30, 40);
        Tiempo t3 = new Tiempo(0, 35, 20);
        System.out.printf("%s + %s = %s%n",t1.toString(),t2.toString(),t3.toString());
        System.out.printf("%s - %s = %s%n",t2.toString(),t1.toString(),t3.toString());
    }
}
