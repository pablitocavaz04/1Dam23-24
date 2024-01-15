package java_capitulo9.Ejercicio10.microorganismos;

public class Amebas
{
    private int peso;
    public int getPeso()
    {
        return peso;
    }
    public Ameba()
    {
        this.peso= 3;
    }
    public void come(int peso)
    {
        this.peso = Math.max(0, this.peso+peso-1);
    }

    public void come(Amebas a)
    {
        come(a.peso);
        a.peso = 0;
    }
}
