/* ******************************************************************************* */
/*   File:Ejercicio27.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/11/09 11:05                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/11/14 12:22												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo6;

import java.util.Scanner;

public class Ejercicio27
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Turno del jugador (introduzca piedra, papel o tijera): ");
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
        else if(jugador == "piedra" && ordenador == "tijera")
            System.out.println("Gana el jugador");
        else if (jugador == "tijera" && ordenador == "piedra")
            System.out.println("Gana el ordenador");
        else if (jugador == "papel" && ordenador == "piedra")
            System.out.println("Gana el jugador");
        else if (jugador == "piedra" && ordenador == "papel")
            System.out.println("Gana el ordenador");
        else if (jugador == "tijera" && ordenador == "papel")
            System.out.println("Gana el jugador");
        else if (jugador == "papel" && ordenador == "tijera")
            System.out.println("Gana el ordenador");
    }
}
