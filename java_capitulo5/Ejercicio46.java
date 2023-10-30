/* ******************************************************************************* */
/*   File:Ejercicio46.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/10/30 10:24                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/10/30 10:31												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo5;

import java.util.Scanner;

public class Ejercicio46 
{
    public static void main(String[] args) 
    {
        int anchura = 0;
        int altura = 0;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Por favor, introduzca la anchura del rectángulo(como mínimo 2): ");
            anchura = Integer.parseInt(sc.nextLine());
            System.out.print("Ahora introduzca la altura(como mínimo 2): ");
            altura = Integer.parseInt(sc.nextLine()); 
            if (altura < 2 || anchura < 2)
            System.out.println("Lo siento, los datos introducidos no son correctos, el valor mínimo para la anchura y la altura es 2;");
        } while (altura < 2 || anchura < 2);

        for (int i = 1; i <= altura; i++)
        {
            for (int j = 1; j <= anchura; j++)
            {
                if (i==1 || i==altura)
                    System.out.print("* ");
                else if (j == 1 || j == anchura) 
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
        System.out.println(" ");
        }
       

    }
}
