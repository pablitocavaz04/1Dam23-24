/* ******************************************************************************* */
/*   File:Ejercicio14.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/11/23 09:03                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/11/23 09:23												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo7.Array_Unidimensionales;

import java.util.Scanner;

public class Ejercicio14
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String [] palabras = new String[8];
        String [] colores = {"verde" , "rojo","azul", "amarillo", "naranja", "rosa", "negro", "blanco","morado"};
        String [] noColores = new String[8];
        String [] arrayFinal = new String[8];
        for (int i = 0; i < 8; i++)
        {
            System.out.print("Introduzca palabras: ");
            palabras[i] = sc.nextLine();

        }
        for (int i = 0; i < 8; i++)
            System.out.println("Posicion "+i+" = "+palabras[i]);

        int contacolor = 0;
        int contaNoColor = 0;
        for (int i = 0; i < 8; i++)
        {
        boolean color = false;
            for (int j = 0; j < colores.length; j++)
            {
                if (palabras[i] == colores[j])
                    color = true;
            }
        if (color = true)
        {
            arrayFinal[contacolor] = palabras[i];
            contacolor++;
        }
        else
        {
            noColores[contaNoColor] = palabras[i];
            contaNoColor++;
        }
        }
        System.out.println();
        for (int i = 0; i < 8; i++)
        {
            if (i > contacolor+1) {
                arrayFinal[i] = noColores[contaNoColor];
                contaNoColor--;
            }
            System.out.println("Posicion "+i+" = "+arrayFinal[i]);
        }
    }
}
