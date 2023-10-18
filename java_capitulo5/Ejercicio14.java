/* ******************************************************************************* */
/*   File:Ejercicio14.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/10/18 10:57                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/10/18 11:07												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo5;

import java.util.Scanner;

public class Ejercicio14 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca una base: ");
        int base = Integer.parseInt(sc.nextLine());
        System.out.print("Introduzca una exponente: ");
        int exponente = Integer.parseInt(sc.nextLine());
        int aux;
        aux = 1;
        if (exponente == 0)
            System.out.println("La potecia es = 1");
        if (exponente < 0)
            System.out.println("La potencia es = 0");
        if (exponente > 0) {
            for (int i = 1; i <= exponente; i++) {
                aux = base*aux;

            }
            System.out.println("La potencia de "+base+" elevado a "+exponente+ " = "+aux);
        }
        
    

    }
}
