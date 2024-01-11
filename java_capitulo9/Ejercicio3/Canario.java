package java_capitulo9.Ejercicio3;

public class Canario extends Ave {
    private int numeroColores;

   public Canario(String sexo, String nombre, int numeroColores)
   {
        super(sexo, nombre);
        this.numeroColores = numeroColores;
   }

   public int getNumeroColores()
   {
        return numeroColores;
   }

   public void nColores()
   {
    System.out.println(nombre+ " tiene "+ numeroColores+" numero de colores");
   }
}
