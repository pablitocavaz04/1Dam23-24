/* ******************************************************************************* */
/*   File:Ejercicio02.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2024/01/25 08:29                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2024/01/25 08:47												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo10.Ejercicio02;

import java.util.ArrayList;

public class Ejercicio02
{
    public static void main(String[] args) {
        ArrayList<Integer> ValAl = new ArrayList<Integer>();
        
        int valores = (int)(Math.random()*101);
        int arraySize = (int)(Math.random()*11)+10;
        int maximo = 0;
        int minimo = 100;
        int media = 0;

        for (int i = 0; i < arraySize; i++)
        {
            ValAl.add((int)(Math.random()*101));
            if (maximo < ValAl.get(i))
                maximo = ValAl.get(i);

            if (minimo > ValAl.get(i))
                minimo = ValAl.get(i);
            media+= ValAl.get(i);
        }
    
        System.out.println("Los valores que contiene el array son: ");
        for (int i = 0; i < arraySize; i++)
            System.out.println("Posicion "+i+" : "+ValAl.get(i));

            System.out.println("El valor minimo es : "+minimo);
            System.out.println("El valor maximo es : "+maximo);
        System.out.println("La suma de todo los valores es : "+media);
        System.out.println("La media de todos los numeros es : "+(media/ValAl.size()));

        }
}
