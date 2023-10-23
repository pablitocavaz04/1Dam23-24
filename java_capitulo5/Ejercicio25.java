/* ******************************************************************************* */
/*   File:Ejercicio25.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/10/23 12:48                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/10/23 13:06												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo5;

import java.util.Scanner;

public class Ejercicio25 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un numero: ");
        int numero =Integer.parseInt(sc.nextLine());
        int aux = 0;
        int aux2 = 0;
        while (numero > 0) {
            aux2 = (aux2*10)+(numero%10);
            numero/=10;

        }
        System.out.println("El numero dado la vuelta es = "+aux2);
    }
}
