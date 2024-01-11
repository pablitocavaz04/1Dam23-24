package java_capitulo9.Ejercicio3;

public class Gato extends Animal
{
    private int edad;
    private String raza;
   
    public Gato(String sexo, String nombre, int edad, String raza)
    {
        super(sexo,nombre);
        this.edad = edad;
        this.raza = raza;
    }

    public void mostrarRaza()
    {
        System.out.println(nombre+" es de la raza: "+raza);
    }

    public String toString()
    {
        return nombre+" es "+sexo+" de raza "+raza+" y tiene "+edad+" años";
    }

    public int getEdad()
    {
        return edad;
    }

    public void setEdad(int edad)
    {
        this.edad = edad;
    }

    public String getRaza()
    {
        return raza;
    }

    public void setRaza()
    {
        this.raza = raza;
    }
}
