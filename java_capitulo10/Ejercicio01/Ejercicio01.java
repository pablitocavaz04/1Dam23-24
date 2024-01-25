/* ******************************************************************************* */
/*   File:Ejercicio01.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2024/01/25 08:24                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2024/01/25 08:29												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo10.Ejercicio01;

import java.util.ArrayList;

public class Ejercicio01
{
    public static void main(String[] args)
    {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Pablo");
        names.add("Florentino");
        names.add("Vinicius");
        names.add("Lamine");
        names.add("Tragabolas");
        names.add("Kinki");
        
        for (int i = 0; i < names.size(); i++)
        {
            System.out.println("El nombre "+(i+1)+" es el nombre: "+names.get(i));
        }
    }
}
