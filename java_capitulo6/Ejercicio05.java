/* ******************************************************************************* */
/*   File:Ejercicio05.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/11/06 10:25                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/11/06 10:37												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo6;

public class Ejercicio05
{
    public static void main(String[] args)
    {
        int maximo = 100;
        int min = 199;
        int suma = 0;
        int i;
        for ( i = 1; i <= 50; i++)
        {
            int aleatorio = (int)(Math.random()*100)+100;
            System.out.print(aleatorio+" ");
            if (aleatorio < min)
                min = aleatorio;
            if (aleatorio > maximo)
                maximo = aleatorio;
            suma += aleatorio;
        }
        System.out.println();
        System.out.printf("El mayor numero encontrado es = %d\nEl menos numero encontado es = %d\nLa media de todos los numeros es %d\n",maximo,min,suma/i);
    }
}
