/* ******************************************************************************* */
/*   File:Ejercicio4.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2024/01/11 10:17                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2024/01/11 10:28												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo9.Ejercicio4;

public class Ejercicio4 {
    public static void main(String[] args) {

        Fraccion fraccion1 = new Fraccion(4, 2);

        System.out.print(fraccion1.muestra()+" = "+ fraccion1.divide()+"\n");
        System.out.print("La fraccion inversa seria: "+fraccion1.invierte()+"\n");
        System.out.printf("Si multiplicamos en lugar de dividir da: %.0f",fraccion1.multiplica());
        
    }
}
