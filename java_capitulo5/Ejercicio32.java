/* ******************************************************************************* */
/*   File:Ejercicio32.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/10/25 10:42                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/10/25 10:54												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo5;

import java.util.Scanner;

public class Ejercicio32 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Porfavor, introduzca un numero entero positivo: ");
        Long numero = Long.parseLong(sc.nextLine());
        long aux = 0;
        long suma = 0;
        
        while (numero > 0) 
        {
            aux = (aux * 10) + numero%10;
            numero /= 10;
        }
        System.out.print("Dígitos pares: ");
        while (aux > 0) 
        {
            if ((aux%10)%2 == 0) 
            {
                System.out.print(aux%10+" ");
                suma+=(aux%10);
            }
            aux/=10;
        }
        System.out.println(" ");
        System.out.println("Suma de los dígitos pares: "+suma);
    }
}
