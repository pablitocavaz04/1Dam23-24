/* ******************************************************************************* */
/*   File:Ejercicio04.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/11/20 08:33                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/11/20 08:44												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo7.Array_Unidimensionales;

public class Ejercicio04
{
    public static void main(String[] args)
    {
        int [] numero = new int[20];
        int [] cuadrado = new int[20];
        int [] cubo = new int[20];
        for (int i = 0; i < 20; i++)
        {
            numero[i] = (int)(Math.random()*20)+1;
            cuadrado[i]= numero[i]*numero[i];
            cubo[i] = numero[i]*numero[i]*numero[i];
        }
        System.out.print("Numeros = ");
        for (int i = 0; i < 20; i++)
        {
            System.out.print(numero[i]+" ");
        }
        System.out.println();
        System.out.print("Cuadrado = ");
        for (int i = 0; i < 20; i++)
        {
            System.out.print(cuadrado[i]+" ");
        }
        System.out.println();
        System.out.print("Cubo = ");
        for (int i = 0; i < 20; i++)
        {
            System.out.print(cubo[i]+" ");
        }
    }
}
