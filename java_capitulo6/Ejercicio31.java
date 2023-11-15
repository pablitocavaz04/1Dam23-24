/* ******************************************************************************* */
/*   File:Ejercicio31.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/11/14 12:54                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/11/15 10:41												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo6;

import java.util.Scanner;

public class Ejercicio31
{

    public static void pressAnyKeyToContinue()
    {
        String seguir;
        Scanner sc = new Scanner(System.in);
        System.out.println("Press Enter key to continue...");
        try
        {
            seguir = sc.nextLine();
        }
        catch(Exception e)
        {}
    }
    public static void pintarDado(int x)
    {
        for (int i = 1; i <= 3; i++)
        {
            for (int j = 1; j <= 3; j++)
            {
                if (i == 1 || i == 3)
                    System.out.print("* ");
                else
                {
                    if (j == 1 || j == 3)
                        System.out.print("* ");
                    else
                        System.out.print(x+" ");                    
                }
            }
        System.out.println();    
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
            System.out.print("Introduzca la cantidad de dinero que quiere apostar: ");
            int cantidad = Integer.parseInt(sc.nextLine());
            int dado1 = (int)(Math.random()*6)+1;
            int dado2 = (int)(Math.random()*6)+1;
            pintarDado(dado2);
            System.out.println();
            pintarDado(dado1);
            int suma = dado1+dado2;
            if (suma == 7 || suma == 11)
                System.out.println("Enhorabuena has ganado el doble de lo apostado, la suma de tus dados es : "+suma);
            else if (suma == 2 || suma == 3 || suma == 12)
                System.out.println("Lo siento has perdidio todo tu dinero, vicioso,ludopata,cabron. La suma de tus dados es : "+suma);
            else
            {
                int suma2 = 0;
                do
                {
                    pressAnyKeyToContinue();
                    System.out.println("Tira de nnuevo la suma de tus dados ha sido "+suma+" pulsa enter para tirar: ");
                    dado1 = (int)(Math.random()*6)+1;
                    dado2 = (int)(Math.random()*6)+1;
                    pintarDado(dado1);
                    System.out.println();
                    pintarDado(dado2);
                    suma2 = dado1+dado2;
                } while (suma2 !=7 || suma2 == suma);
                
            }
    }
}
