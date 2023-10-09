/* ******************************************************************************* */
/*   File:Ejercicio08.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/10/09 10:35                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/10/09 10:41												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo4;

import java.util.Scanner;

public class Ejercicio08 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca las tres notas de las que vas a realizar la media: ");
        float nota1 = sc.nextFloat();
        float nota2 = sc.nextFloat();
        float nota3 = sc.nextFloat();
        float media = ((nota1+nota2+nota3)/3);
        if(media < 5)
        System.out.printf("Su medias es de %.2f insuficiente",media);
        else if (media >=5 && media<6) 
        System.out.printf("Su medias es de %.2f suficiente",media);
        else if(media >=6 && media<7)
        System.out.printf("Su medias es de %.2f bien",media);
        else if(media>=7 && media<9)
        System.out.printf("Su medias es de %.2f notable",media);
        else
        System.out.printf("Su medias es de %.2f sobresaliente",media);





    }
}
