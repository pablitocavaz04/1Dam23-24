/* ******************************************************************************* */
/*   File:Ejercicio02.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/11/06 09:53                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/11/06 09:53												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo6;

public class Ejercicio02
{
    public static void main(String[] args)
    {
    
        String palo = "";
        String carta = "";
        
        int numeroPalo = (int)(Math.random()*4) + 1;
        
        switch(numeroPalo) {
          case 1:
            palo = "picas";
            break;
          case 2:
            palo = "corazones";
            break;
          case 3:
            palo = "diamantes";
            break;
          case 4:
            palo = "tréboles";
          default:
        }
    
        int numeroCarta = (int)(Math.random()*13) + 1;
        
        switch(numeroCarta) {
          case 1:
            carta = "As";
          case 11:
            carta = "J";
          case 12:
            carta = "Q";
          case 13:
            carta = "K";
          default:
            carta = String.valueOf(numeroCarta);
        }
        
        System.out.println(carta + " de " + palo);
    }
        
}

