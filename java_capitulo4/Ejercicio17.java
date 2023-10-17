/* ******************************************************************************* */
/*   File:Ejercicio17.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2023/10/17 12:56                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2023/10/17 12:56												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo4;

public class Ejercicio17 
{
    public static void main(String[] args) 
    {
        
    
    System.out.print("Por favor, introduzca un número entero: ");
    int n = Integer.parseInt(System.console().readLine());
    System.out.println("La última cifra del número introducido es el " + (n % 10));
    }
}
