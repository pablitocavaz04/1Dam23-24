import java.io.File; //Me permite realizar operaciones con archivos de la siguiente manera:
// renombrar, borrar, mover, existe
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

import persona.Persona;

import java.io.BufferedReader;
import java.io.BufferedWriter;

public class App {
    public static void main(String[] args) throws Exception {
        if(args.length!=1)
            System.out.println("Not enough arguments");
        String fileName = args[0];
        File file = new File(fileName);
        ArrayList<Persona> personas = new ArrayList<>();
        if(!file.exists()){
            personas.add(new Persona("1","Juan", "García", 47));
            personas.add(new Persona("2","Alejandro", "García", 45));
        }
        else{
            BufferedReader br = new BufferedReader(new FileReader(file));
            String linea = "";
            while((linea= br.readLine())!=null){
                personas.add(Persona.deSerialize(linea));   
            }
            br.close();
        }
        for(Persona persona:personas)
            System.out.println(persona);
        BufferedWriter bw = new BufferedWriter(new FileWriter(file));
        for(Persona persona:personas)
            bw.write(persona.serialize()+"\n");
        bw.close();

    }
}
