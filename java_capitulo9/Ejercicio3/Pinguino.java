package java_capitulo9.Ejercicio3;

public class Pinguino extends Animal
{
    public Pinguino(String sexo, String nombre)
    {
        super(sexo, nombre);
    }

    public void deslizar()
    {
        System.out.println(nombre+" se esta deslizando a todo lo que da el puto pinguino");
    }
}
