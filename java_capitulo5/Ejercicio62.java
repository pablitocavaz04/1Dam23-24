/* ******************************************************************************* */
/*   File:Ejercicio62.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/11/02 10:06                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/11/02 10:12												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo5;

import java.util.Scanner;

public class Ejercicio62
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un numero : ");
        int numero = Integer.parseInt(sc.nextLine());
        int buenos = 0;
        int malos = 0;
        int aux = numero;
         while (numero > 0)
         {
            if (numero%10 == 3 || numero%10 >6 && numero%10 <=9)
                buenos ++;
            else
                malos++;
            numero /=10;
         }
         if (buenos > malos)
            System.out.println("El "+aux+" es un numero afortunado.");
        else
            System.out.println("El "+aux+" no es un numero afortunado.");
    }
}
