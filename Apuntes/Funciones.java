package Apuntes;

import java.util.Scanner;

public class Funciones 
{
    //Esta funcion sirve para continuar un programa dsp de pulsar la tecla enter.
    public static void pressAnyKeyToContinue()
    {
        String seguir;
        Scanner sc = new Scanner(System.in);
        System.out.println("Press Enter key to continue...");
        try
        {
            seguir = sc.nextLine();
        }
        catch(Exception e)
        {}
    }
}
