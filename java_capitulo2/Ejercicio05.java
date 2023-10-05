/* ******************************************************************************* */
/*   File:Ejercicio05                                                              */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/10/05 09:39 by pcamvaz        |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/10/05 09:41 by pcamvaz                                          */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo2;

import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la cantidad de pesetas que quieres convertir a euos: ");
        int cantidad = sc.nextInt();
        System.out.println("La cantidad de pesetas son : "+(cantidad/166)+" €");
        
    }
}
