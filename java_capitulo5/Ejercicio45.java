/* ******************************************************************************* */
/*   File:Ejercicio45.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/10/30 10:21                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/10/30 10:23												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo5;

import java.util.Scanner;

public class Ejercicio45 
{
    public static long voltearNumero(long num)
    {
        long aux = 0;
        while (num > 0) 
        {
            aux = (aux*10)+num%10;
            num /= 10;
        }
        return aux;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, introduzca un número entero positivo: ");
        long numero = Long.parseLong(sc.nextLine());
        System.out.print("Introduzca la posicion dentro del numero : ");
        int particion = Integer.parseInt(sc.nextLine());
        System.out.print("Introduzca el nuevo numero : ");
        int digito = Integer.parseInt(sc.nextLine());
        numero = voltearNumero(numero);
        int contador = 0;
        long aux = 0;
        while (numero > 0) 
        {
         contador ++;
            if (contador == particion)
                aux = (aux*10)+digito;
            else
                aux = (aux*10)+numero%10;
        numero /= 10;
        }
        System.out.println("El número resultante es "+aux);
    }
}
