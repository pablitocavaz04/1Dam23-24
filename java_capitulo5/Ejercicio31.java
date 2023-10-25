/* ******************************************************************************* */
/*   File:Ejercicio31.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/10/25 10:34                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/10/25 10:41												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo5;

import java.util.Scanner;

public class Ejercicio31 {

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la altura de la L: ");
        int altura = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= altura; i++) 
        {
            if (i != altura)
                System.out.println("*");
            else
            {
                for (int j = 1; j <= altura/2+1; j++) 
    
                    System.out.print("*");
            System.out.println(" ");
            }
        }
    }
}



/*
 * El palo horizontal de la L es de la mitad altura entre 2, una division entera.
 */