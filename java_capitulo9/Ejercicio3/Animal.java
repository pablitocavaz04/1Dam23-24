package java_capitulo9.Ejercicio3;

public class Animal
{
    protected String sexo;
    protected String nombre;

    public Animal(String sexo, String nombre)
    {
        this.sexo = sexo;
        this.nombre = nombre;
    }
    
    public String getSexo()
    {
        return sexo;
    }

    public String getNombre()
    {
        return nombre;
    }
    
    public void come()
    {
        System.out.println(nombre+" esta comiendo");
    }

    public void duerme(){
        System.out.println(nombre+" va a dormir");
    }

    public void setSexo(String sexo)
    {
        this.sexo = sexo;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
}
