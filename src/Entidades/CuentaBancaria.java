package Entidades;

public class CuentaBancaria {
    private int numeroCuenta;
    private long dniCliente;
    private double saldoActual;

    public CuentaBancaria(int numeroCuenta, long dniCliente, double saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.dniCliente = dniCliente;
        this.saldoActual = saldoActual;
    }

    public CuentaBancaria() {
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(long dniCliente) {
        this.dniCliente = dniCliente;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    @Override
    public String toString() {
        return "CuentaBancaria [numeroCuenta=" + numeroCuenta + ", dniCliente=" + dniCliente + ", saldoActual="
                + saldoActual + "]";
    }

    // /// Esto lo pedia en CuentaBancariaServicios asi que lo pasamos alla
    /// HAY QUE PASARLA POR PARAMETRO ENTONCES A LA CLASE QUE TOMAREMOS A SERVICIO
    // public void ingresarDinero(double ingresado) {
    // this.setSaldoActual(this.saldoActual += ingresado);
    // }

    // public void retirarDinero(double ingresado) {
    // if (this.saldoActual >= ingresado) {
    // System.out.println("Dinero retirado: " + ingresado);
    // this.setSaldoActual(this.saldoActual -= ingresado);
    // } else {
    // System.out.println("Fondos insuficientes!! No opera el retiro");
    // }
    // }

    // public void extraccionRapida(double ingresado) {
    // if (this.saldoActual >= ingresado) {
    // if ((this.saldoActual * 0.2) >= ingresado) {
    // System.out.println("Dinero retirado: " + ingresado);
    // this.setSaldoActual(this.saldoActual -= ingresado);
    // } else {
    // System.out.println("No opera el retiro mayor al 20 % del saldo");
    // }
    // } else {
    // System.out.println("Fondos insuficientes!! No opera el retiro");
    // }

    // }

    // public void consultarSaldo() {
    // System.out.println(this.saldoActual);
    // }

    // public void consultarDatos() {
    // System.out.println("Datos: " + this.toString());
    // }
}