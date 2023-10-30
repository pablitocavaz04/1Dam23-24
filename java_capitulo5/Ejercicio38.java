/* ******************************************************************************* */
/*   File:Ejercicio38.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/10/29 19:21                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/10/30 08:40  											       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo5;
import java.util.Scanner;
public class Ejercicio38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura;
        do
        {
            System.out.print("Por favor introduzca la altura del reloj de arena :");
            altura = Integer.parseInt(sc.nextLine());
            if (altura < 3 && altura%2 == 0)
                System.out.println("El numero no es valido intentelo de nuevo.");
        } while (altura < 3 && altura%2 == 0);

        for (int i = 1; i <= altura; i++)
        {
            for (int j = 1; j <= altura; j++) 
            {
                if (j <=i && j >= altura-i+1 || j >=i && j <=altura-i+1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println("");
        }


    }
}

/*
 * Si suponemos que la altura es 5 en la primera fila hay 0 espacios y 5 asteriscos
 * En la segunda gila imprimimos un espacio
 */