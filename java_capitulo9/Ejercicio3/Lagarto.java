package java_capitulo9.Ejercicio3;

public class Lagarto extends Animal
{
    public Lagarto(String sexo, String nombre)
    {
        super(sexo,nombre);
    }

    public void mudarPiel()
    {
        System.out.println(nombre+ " ha mudado la piel el bicharraco");
    }
}
