/* ******************************************************************************* */
/*   File:Ejercicio04.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2024/01/25 09:10                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2024/01/25 10:37												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo10.Ejercicio04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio04
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> a = new ArrayList<String>();
        //Insertamos valores en el array
        for (int i = 0; i < 10; i++)
        {
            System.out.print("Introduze la palabra "+(i+1)+" : ");
            a.add(sc.nextLine());
        }

        System.out.println("Array original: "+ a);
        Collections.sort(a);
        System.out.println("Array ordenado de menor a mayor : "+ a);

        ArrayList<String> b = new ArrayList<String>();
        for(String i: a)
        {
            b.add(i);
        }
        System.out.println("Array ordenado de mayor a menor: "+ b);
    }
}
