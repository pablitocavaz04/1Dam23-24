/* ******************************************************************************* */
/*   File:Ejercicio68.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/11/06 08:21                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/11/06 08:32												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo5;

import java.util.Scanner;

public class Ejercicio68
{
    public static long voltearNum(long x)
    {
        long aux = 0;
        while (x > 0)
        {
            aux = (aux *10)+x%10;
            x /= 10;
        }
        return aux;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un numero: ");
        long numero = Long.parseLong(sc.nextLine());
        long volteado = voltearNum(numero);
        long aux = 0;
        while (volteado > 0)
        {
            if ((volteado%10)%2 == 0)
                aux = (aux*10)+(volteado%10+1);
            else
                aux = (aux*10)+(volteado%10-1); 
            volteado /=10;
        }
        System.out.println("Dislocando el "+numero+" sale el "+aux);
    }
}
