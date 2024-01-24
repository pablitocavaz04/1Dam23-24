/* ******************************************************************************* */
/*   File:App.java                                                                 */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2024/01/24 11:57                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2024/01/24 12:39												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo10.Array_Generics;
import java_capitulo10.Array_Generics.Generics.MyArrayList;
import java_capitulo10.Array_Generics.Generics.Perro;
public class App {
    public static void main(String[] args)
    {
        /*
         * MyArrayList<Integer> array = new MyArrayList<Integer>(10);
        for (int i = 0; i < 1000; i++)
            array.add(i);
        for (int i = 0; i < 1000; i++)
            array.remove(0);
        array.add(100);
        System.out.println(array); 
         */
        
        MyArrayList<Perro> arrayPerros = new MyArrayList<Perro>(100);
        for (int i = 0; i < 100; i++)
        {
            String nombre = "";
            for (int j = 0; j < 10; j++) {
                nombre += ""+(char)+(65+(int)Math.random()*20);
            }
            arrayPerros.add(new Perro(nombre));
        }

        System.out.println(arrayPerros);
    }
}
