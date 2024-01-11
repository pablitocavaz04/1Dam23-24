package java_capitulo9.Ejercicio5;

public class Pizza {
    private static int totalPedidas;
    private static int totalServidas;

    private String tamano;
    private String tipo;
    private String estado;

    public Pizza(String tamano, String tipo)
    {
        this.tamano = tamano;
        this.tipo = tipo;
        this.estado = "pedida";
        Pizza.totalPedidas++;
    }
    
    public String toString() {
        return "pizza " + this.tipo + " " + this.tamano + ", " + this.estado;
    }

    public void sirve()
    {
        if (estado.equals("servida"))
            System.out.println("Esta pizza esta ya servida");
        else
        {
            this.estado = "servida";
            totalServidas++;
        }
    }

    public static int getTotalPedidas()
    {
        return totalPedidas;
    }

     public static int getTotalServidas()
    {
        return totalServidas;
    }
}
