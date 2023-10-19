/* ******************************************************************************* */
/*   File:Ejercicio21.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/10/19 10:06                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/10/19 10:30												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo5;

import java.util.Scanner;

public class Ejercicio21 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int numintroducido = 0;
           int contneg = 0;
           int mayorpar = 0;
           int sumaimpar = 0;
           int i = 0;
           while (numintroducido >= 0 ) 
           {
            System.out.print("Introduce un numero positivo o uno negativo para finalizar el programa:  ");
            numintroducido = Integer.parseInt(sc.nextLine());
            if (numintroducido >= 0) 
            {
                if (numintroducido%2 == 0) 
                {
                    if (mayorpar < numintroducido) 
                        mayorpar = numintroducido;              
                }
                else
                {
                    sumaimpar+=numintroducido;
                    contneg++;
                }
            }
            i++;
           }
           System.out.println("La cantidad de numeros que se han introducido son = "+i);
           System.out.println("El mayor numero par que se ha introducido es = "+mayorpar);
           System.out.printf("La media de los impares es = %.2f",(float)sumaimpar/contneg);
    }
}
