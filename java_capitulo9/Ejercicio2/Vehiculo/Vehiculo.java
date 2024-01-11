package java_capitulo9.Ejercicio2.Vehiculo;

public class Vehiculo {
    private static int kilometrosTotales;
    private static int vehiculosCreados;
    private int kilometrosRecorridos;

    public void andar(int kilometros)
    {
        this.kilometrosRecorridos+=kilometros;
    }

    public int getKilometrosRecorridos()
    {
        return this.kilometrosRecorridos;
    }

    public static int getKilometrosTotales()
    {
        return kilometrosTotales;
    }

}
