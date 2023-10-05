/* ******************************************************************************* */
/*   File:Ejercicio06                                                              */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/10/05 09:43 by pcamvaz        |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/10/05 09:47 by pcamvaz                                          */
/*                                                                                 */
/* ******************************************************************************* */


package java_capitulo2;

public class Ejercicio06
{
    public static void main(String[] args)
    {
        double baseImponible = 1724.75;

        System.out.printf("Base imponible %8.2f\n", baseImponible);
        System.out.printf("IVA            %8.2f\n", (baseImponible * 0.21));
        System.out.printf("-----------------------\n");
        System.out.printf("Total          %8.2f\n", (baseImponible * 1.21));
    }
}
