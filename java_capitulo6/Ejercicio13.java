/* ******************************************************************************* */
/*   File:Ejercicio13.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/11/08 10:58                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/11/08 11:04												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo6;

public class Ejercicio13 
{
    public static void main(String[] args)
    {
        int dado1 = 0;
        int dado2 = 0;
        int  i = 0;
        do {
            i++;
            dado1 = (int)(Math.random()*6)+1;
            dado2 = (int)(Math.random()*6)+1;
            if (dado1 != dado2)
            System.out.printf("Tirada %d Dado1 : %d  Dado2 : %d\n",i,dado1,dado2);
        } while (dado1 != dado2);
        System.out.println();
        System.out.printf("Ha coincidio en la tirada %d, Dado1 : %d  Dado2 : %d",i,dado1,dado2);
    }
}
