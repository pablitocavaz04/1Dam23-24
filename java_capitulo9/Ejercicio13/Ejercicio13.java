/* ******************************************************************************* */
/*   File:Ejercicio13.java                                                         */
/*                                                    ::::::::::       :;     ;:   */
/*                                                   |;                :;    ;:    */
/*                                                  |;                 :;   ;:     */
/*   By: Pablo Camino Vázquez                      |;                  :;  ;:      */
/*                                                |;                   :; ;:       */
/*   Created: 2024/01/15 10:10                   |::::::::::::   :+:   ;;;         */
/*   Updated: 2024/01/15 10:39												       */
/*                                                                                 */
/* ******************************************************************************* */
package java_capitulo9.Ejercicio13;

import java_capitulo9.Ejercicio13.cuenta.CuentaCorriente;

public class Ejercicio13
{
    public static void main(String[] args) {
        // Ejemplo de uso
        CuentaCorriente cuenta1 = new CuentaCorriente(1000.0);
        CuentaCorriente cuenta2 = new CuentaCorriente();

        System.out.println("Cuenta 1 - Número de cuenta: " + cuenta1.getNumeroCuenta() + ", Saldo: $" + cuenta1.getSaldo());
        System.out.println("Cuenta 2 - Número de cuenta: " + cuenta2.getNumeroCuenta() + ", Saldo: $" + cuenta2.getSaldo());

        cuenta1.hacerGasto(500.0);
        cuenta2.hacerIngreso(300.0);

        System.out.println("Después de operaciones:");
        System.out.println("Cuenta 1 - Saldo: $" + cuenta1.getSaldo());
        System.out.println("Cuenta 2 - Saldo: $" + cuenta2.getSaldo());

        cuenta1.hacerTransferencia(cuenta2, 200.0);

        System.out.println("Después de transferencia:");
        System.out.println("Cuenta 1 - Saldo: $" + cuenta1.getSaldo());
        System.out.println("Cuenta 2 - Saldo: $" + cuenta2.getSaldo());
    }
}


//Que es un constructor
//Para que sirve el getter