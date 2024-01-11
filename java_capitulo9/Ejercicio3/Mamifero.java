package java_capitulo9.Ejercicio3;

public class Mamifero extends Animal
{
    public Mamifero(String sexo, String nombre)
    {
        super(sexo, nombre);
    }

    public void correr(String nombre)
    {
        System.out.println(nombre+ " esta corriendo");
    }

    public void nacer(){
        System.out.println(nombre + " ha nacido");
    }

    public void caminar(){
        System.out.println(nombre+ " esta caminando");
    }
}
