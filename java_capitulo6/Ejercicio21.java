/* ******************************************************************************* */
/*   File:Ejercicio21.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/11/09 09:45                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/11/09 09:55												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo6;

public class Ejercicio21
{
    public static void caraCruz()
    {
        int tirar = (int)(Math.random()*2)+1;
        if (tirar == 1)
            System.out.printf(" cara\n");
        else
            System.out.printf(" cruz\n");
    }
    public static void main(String[] args)
    {
        String moneda = "";
        for (int i = 1; i <= 5; i++)
        {
            switch((int)(Math.random() * 8)) {
                case 0:
                  moneda = "1 céntimo";
                  break;
                case 1:
                  moneda = "2 céntimos";
                  break;
                case 2:
                  moneda = "5 céntimos";
                  break;
                case 3:
                  moneda = "10 céntimos";
                  break;
                case 4:
                  moneda = "20 céntimos";
                  break;
                case 5:
                  moneda = "50 céntimos";
                  break;
                case 6:
                  moneda = "1 euro";
                  break;
                case 7:
                  moneda = "2 euros";
                default:
              }
              System.out.print(moneda+" ");
            caraCruz();
        }
    }
}
