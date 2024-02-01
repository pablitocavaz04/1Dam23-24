/* ******************************************************************************* */
/*   File:Ejercicio06.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2024/01/25 10:58                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2024/01/25 11:15												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo10.Ejercicio06;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio06
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        HashMap <String, String> m = new HashMap<String, String>();
        m.put("Pablo Camino", "123");
        m.put("Benito Camela", "234");
        m.put("Camavinga", "345");

        String usuario;
        String clave;
        boolean entra = false;
        int trys = 3;
        //Vamos a pedir el usuario y la contraseña
        System.out.println("Introduzca nombre de usuario y contraseña");
        do {
            System.out.print("Usuario: ");
            usuario = sc.nextLine();
            System.out.print("Contraseña: ");
            clave = sc.nextLine();
            if (m.containsKey(usuario))//El usuario si existe
            {
                if (m.get(usuario).equals(clave))
                {
                    System.out.println("Ha accedido al area restringida.");
                    entra = true;
                }
            }else//El usuario no existe
            {
                System.out.println("El usuario introducido no existe");
            }
            trys--;

            if (!entra && (trys > 0))
            {
                System.out.println("Le quedan "+trys+" oportunidades.");
            }
        } while (!entra && trys > 0);
      
        if (!entra)
            System.out.println("Lo siento no has conseguido el acceso");

    }
}
