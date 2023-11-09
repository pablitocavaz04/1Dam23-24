/* ******************************************************************************* */
/*   File:Ejercicio25.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/11/09 10:44                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/11/09 10:58												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo6;

public class Ejercicio25
{
    public static boolean esPrimo(int x)
    {
        boolean Primo = true;
        for (int i = 2; i <= x/2; i++)
        {
            if (x%i == 0)
                Primo = false;
        }
        return Primo;
    }
    public static void main(String[] args)
    {

        for (int i = 1; i <= 100; i++)
        {
            int numero = (int)(Math.random()*191)+10;
            if (esPrimo(numero))
                System.out.print("#"+numero+"# ");
            else if (numero%5 == 0)
                System.out.print("["+numero+"] ");
            else
                System.out.print(numero+" ");
        }
    }
}
