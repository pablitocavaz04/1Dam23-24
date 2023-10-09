/* ******************************************************************************* */
/*   File:Ejercicio14.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/10/09 11:06                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/10/09 11:12												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo4;

import java.util.Scanner;

public class Ejercicio14 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un numero: ");
        int numero = sc.nextInt(); 
        if(numero%2 == 0)
        {
            if(numero%5 == 0)
            System.out.printf("El numero %d es par y divisible de 5",numero);
            else
            System.out.printf("El numero %d es par y no divisible de 5",numero);

        }else if(numero%2 !=0)
            System.out.printf("El numero %d no es par y si es divisible de 5",numero);
        else
        System.out.printf("El numero %d no es par ni divisible de 5",numero);

    }
}
