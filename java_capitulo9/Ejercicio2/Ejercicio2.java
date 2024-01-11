package java_capitulo9.Ejercicio2;

import java_capitulo9.Ejercicio2.Vehiculo.Bicicleta;
import java_capitulo9.Ejercicio2.Vehiculo.Coche;
import java_capitulo9.Ejercicio2.Vehiculo.Vehiculo;

public class Ejercicio2
{
    public static void menu()
    {
        System.out.println("\n1. Anda con la bicicleta");
        System.out.println("2. Haz el caballito con la bicicleta");
        System.out.println("3. Anda con el coche");
        System.out.println("4. Quema rueda con el coche");
        System.out.println("5. Ver kilometraje de la bicicleta");
        System.out.println("6. Ver kilometraje del coche");
        System.out.println("7. Ver kilometraje total");
        System.out.println("8. Salir");
        System.out.println("Elige una opción (1-8): ");
    }

    public static int leerOpcion()
    {
        return Integer.parseInt(System.console().readLine());
    }

    public static void andar(Vehiculo vehiculo, int kilometros)
    {
        vehiculo.andar(kilometros);
    }

    public static void Caballito(Bicicleta bicicleta)
    {
        bicicleta.hazCaballito();
    }
    
    public static void quemaRueda(Coche coche)
    {
        coche.quemaRueda();
    }

    public static void verKilometraje(Vehiculo vehiculo)
    {

    }

    public static void verKilometrajeTotal()
    {
        
    }

    public static void main(String[] args)
    {
        boolean salir = false;
        Bicicleta bicicleta = new Bicicleta();
        Coche coche = new Coche();
        while (!salir)
        {
            menu();
            int opcion = leerOpcion();
            switch (opcion) {
                case 1:
                    System.out.println("Cuantos km vas a recorrer: ");
                    int kilometros = Integer.parseInt(System.console().readLine());
                    andar(bicicleta, kilometros);
                    break;
            
                case 2:
                    System.out.println(bicicleta.hazCaballito());
                    break;
                case 3:
                System.out.println("Cuantos km vas a recorrer: ");
                    int kilometros = Integer.parseInt(System.console().readLine());
                    andar(coche, kilometros);
                    break;
                case 4:
                    System.out.println(quemaRueda(coche));
                case 5:
                System.out.println("La bici lleva recorrido : ");
                System.out.println("");

            }
        }
    }
}
