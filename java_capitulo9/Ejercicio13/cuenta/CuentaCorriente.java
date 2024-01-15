package java_capitulo9.Ejercicio13.cuenta;

import java.util.Random;

public class CuentaCorriente
{
    private long nuemroCuenta;
    private double saldo;

    //Vamos a crear un constructor para crear una cuenta 
    // con saldo inicial
    public CuentaCorriente(double saldoInicial)
    {
        this.nuemroCuenta = generarNumeroCuenta();
        this.saldo = saldoInicial;
    }

    //Y ahora vamos a crear el constructor para las cuentas
    //que comienzen a 0
    public CuentaCorriente()
    {
        this.nuemroCuenta = generarNumeroCuenta();
        this.saldo = 0.0;
    }

    //Ahora vamos a crear el metodo privado para generar el
    // numero de cuenta de manera aleatoria
    private long generarNumeroCuenta()
    {
        Random Random = new Random();
        return Math.abs(Random.nextLong () % 10000000000L);
    }

    //Ahora vamos a realizar un metodo para realizar un ingreso
    public void hacerIngreso(double cantidad)
    {
        this.saldo += cantidad;
        System.out.println("Ingreso de $" + cantidad + " realizado. Nuevo saldo: $" + saldo);
    }

    //Y ahora vamos a hacer un metodo para realizar un gasto
    public void hacerGasto(double cantidad)
    {
        this.saldo -= cantidad;
        System.out.println("Gasto de $" + cantidad + " realizado. Nuevo saldo: $" + saldo);
    }

    //Metodo para hacer una transferencia de una cuenta a otra
    public void hacerTransferencia(CuentaCorriente cuentaDestino, double cantidad)
    {
        if (saldo >= cantidad)
        {
            saldo -= cantidad;
            cuentaDestino.hacerIngreso(cantidad);
            System.out.println("Transferencia de $" + cantidad + " realizada a la cuenta " + cuentaDestino.getNumeroCuenta());
            System.out.println("Nuevo saldo en la cuenta actual: $" + saldo);
        }
        else
        {
            System.out.println("Saldo insuficiente para realizar la transferencia.");
        }
    }

    //Metodo para obtener el numero de cuenta
    public long getNumeroCuenta()
    {
        return nuemroCuenta;
    }

    //Metodo para obtener el saldo actual
    public double getSaldo()
    {
        return saldo;
    }
}

