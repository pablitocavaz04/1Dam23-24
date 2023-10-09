/* ******************************************************************************* */
/*   File:Ejercicio02.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/10/09 09:54                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/10/09 10:00												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo4;

import java.util.Scanner;

public class Ejercicio02 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca una hora del dia ;) :");
        int horas = sc.nextInt();
        if (horas >=6 && horas <=12) 
            System.out.println("BON DIA");
        else if (horas >=13 && horas<=20)
            System.out.println("Buenas tardes");
        else
        System.out.println("Buenas noches");
    }
}
