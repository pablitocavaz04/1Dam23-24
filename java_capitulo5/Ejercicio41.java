/* ******************************************************************************* */
/*   File:Ejercicio41.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/10/30 09:20                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/10/30 09:27												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo5;

import java.util.Scanner;

public class Ejercicio41 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, introduzca un numero entero positivo: ");
        long numero = Long.parseLong(sc.nextLine());
        int numPrue = 0;
        int pares = 0;
        int impares = 0;
        System.out.print("El "+numero);
        while (numero > 0 ) {
            numPrue = (int)numero%10;
            if (numPrue == 0 || numPrue%2 == 0)
            pares++;
            else
            impares++;
        numero /=10;
        }
        System.out.print(" contiene "+pares+" digitos pares y "+impares+" digitos impares.");
    }
}
