package java_capitulo9.Ejercicio8.Terminales;

public class Terminal
{
    //Constructor
    private int tiempoConversacion;
    private String numTelef;
    public Terminal(String telef)
    {
        this.numTelef = telef;
        this.tiempoConversacion = 0;
         
    }

    public int getTiempoConversacion()
    {
        return tiempoConversacion;
    }

    public String getNumTelf()
    {
        return numTelef;
    }

    public void llama(Terminal t, int segundos)
    {
        this.tiempoConversacion += segundos;
        t.tiempoConversacion += segundos;
    }

    @Override
    public String toString()
    {
        return String.format("Nº %s - %ss de cconversacin",
        this.numTelef,
        this.tiempoConversacion);
    }
}
