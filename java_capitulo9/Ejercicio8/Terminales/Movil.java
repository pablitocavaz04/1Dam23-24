package java_capitulo9.Ejercicio8.Terminales;

public class Movil extends Terminal
{
    private String tarifa;
    private int tiempoLlamando;
    public Movil(String telef,String tarifa)
    {
        super(telef);
        this.tarifa = tarifa;
    }
    
    @Override
    public void llama(Terminal t, int segundos)
    {
        this.tiempoLlamando+=segundos;
        super.llama(t, segundos);
    }

    public float costeLlamadas ()
    {
        float costePorSegundo =  (this.tarifa.equals("rata")?
                                    0.06f:
                                this.tarifa.equals("mono")?
                                    0.12f:
                                    0.30f);

        return (float)this.tiempoLlamando*costePorSegundo;
    }

    @Override
    public String toString()
    {
        return String.format("%s - tarifcados %.2f erusos",
                    super.toString(),
                    this.costeLlamadas()
                    );
    }
}
