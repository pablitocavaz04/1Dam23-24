/* ******************************************************************************* */
/*   File:Ejercicio26.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/10/24 13:01                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/10/24 13:10												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo5;

import java.util.Scanner;

public class Ejercicio26
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un numero: ");
        int numero = Integer.parseInt(sc.nextLine());
        System.out.print("Introduzca el digito que quieres encontrar: ");
        int digito = Integer.parseInt(sc.nextLine());
        int i = 1;
        while (numero > 0)
        {
            if (numero%10 == digito)
                System.out.println("El digito se encuentra en la posicion "+i);
            numero /=10;
            i++;
        }
    }
}
