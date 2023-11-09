/* ******************************************************************************* */
/*   File:Ejercicio24.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/11/09 10:34                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/11/09 10:43												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo6;

import java.util.Scanner;

public class Ejercicio24
{
    public static void main(String[] args) {

        System.out.print("Por favor, introduzca un número entero positivo: ");
        long numeroIntroducido = Long.parseLong(System.console().readLine());
    
        long numero = numeroIntroducido;
    
        // calcula la longitud del número
        int longitud = 0;
        
        do {
          numero /= 10;
          longitud++;
        } while (numero > 0);
    
        // elige una posición al azar dentro del número
        int posicion = (int)(Math.random() * longitud) + 1;
    
        // extrae el dígito de esa posición
        System.out.println((numeroIntroducido / (long)(Math.pow(10, longitud - posicion))) % 10);
      }
}
