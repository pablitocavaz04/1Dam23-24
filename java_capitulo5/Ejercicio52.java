/* ******************************************************************************* */
/*   File:Ejercicio50.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/10/31 00:22                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/10/31 00:25												       */
/*                                                                                 */
/* ******************************************************************************* */

package java_capitulo5;

import java.util.Scanner;

public class Ejercicio52 {
     public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca un número: ");
    long numeroIntroducido = Long.parseLong(s.nextLine());
    
    long copia = numeroIntroducido;
    int longitud = 0;
    
    while (copia > 0) {
      copia /= 10;
      longitud++;
    }
    
    int primero =  (int)(numeroIntroducido / Math.pow(10, longitud - 1));
    long aux = (long)(primero * Math.pow(10, longitud - 1));
    long resultado = (numeroIntroducido - aux) * 10 + primero;
    System.out.println("El número resultado es " + resultado + ".");
  }
}
