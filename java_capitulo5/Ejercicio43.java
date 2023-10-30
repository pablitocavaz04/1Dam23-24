/* ******************************************************************************* */
/*   File:Ejercicio43.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/10/30 09:56                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/10/30 10:09												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo5;

import java.util.Scanner;

public class Ejercicio43 
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
        System.out.print("Por favor, introduzca un numero entero positivo: ");
        long numero = Long.parseLong(sc.nextLine());
        System.out.print("Introduzca la posicion a partir de la cual quieres partir el numero: ");
        int particion = Integer.parseInt(sc.nextLine());
        numero = voltearNumero(numero);
        int num1 = 0;
        int num2 = 0;
        int contador = 0;
        while (numero > 0) 
        {
            contador++;
            if (contador < particion)
                num1 = (num1*10)+(int)numero%10;
            else
                num2 = (num2*10)+(int)numero%10;
            numero /= 10;
        }
        System.out.println("Los numeros partidos son el "+num1+ " y el "+num2);
    }
}
