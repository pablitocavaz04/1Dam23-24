/* ******************************************************************************* */
/*   File:Ejercicio27.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/10/24 13:19                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/10/24 13:10												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo5;

import java.util.Scanner;

public class Ejercicio27 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero : ");
        int numero = Integer.parseInt(sc.nextLine());
        int contador = 0;
        int suma = 0;
        System.out.println("Los numeros multuiplos de 3 son: ");
        for (int i = 1; i <= numero; i++) 
        {
            if (i%3==0) 
            {
                suma+=i;
                contador++;
                System.out.print(i+" ");
            }
        }
        System.out.println(" ");
        System.out.println("Hay un total de "+contador+" multiplos de 3");
        System.out.println("La suma total de estos multiplos de 3 es de : "+suma);
    }
}



/**
 * 5. Bucles
 * 
 * 27. Escribe un programa que muestre, cuente y sume los  múltiplos de 3 que hay entre 1 y un
 *     número leído por teclado.
 * 
 * @author Luis José Sánchez
 */