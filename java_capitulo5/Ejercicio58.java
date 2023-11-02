/* ******************************************************************************* */
/*   File:Ejercicio58.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/11/02 08:51                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/11/02 08:55												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo5;

import java.util.Scanner;

public class Ejercicio58
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un numero: ");
        int numero = Integer.parseInt(sc.nextLine());
        int i = 0;
        int suma = 0;
        while (numero > 0)
        {
         suma += numero%10;
         i++;
         numero /= 10;   
        }
        System.out.println("La media de sus digitos es : "+(float)suma/i);
    }
}
