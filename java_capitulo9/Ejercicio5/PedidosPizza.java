/* ******************************************************************************* */
/*   File:PedidosPizza.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2024/01/11 10:36                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2024/01/11 10:36												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo9.Ejercicio5;

public class PedidosPizza
{
    public static void main(String[] args)
    {
        Pizza p1 = new Pizza("margarita", "mediana");
        Pizza p2 = new Pizza("funghi", "familiar");
        p2.sirve();
        Pizza p3 = new Pizza("cuatro quesos", "mediana");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        p2.sirve();
        System.out.println("pedidas: " + Pizza.getTotalPedidas());
        System.out.println("servidas: " + Pizza.getTotalServidas());
        }
}
