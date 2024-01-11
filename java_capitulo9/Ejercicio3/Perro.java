package java_capitulo9.Ejercicio3;

public class Perro extends Animal
{
    private int edad;
    private String raza;
    public Perro(String sexo, String nombre, int edad, String raza)
    {
        super(sexo, nombre);
        this.edad = edad;
        this.raza = raza;
    }

    public void mostrarRaza()
    {
        System.out.println(nombre+" es de la raza: "+raza);
    }

    public void mostrarEdad()
    {
        System.out.println(nombre+" tiene"+edad+" años y "+edad*7+" años perrunos");
    }
}
