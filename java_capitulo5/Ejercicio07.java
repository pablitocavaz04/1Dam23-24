/* ******************************************************************************* */
/*   File:Ejercicio07.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/10/17 13:27                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/10/17 14:45												       */
/*                                                                                 */
/* ******************************************************************************* */

package java_capitulo5;

import java.util.Scanner;

public class Ejercicio07 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int intentos;
        int i;
        i = 1;
        boolean acertados = false;
        do 
        {
            System.out.print("Introduzca un PIN de 4 numeros: ");
            intentos=sc.nextInt();
            if (intentos == 1234)
                acertados=true;
            else
            System.out.println("Lo siento esa no es la combinación , le quedan "+(4-i)+" intentos.");
            i++;
        } while (i <=4 && !acertados);
        if (acertados)
            System.out.println("La caja fuerte se ha abierto satisfactoriamente");  
        else
        System.out.println("Has gastado los 4 intentos.");
    }
}
