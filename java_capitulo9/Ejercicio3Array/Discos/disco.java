package java_capitulo9.Ejercicio3Array.Discos;

import java_capitulo9.Ejercicio3Array.Uuid.MyUuid;

public class disco {
    private String codigo;
    private String autor;
    private int duracion;
    private String nombre;
    private String genero;

    Disco(String nombre, 
            String autor, 
            String genero, 
            int duracion)
            {
                this.codigo = MyUuid.getUuid(6);
                this.autor = autor;
                this.genero = genero;
                this.nombre = nombre;
                this.duracion = duracion;
        
            }

        
}
