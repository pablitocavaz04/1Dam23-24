/* ******************************************************************************* */
/*   File:Ejercicio28.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/11/14 12:25                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/11/14 12:25												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo6;

public class Ejercicio28
{
    
    public static void main(String[] args) {
        int altura = (int)(Math.random() * 6) * 2 + 3;
        
        System.out.println("*    *   ****   *        ****");
        
        for (int i = 1; i < altura / 2; i++) {
          System.out.println("*    *  *    *  *       *    *");
        }
        
        System.out.println("******  *    *  *       ******");
        
        for (int i = 1; i < altura / 2; i++) {
          System.out.println("*    *  *    *  *       *    *");
        }
        
        System.out.println("*    *   ****   ******  *    *");
      }
  
}
