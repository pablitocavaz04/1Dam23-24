/* ******************************************************************************* */
/*   File:Ejercicio12.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/11/08 10:37                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/11/08 10:57												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo6;

public class Ejercicio12
{
    public static void main(String[] args) throws InterruptedException {
        int linea = 0;
        
        System.out.print("\033[32m"); // pinta en verde
        
        for(int i = 0; i < 8000; i++) {
          int ascii = (int)(Math.random()*95)+32;
            System.out.print((char)ascii);
          
          if (linea++ == 60) {
            linea = 0;
            Thread.sleep(50);
            System.out.println();
          }
        }
      }
}


