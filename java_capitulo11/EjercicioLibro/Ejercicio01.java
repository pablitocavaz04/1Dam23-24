/* ******************************************************************************* */
/*   File:Ejercicio01.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2024/02/07 10:30                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2024/02/07 11:03												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo11.EjercicioLibro;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;


public class Ejercicio01
{

//Funcion para detectar cual es un numero primo
public static boolean esPrimo(int x)
{
    for (int i = 2; i < x/2; i++)
    {
        if (x%i == 0)
            return false;
    }
    return true;
}
    public static void main(String[] args)
    {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("primos.dat"));
            for (int i = 1; i < 501; i++)
            {
                if (esPrimo(i))
                    bw.write(String.valueOf(i) + "\n");
            }
            bw.close();
        } catch (IOException ioe) {
            System.out.println("Error de escritura");
        }
    }
}
