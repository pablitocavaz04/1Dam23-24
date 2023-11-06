/* ******************************************************************************* */
/*   File:Ejercicio06.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/11/06 10:37                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/11/06 10:50												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo6;

import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int acierto = (int)(Math.random()*101);
        int intentos = 0;
        int numero = 0;
        System.out.println(acierto);
        do
        {
            System.out.print("Introduzca un numero : ");
            numero = Integer.parseInt(sc.nextLine());
            if (numero == acierto)
                System.out.println("Enhorabuena el numero que habia que adivinar era el "+acierto+"!!!!!!!!!!!!!ueueueuuueeu!!!!!!!!!!");
            else if (numero > acierto)

                System.out.println("El numero que tienes que adivinar es menor que el que has introducido");
            else
                System.out.println("El numero que tienes que adivinar es mayor que el introducido");
        intentos++;
        } while (intentos <= 5 || numero == acierto);
    }
}
