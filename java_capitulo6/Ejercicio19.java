/* ******************************************************************************* */
/*   File:Ejercicio19.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/11/09 09:21                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/11/09 09:33												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo6;

public class Ejercicio19
{
    public static void main(String[] args)
    {
        int mayorPares = -100;
        int menorImpares = 200;
        int media = 0;
        for (int i = 1; i <= 50; i++)
        {
            int numRandom = (int)(Math.random()*301)-100;
            System.out.print(numRandom+" ");
            if (numRandom%2 == 0)
            {
                if (mayorPares < numRandom)
                    mayorPares = numRandom;
            }
            else
            {
                if (menorImpares > numRandom)
                    menorImpares = numRandom;
            }
            media+=numRandom;
        }
        System.out.println();
        System.out.printf("El numero par mas grande introducido es %d\nEl numero impar menor introducido es %d\nLa media de todos los numeros es %.1f ",mayorPares,menorImpares,(float)(media/50));
    }
}
