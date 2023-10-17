/* ******************************************************************************* */
/*   File:Ejercicio09.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/10/17 14:52                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/10/17 15:20												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo5;

import java.util.Scanner;

public class Ejercicio09 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un numero : ");
        long numeroIntroducido= Long.parseLong(sc.nextLine());
        int i;
        i = 0;
        long aux;
        aux = numeroIntroducido;
        do 
        {
           aux = aux/10;
           i++;
        } while (aux > 0);
        System.out.println("El numero introducido "+numeroIntroducido+" tiene "+i+" dígitos.");
    }
}
