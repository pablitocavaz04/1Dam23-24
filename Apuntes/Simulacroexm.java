/* ******************************************************************************* */
/*   File:Simulacroexm.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/11/23 10:00                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/11/23 10:28												       */
/*                                                                                 */
/* ******************************************************************************* */
package Apuntes;

import java.util.Scanner;

public class Simulacroexm
{
    public static void pintarCarta(int x, int y)
    {
        
        for (int i = 1; i <= 7; i++)
        {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i== 7)
                    System.out.print("* ");
                else if (j == 1 || j == 5)
                    System.out.print("* ");
                else if (i == 4 && j==3)
                {
                    switch (x)
                    {
                        case 1:
                            System.out.print("1");
                            break;
                        case 2:
                            System.out.print("2");

                            break;
                        case 3:
                            System.out.print("3");
                            break;
                        case 4:
                            System.out.print("4");
                            break;
                        case 5:
                            System.out.print("5");
                            break;
                        case 6: 
                            System.out.print("6");
                            break;
                        case 7:
                            System.out.print("7");
                            break;
                        case 8:
                            System.out.print("J");
                            break;
                        case 9:
                            System.out.print("Q");
                            break;
                        case 10:
                            System.out.print("K");
                            break;
                    }
                }
                else if (i == 4 && j==4)
                {
                    switch (y) {
                        case 1:
                            System.out.print("🪙  ");
                            break;
                        case 2:
                            System.out.print("🏆  ");
                            break;
                        case 3:
                            System.out.print("⚔️  ");
                            break;
                        case 4:
                            System.out.print("🏏  ");
                            break;
                    
                        default:
                            break;
                    }
                }
                else
                    System.out.print("  ");

            }
        System.out.println();
        }
    }


    public static void main(String[] args)throws InterruptedException 
    {
        Scanner sc = new Scanner(System.in);
        float sumaJugador = 0;
        float sumaOrdenador = 0;
        int plantar = 0;
        boolean continuar = false;
        do
        {
            
            
            int x = (int)(Math.random()*10)+1;
            int y = (int)(Math.random()*4)+1;
            pintarCarta(x, y);
            if (x >= 1 && x <=7 )
                sumaJugador+=1;
            else if (x>=8 && x<=10)
                sumaJugador+=0.5;
            System.out.println("Tu suma es de "+sumaJugador);
            System.out.print("Te quieres plantar (1 Si, 2 No): ");
            plantar = Integer.parseInt(sc.nextLine());
            if (plantar == 2)
            continuar = false;
            else if (plantar == 1)
                continuar = true;

        } while (continuar == false && sumaJugador < 7.5);
        if (sumaJugador > 7.5) {
            System.out.println("Has perdidio te has  pasado.");
        }
        do
        {
            
            
            int x = (int)(Math.random()*10)+1;
            int y = (int)(Math.random()*4)+1;
            pintarCarta(x, y);
            if (x >= 1 && x <=7 )
                sumaOrdenador+=1;
            else if (x>=8 && x<=10)
                sumaOrdenador+=0.5;
            System.out.println("La suma del ordenador es de "+sumaOrdenador);
            Thread.sleep(1000);

        } while (sumaOrdenador < 7.5);
        if (sumaOrdenador == 7.5 && sumaJugador != 7.5)
            System.out.println("Te ha ganado el ordenador");
        else if (sumaJugador == 7.5 && sumaOrdenador == 7.5)
            System.out.println("Has empatado con el ordenador");
        else
            System.out.println("Has ganado");
    }
}
