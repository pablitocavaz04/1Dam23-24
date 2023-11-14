/* ******************************************************************************* */
/*   File:Ejercicio30.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/11/14 12:29                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/11/14 12:29												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo6;

import java.util.Scanner;

public class Ejercicio30
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int altura = 0;
        int anchura = 0;
        do
        {
            System.out.print("Por favor introduzca la altura de la pecerea (como mínimo 4): ");
            altura = Integer.parseInt(sc.nextLine());
            System.out.print("Ahora introduzca la anchura (como mínimo 4): ");
            anchura = Integer.parseInt(sc.nextLine());
             if (altura < 4 || anchura < 4)
                System.out.println("Por favor revisa que has introducido bien los datos. <3");
        } while (altura < 4 || anchura< 4);
        
        int posicion = 0;
        int pez;
        int caballito;
        int caracola;

        do
        {
            pez = (int)(Math.random()*(altura-2)*(anchura-2));
            caballito = (int)(Math.random()*(altura-2)*(anchura-2));
            caracola = (int)(Math.random()*(altura-2)*(anchura-2));
        } while (
            pez == caballito || pez == caracola || caballito == caracola
        );
        System.out.println();

        for ( int i= 1; i <= anchura; i++)
            System.out.print("* ");
        System.out.println();
        for (int i = 2; i < altura; i++)
        {
            System.out.print("* ");
            for (int j = 2; j < anchura; j++)
            {
                if (posicion == pez)
                    System.out.print("& ");
                else if (posicion == caracola)
                    System.out.print("@ ");
                else if (posicion == caballito)
                    System.out.print("$ ");
                else
                    System.out.print("  ");
                posicion++;
            }    
            System.out.println("* ");
        }
        for (int i = 1; i <= anchura; i++)
            System.out.print("* ");
        System.out.println();
    }    
}
