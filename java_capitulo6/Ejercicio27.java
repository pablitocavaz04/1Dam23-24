/* ******************************************************************************* */
/*   File:Ejercicio27.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/11/09 11:05                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/11/09 11:05												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo6;

import java.util.Scanner;

public class Ejercicio27
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Turno del jugador (introduzca piedra, papel o tijera): ");
        String jugador = sc.nextLine();
        String ordenador = "";
        switch ((int)(Math.random()*3)+1)
        {
            case 1:
                ordenador = "piedra";
                break;
            case 2:
                ordenador = "papel";
                break;
            case 3:
                ordenador = "tijera";
                break;
            default:
                break;
        }
        System.out.println("Turno del ordenador : "+ordenador);
        if (jugador == ordenador)
            System.out.println("empate");
        else if(jugador = 'piedra' && )
    }
}
