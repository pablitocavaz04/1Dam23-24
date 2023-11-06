/* ******************************************************************************* */
/*   File:Ejercicio39.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/10/29 20:35                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/10/29 20:41  											       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo5;
import java.util.Scanner;
public class Ejercicio39
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un numero entero positivo: ");
        int numero = Integer.parseInt(sc.nextLine());
        System.out.println(" ");
        int suma;
        for (int i = 1; i <= numero; i++) {
            suma = 1;
            for (int j = 1; j <= i; j++)
                suma *=j;
            System.out.print(i+"! = "+suma);
            System.out.println();
        }
    }
}
