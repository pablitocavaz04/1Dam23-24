/* ******************************************************************************* */
/*   File:Ejercicio37.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/10/29 18:32                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/10/29 18:												       */
/*                                                                                 */
/* ******************************************************************************* */

import java.util.Scanner;

public class Ejercicio37 
{
    public static int voltearnum(int x)
    {
        int aux = 0;
        int i = 0;
        while (x > 0) 
        {
            aux = (aux*10)+(x%10);
            x /= 10;
            i++;
        }
        aux = (aux*10)+i;
        return aux;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor introduzca un número entero positivo: ");
        int numero = Integer.parseInt(sc.nextLine());
        numero = voltearnum(numero);
        int numDig = numero%10;
        numero /= 10;
        System.out.println(numero);
        int i = 0; 
        while (numero > 0) 
        {
            for (i=1; i<= numero%10 ; i++)
            System.out.print("|");
            if (i < numDig)
                System.out.print("-");
        numero /= 10;
        }
    }
}
