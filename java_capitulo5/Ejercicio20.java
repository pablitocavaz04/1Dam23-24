/* ******************************************************************************* */
/*   File:Ejercicio20.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/10/19 09:00                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/10/19 10:05												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo5;
import java.util.Scanner;
public class Ejercicio20 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la altura de la piramide :");
        int altura = Integer.parseInt(sc.nextLine());
        System.out.print("Introduzca el caracter: ");
        char caracter = sc.nextLine().charAt(0);
        

        for (int i = 1; i <= altura; i++) 
        {
            for (int j = 1; j <= altura-i; j++)
            System.out.print(" ");
            for (int j = 1; j <= i*2-1; j++) 
            {
                if (i<altura) 
                {
                    if (j==1 || j==i*2-1)
                    System.out.print(caracter);
                    else
                    System.out.print(" ");                
                }else
                System.out.print(caracter);
            }
            System.out.println(" ");
        }
    }
}


/*
Si la altura es 4 la piramide quedaria asi:
   *
  * *
 *   *
******* 
La cantidad de espacio que ponemos es, restarle a la altura la fila en la que nos encontramos.
La cantidad de caracteres que imprimimos es la fila en la que nos encontramos por *2 -1
 
 
 */