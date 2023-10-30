/* ******************************************************************************* */
/*   File:Ejercicio44.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/10/30 10:10                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/10/30 10:20												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo5;

import java.util.Scanner;

public class Ejercicio44 
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
        System.out.print("Introduzca la posicion donde quieres insertar : ");
        int particion = Integer.parseInt(sc.nextLine());
        System.out.print("Introduzca el dígito que quieres insertar : ");
        int digito = Integer.parseInt(sc.nextLine());
        numero = voltearNumero(numero);
        int contador = 0;
        long aux = 0;
        while (numero > 0) 
        {
         contador ++;
            aux = (aux*10)+numero%10;
            if (contador == particion-1)
                aux = (aux*10)+digito;
        numero /= 10;
        }
        System.out.println("El número resultante es "+aux);
    }
}
