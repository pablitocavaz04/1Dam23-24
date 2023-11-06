/* ******************************************************************************* */
/*   File:Ejercicio01.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/11/06 09:46                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/11/06 09:52												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo6;

public class Ejercicio01
{
    public static void main(String[] args)
    {
        int suma = 0;
        int tirada = 0;
        for (int i = 1; i <= 3; i++)
        {
            tirada = (int)(Math.random()*6)+1;
            System.out.println("La tirada numero "+i+" es "+tirada);
            suma += tirada;
        }
        System.out.println("La suma de los 3 dados es = "+suma);
    }
}
