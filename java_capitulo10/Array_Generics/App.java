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
public class App {
    public static void main(String[] args)
    {
        MyArrayList<Integer> array = new MyArrayList<Integer>(10);
        for (int i = 0; i < 1000; i++)
            array.add(i);
        for (int i = 0; i < 1000; i++)
            array.remove(0);
        array.add(100);
        System.out.println(array); 
    }
}
