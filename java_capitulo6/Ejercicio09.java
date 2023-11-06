/* ******************************************************************************* */
/*   File:Ejercicio09.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/11/06 10:52                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/11/06 10:57												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo6;

public class Ejercicio09
{
    public static int numeroParAleatorio(int x)
    {
        do
        {
            x = (int)(Math.random()*101);
        } while (x%2 != 0);
        return x;
    }
    public static void main(String[] args)
    {
        int i = 0;
        int numero = 0;
        do
        {
            numero = numeroParAleatorio(numero);
            System.out.print(numero+" ");
            i++;
        } while (numero != 24);
        System.out.println();
            System.out.println("El total de numeros es = "+i);
    }
}
