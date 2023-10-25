/* ******************************************************************************* */
/*   File:Ejercicio36.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/10/25 12:18                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/10/25 12:43												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo5;

import java.util.Scanner;

public class Ejercicio36 
{
    public static long voltear(long num)
    {
        long aux = 0;
        while(num > 0)
        {
            aux =(aux*10)+(num%10);
            num /= 10;
        }
        return aux;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un numero: ");
        long numero = Long.parseLong(sc.nextLine());
        if(voltear(numero) == numero)
            System.out.println("El "+numero+" es capicua");
        else
            System.out.println("El "+numero+" no es capicua");

    }
}
