/* ******************************************************************************* */
/*   File:Ejercicio23.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/11/09 10:26                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/11/09 10:33												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo6;

public class Ejercicio23
{
    public static void main(String[] args)
    {
        String dado = "";
        for (int i = 1; i <= 5; i++)
        {
            switch ((int)(Math.random()*6))
            {
                case 0:
                    dado = "As";
                    break;
                case 1:
                    dado = "K";
                    break;
                case 2:
                    dado = "Q";
                    break;
                case 3:
                    dado = "J";
                    break;
                case 4:
                    dado = "7";
                    break;
                case 5:
                    dado = "8";
                    break;
                default:
            }
            System.out.print(dado+" ");
        }
        System.out.println();
    }
}
