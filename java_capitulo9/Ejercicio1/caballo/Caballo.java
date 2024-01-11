package java_capitulo9.Ejercicio1.caballo;

class Caballo{

    private String nombre;
    private String color;
    private int edad;
    private int carrerasGanadas;

    Caballo(String nombre, String color, int edad, int carrerasGanadas){
        this.nombre = nombre;
        this.color = color;
        this.edad = edad;
        this.carrerasGanadas = carrerasGanadas;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }


    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    
    public void setEdad(int edad){
        this.edad = edad;
    }

    public int getEdad(){
        return edad;
    }


    public void setCarrerasGanadas(int carrerasGanadas){
        this.carrerasGanadas = carrerasGanadas;
    }

    public int getCarrerasGanadas(){
        return carrerasGanadas;
    }


    public void cabalga(){
        System.out.println("Tocotoc tocotoc tocotoc");
    }

    public void cabalga(int numeroKm){
        System.out.println("Tocotoc tocotoc tocotoc durante " + numeroKm + " km");
    }

    public void relincha(){
        System.out.println("Hiiiiiiieeeeee");
    }

    public void rumia(){
        System.out.println("Ñam ñam ñam");
    }

}