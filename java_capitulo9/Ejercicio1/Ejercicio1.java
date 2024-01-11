package java_capitulo9.Ejercicio1;
public class Ejercicio1{
    public static void main(String[] args) {

        Caballo caballo1 = new Caballo("Rocinante","negro",10,22);
        Caballo caballo2 = new Caballo("Canela","marron",5,6);

        System.out.println("Este caballo se llama "+ caballo1.getNombre()+" y este se llama "+caballo2.getNombre());

        caballo1.relincha();
        caballo2.rumia();
        caballo1.cabalga(8);
        caballo1.cabalga();
    }
}