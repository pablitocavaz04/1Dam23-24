/* ******************************************************************************* */
/*   File:Ejercicio16.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/11/23 09:28                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/11/23 09:28												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo7.Array_Unidimensionales;

public class Ejercicio16 {
    public static void main(String[] args) {
        
    int[] n = new int[20];

    for (int i = 0; i < 20; i++) {
      n[i] = (int)(Math.random() * 381) + 20;
      System.out.print(n[i] + " ");
    }
    
    System.out.print("\n¿Qué números quiere resaltar? ");
    System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
    int opcion = Integer.parseInt(System.console().readLine());

    int multiplo = (opcion == 1) ? 5 : 7;

    // Muestra el resultado.
    for (int elemento : n) {
      if (elemento % multiplo == 0) {
        System.out.print("[" + elemento + "] ");
      } else {
        System.out.print(elemento + " ");
      }
    }
    }
}
