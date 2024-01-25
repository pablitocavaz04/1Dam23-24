/* ******************************************************************************* */
/*   File:Ejercicio03.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2024/01/25 08:48                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2024/01/25 08:48												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo10.Ejercicio03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio03
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> N = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++)
        {
           System.out.print("Introduze el numero "+(i+1)+" : "); 
           N.add(Integer.parseInt(sc.nextLine()));
        }

        System.out.println("Lista original: " + N);

    //Ordena el array de menor a mayor
    Collections.sort(N);

    System.out.println("Lista ordenada de menor a mayor: " + N);

    
      ArrayList<Integer> b = new ArrayList<Integer>();

      for(int i : N) {
        b.add(0, i);
      }
        
      System.out.print("Lista ordenada de mayor a menor: " + b);
    
    }
}
