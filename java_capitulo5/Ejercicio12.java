/* ******************************************************************************* */
/*   File:Ejercicio12.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/10/18 10:31                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/10/18 10:50												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo5;

import java.util.Scanner;

public class Ejercicio12 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el numero para hacer la serie fibonacci: ");
        int n = Integer.parseInt(sc.nextLine());
        int n1,n2,aux;
        n1 = 0;
        n2 = 1;
        for (int i = 0; i <= n; i++) 
        {
            System.out.print(n1+" ");
            aux=n1+n2;
            n2 = n1;
            n1 = aux;
        }
    }
}
