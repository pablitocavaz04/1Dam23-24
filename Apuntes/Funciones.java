package Apuntes;

import java.util.Scanner;

public class Funciones 
{
    public static Scanner sc = null;
    /*
     * iniciar
     * Inicia el Scanner para poder leer desde teclado
     */
    public static void iniciar()
    {
        sc = new Scanner(System.in);
    }
    /* 
     * Cierrra el Scanner para liberar recursos
    */
    public static void finalizar()
    {
        sc.close();
    }
    /*
     * Muestra el menu de la aplicación en la consola
     */
    public static void mostrarMenu()
    {
        System.out.println("1.Sumar");
        System.out.println("2.Restar");
        System.out.println("3.Salir");
    }
    /*
     * Solicita la opción del menú
     * @return la opcion elegida en formato int
     */

    public static int pedirOpcion()
    {
        System.out.print("Intorduzca una opcion : ");
        return sc.nextInt();
    }

    /*
     * 
     * Suma dos valores y devuleve el resultado de la suma
     * @param a Oprenado 1 de la suma
     * @paramm b Operando 2 de la suma
     */
    public static int sumar(int a, int b)
    {
        return 0;
    }
    /*
     * 
     * Suma dos valores y devuleve el resultado de la resta
     * @param a Oprenado 1 de la resta
     * @paramm b Operando 2 de la resta
     */
    public static int restar(int a, int b)
    {
        return 0;
    }

    public static void main(String[] args) 
    {
        iniciar();
        mostrarMenu();
        int opcion = pedirOpcion();
        switch (opcion) {
            case 1:
                {
                 int a = sc.nextInt();
                 int b = sc.nextInt();
                 System.out.printf("%d + %d = %d ",a,b,sumar(a, b));
                 break;
                }
            case 2:
                {
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    System.out.printf("%d - %d = %d ",a,b,restar(a, b));
                    break;
                }
            case 3:
                System.out.println("Hasta luego");
                break;
            default:
                System.out.println("Opción erronea");
                
        }
        finalizar();
    }
}
