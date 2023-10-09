package java_capitulo3;

import java.util.Scanner;

public class Ejercicio08 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la cantidad de horas trabajadas: ");
        int horas = sc.nextInt();
        System.out.println("El salario que corresponde a "+horas+" trabajadas es = "+horas*12);
    }
}
