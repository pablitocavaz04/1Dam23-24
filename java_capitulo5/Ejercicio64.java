/* ******************************************************************************* */
/*   File:Ejercicio64.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/11/02 10:17                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/11/02 10:51												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo5;

import java.util.Scanner;

public class Ejercicio64
{
    public static void pintarRectangulo(int x, int y)
    {
        for (int i = 1; i <= x; i++)
        {
            for (int j = 1; j <= y; j++)
            {
                if (i == 1 || i == x)
                    System.out.print("*");
                else
                {
                    if (j == 1 || j == y)
                        System.out.print("*");
                    else 
                        System.out.print(" ");
                }
                    
            }
        System.out.println(" ");           
        }
    }

    
    public static int pintarMenu()
    {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        System.out.println("1. Agrandarlo");
        System.out.println("2. Achicarlo");
        System.out.println("3. Cambiar la orientacion");
        System.out.println("4. Salir");
        System.out.print("Indique qué quiere hacer con el rectangulo: ");
        opcion = Integer.parseInt(sc.nextLine());
        return opcion;

    }
    public static void main(String[] args)
    {
       int opcion = 0;
       int x = 3;
       int y = 6;
       do
       {
        pintarRectangulo(x, y);
        opcion=pintarMenu();
        switch (opcion)
        {
            case 1:
                x++;
                y++;
                break;
            case 2:
                x--;
                y--;
                break;
            case 3:
                int aux = x;
                x = y;
                y = aux;
                break;
            default:
        }
        System.out.println();
       } while (opcion != 4);
        
    }
}
