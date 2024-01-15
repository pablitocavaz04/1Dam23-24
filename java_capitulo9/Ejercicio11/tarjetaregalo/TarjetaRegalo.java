package java_capitulo9.Ejercicio11.tarjetaregalo;

public class TarjetaRegalo {
    private String numero;
    private float fondo;
    public TarjetaRegalo (float f)
    {
        this.fondo = f;
        for(int i = 1; i <= 5 ; i++)
        {
            this.numero += (int)(Math.random()*10);
        }
    }

    public void gasta(float importe)
    {
        if(importe > this.fondo)
            throw new NotEnoughFoundException();
        this.fondo -= importe;
    }

    public TarjetaRegalo fusionaCon(TarjetaRegalo t)
    {
        TarjetaRegalo ret = new TarjetaRegalo(this.fondo+t.fondo);
        this.fondo = 0;
        t.fondo = 0;
        return ret ;
    }

    @Override
    public String toString() {
        return String.format("Tarjeta n1 %s - Saldo %.2f",this.numero,this.fondo);
    }
}
