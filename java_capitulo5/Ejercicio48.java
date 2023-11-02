
/* ******************************************************************************* */
/*   File:Ejercicio48.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/10/30 10:48                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/10/30 10:49												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo5;

import java.util.Scanner;

public class Ejercicio48 {
   public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca un número entero: ");
    long numero = Long.parseLong(s.nextLine());

    long aux;
    boolean encontrado;

    System.out.print("Dígitos que aparecen en el número: ");
    
    for (int i = 0; i < 10; i++) {
      // Comprueba si i está en el número
      encontrado = false;
      aux = numero;
      while (aux > 0) {
        if (aux % 10 == i) {
          encontrado = true;
        }
        aux /= 10;
      }
      if (encontrado) {
        System.out.print(i + " ");
      }
    }
      
    System.out.print("\nDígitos que no aparecen: ");
    
    for (int i = 0; i < 10; i++) {
      // Comprueba si i está en el número
      encontrado = false;
      aux = numero;
      while (aux > 0) {
        if (aux % 10 == i) {
          encontrado = true;
        }
        aux /= 10;
      }
      if (!encontrado) {
        System.out.print(i + " ");
      }
    }
  }
}