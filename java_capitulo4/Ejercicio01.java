/* ******************************************************************************* */
/*   File:Ejercicio01.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/10/09 09:48                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/10/09 09:48												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo4;

import java.util.Scanner;

public class Ejercicio01 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduca en dia de la semana: ");
        String dia = sc.nextLine(); 
        switch (dia) {
            case "lunes":
                System.out.println("prog");
                break;
        
            case "miercoles":
                System.out.println("prog");
                break;
            case "jueves":
                System.out.println("prog");
                break;
            default:
                break;
        }
    }
}
