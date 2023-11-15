/* ******************************************************************************* */
/*   File:Ejercicio32.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/11/15 10:44                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/11/15 11:07												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo6;

import java.util.Scanner;

public class Ejercicio32
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la longitud del sendero en metros : ");
        int longitud = Integer.parseInt(sc.nextLine());
        System.out.println();
        int espacios = 6;
        for (int i = 1; i <= longitud; i++)
        {
            for (int j = 1; j <= espacios; j++)
                System.out.print(" ");
            String obs = "";
                    int obstaculo = (int)(Math.random()*2)+1;
                    switch (obstaculo)
                    {
                        case 1:
                            int tipoObs = (int)(Math.random()*2)+1;
                            switch (tipoObs)
                            {
                                case 1:
                                    obs = "O";
                                    break;
                            
                                case 2:
                                    obs = "*";
                                    break;
                            }
                            break;
                        case 2:
                            obs = " ";
                            break;
                    }
                    int posicion = (int)(Math.random()*4)+2;
            for (int j = 1; j <= 6; j++)
            {
                if (j == 1 || j == 6)
                    System.out.print("|");
                else if (j == posicion)
                    System.out.print(obs);
                else
                    System.out.print(" ");
               
            }
        System.out.println();
        int desplazamiento = (int)(Math.random()*3)+1;
        switch (desplazamiento) {
            case 1:
                espacios++;
                break;
            case 2:
                espacios = espacios;
                break;
            case 3:
                espacios--;
                break;
        }
        }
    }
}
