/* ******************************************************************************* */
/*   File:Ejercicio23.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/10/19 10:51                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/10/19 10:51												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo5;

import java.util.Scanner;

public class Ejercicio23 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        int i = 0;
        int numintroducido = 0;
        while(suma <= 10000)
        {
            
            System.out.print("Introduzca un numero: ");
            numintroducido = Integer.parseInt(sc.nextLine());
            suma+=numintroducido;
            i++;
            
        }
        suma -= numintroducido;
        i--;
        System.out.printf("Ha introducido un total de %d numeros, el total acumulado es de %d y la media de estos numeros es %.2f",i,suma,(float)(suma/i));
    }
}
