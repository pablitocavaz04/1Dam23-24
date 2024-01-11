/* ******************************************************************************* */
/*   File:Ejercicio3.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2024/01/11 09:45                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2024/01/11 10:17												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo9.Ejercicio3;

public class Ejercicio3
{
    public static void main(String[] args)
    {
        Pinguino penguin = new Pinguino("macho","felipe");
        Canario miniCanario = new Canario("macho", "conan", 3);
        Perro perrete = new Perro("hembra", "noah", 7, "Rotwailler");
        Lagarto lagartete = new Lagarto("hembra", "puerca");

        penguin.deslizar();
        penguin.duerme();
        System.out.println();

        miniCanario.volar();
        miniCanario.caer();
        System.out.println();

        perrete.mostrarEdad();
        perrete.duerme();
        System.out.println();

        lagartete.mudarPiel();
        lagartete.come();
        lagartete.duerme();
    }
}
