/* ******************************************************************************* */
/*   File:Ejercicio04                                                              */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/10/05 09:15 by pcamvaz        |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/10/05 09:22 by pcamvaz                                          */
/*                                                                                 */
/* ******************************************************************************* */

package java_capitulo2;

import java.util.Scanner;

public class Ejercicio04
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la cantidad de Euros que quieres convertir a pesetas: ");
        int cantidad = sc.nextInt();
        System.out.println("La cantidad de pesetas son : "+(cantidad*166));
        
    }
}
