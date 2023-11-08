/* ******************************************************************************* */
/*   File:Ejercicio11.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/11/08 10:27                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/11/08 10:35												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo6;

public class Ejercicio11
{
    public static void main(String[] args)
    {
        int suspensos = 0;
        int suficientes = 0;
        int bienes = 0;
        int notables = 0;
        int sobresalietes = 0;
        for (int i = 1; i <= 20; i++)
        {
            int aleatorio = (int)(Math.random()*11);
            if (aleatorio >= 0 && aleatorio <5){
                System.out.print("supenso ");
                suspensos++;
            }
            else if (aleatorio == 5)
            {
                System.out.print("suficiente ");
                suficientes++;
            }
            else if (aleatorio > 5 && aleatorio <=6)
            {
                System.out.print("bien ");
                bienes++;
            }
            else if (aleatorio >= 7 && aleatorio <9)
            {
                System.out.print("notable ");
                notables++;
            }
            else
            {
                System.out.print("sobresaliente ");
                sobresalietes++;
            }
        }
        System.out.println(a);
        System.out.printf("El numero de suspensos es %d , de suficientes es %d, de bienes %d, de notables %d , y de sobresalientes %d",suspensos,suficientes,bienes,notables,sobresalietes);
    }
}
