/* ******************************************************************************* */
/*   File:Ejercicio13.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/10/09 10:56                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/10/09 11:05												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo4;

import java.util.Scanner;

public class Ejercicio13 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca tres numeros enteros: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        if(n1>n2 && n2>n3)
        System.out.printf("El primer numero es %d el segundo numero es %d y el tercero %d",n1,n2,n3);
        else if(n1>n3 && n3>n2)
        System.out.printf("El primer numero es %d el segundo numero es %d y el tercero %d",n1,n3,n2);
        else if(n2>n1 &&n1>n3)
        System.out.printf("El primer numero es %d el segundo numero es %d y el tercero %d",n2,n1,n3);
        else if(n2>n3 && n3>n1)
        System.out.printf("El primer numero es %d el segundo numero es %d y el tercero %d",n2,n3,n1);
        else if(n3>n2 && n2>n1)
        System.out.printf("El primer numero es %d el segundo numero es %d y el tercero %d",n3,n2,n1);
        else if(n3>n1 && n1>n2)
        System.out.printf("El primer numero es %d el segundo numero es %d y el tercero %d",n3,n1,n2);
    }
}
