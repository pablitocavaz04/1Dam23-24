/* ******************************************************************************* */
/*   File:Ejercicio10.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/11/20 09:37                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/11/20 10:37												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo7.Array_Unidimensionales;

public class Ejercicio10
{
    public static void main(String[] args)
    {
        int [] arrayAleatorios = new int[20];
        int [] copia = new int[20];
        int posPar = 0;
        for (int i = 0; i < 20; i++)
        {
            arrayAleatorios[i] = (int)(Math.random()*101);
        }
        
        for (int i = 0; i < 20; i++)
        {
            if (arrayAleatorios[i]%2 == 0)
            {
                copia[posPar] = arrayAleatorios[i];
                posPar++;
            }
        }
        for (int i = 0; i < 20; i++)
        {
            if (arrayAleatorios[i] %2 != 0)
                copia[posPar++] = arrayAleatorios[i];
        }
        for (int i = 0; i < copia.length; i++)
            System.out.print(copia[i]+" ");
    }
}
