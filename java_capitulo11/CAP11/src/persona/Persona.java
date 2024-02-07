package persona;

import java.io.Serializable;

public class Persona{

    private String nombre;
    private String apellidos;
    private int edad;
    private String id;

    public Persona(String id, String nombre, String apellidos, int edad){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public String getId() {
        return id;
    }

    public String serialize(){
        return String.format("%s;%s;%s;%d", this.id, this.nombre, this.apellidos, this.edad);
    }
    public static Persona deSerialize(String persona) throws Exception{
        String nombre, apellidos, id;
        int edad;
        String[] valores = persona.split(";");
        if(valores.length!=4)
            throw new Exception("Not enough paramters for person");
        id = valores[0];
        nombre = valores[1];
        apellidos = valores[2];
        edad = Integer.parseInt(valores[3]);    
        
        return new Persona(id, nombre, apellidos, edad);
    }

    @Override
    public String toString() {
        return String.format("Id: %s%nNombre: %s%nApellidos: %s%nEdad: %d", this.id, this.nombre, this.apellidos, this.edad);
    }
}
