/* ******************************************************************************* */
/*   File:Ejercicio10.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/11/06 10:57                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/11/06 11:10												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo6;

public class Ejercicio10
{
    public static void main(String[] args)
    {
        int caracter;
        int longitud;;
        for (int i = 1; i <= 10; i++) {
            longitud = (int)(Math.random()*40)+1;
            for (int j = 1; j <=longitud ; j++)
            {
                caracter = (int)(Math.random()*6)+1;
                switch (caracter)
                {
                    case 1:
                        System.out.print("*");
                    case 2:
                        System.out.print("-");
                    case 3:
                        System.out.print("=");
                    case 4:
                        System.out.print(".");
                    case 5:
                        System.out.print("|");
                    case 6:
                        System.out.print("@");
                }
            }
        System.out.println();
        }
    }
}
