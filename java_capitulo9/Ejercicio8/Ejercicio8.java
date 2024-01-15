/* ******************************************************************************* */
/*   File:Ejercicio8.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2024/01/15 08:35                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2024/01/15 09:04												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo9.Ejercicio8;

import java_capitulo9.Ejercicio8.Terminales.Terminal;

public class Ejercicio8 {
    public static void main(String[] args) {
        Terminal t1 = new Terminal("678 11 22 33");
        Terminal t2 = new Terminal("644 74 44 69");
        Terminal t3 = new Terminal("622 32 89 09");
        Terminal t4 = new Terminal("664 73 98 18");
        System.out.println(t1);
        System.out.println(t2);
        t1.llama(t2, 320);
        t1.llama(t3, 200);
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);
    }
}
