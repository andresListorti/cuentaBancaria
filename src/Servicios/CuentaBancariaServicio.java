package Servicios;

///
import java.util.Scanner;
import Entidades.CuentaBancaria;

///
public class CuentaBancariaServicio {
    public Scanner leer = new Scanner(System.in);
    public int ingresoCliente;
    public long ingresoDni;
    public double ingresoSaldo;

    ///
    public CuentaBancaria crearCuenta() {
        System.out.println("Ingrese Numero de Cliente: ");
        ingresoCliente = leer.nextInt();
        System.out.println("Ingrese DNI: ");
        ingresoDni = leer.nextLong();
        System.out.println("Ingrese Saldo Actual: ");
        ingresoSaldo = leer.nextDouble();
        CuentaBancaria cta = new CuentaBancaria(ingresoCliente, ingresoDni, ingresoSaldo);
        // System.out.println(cta);
        return cta;
    }

    ///
    public void ingresarDinero(CuentaBancaria cuenta, double ingreso) {
        cuenta.setSaldoActual(cuenta.getSaldoActual() + ingreso);
    }

    /**
     * @param cuenta
     * @param ingresado
     */
    public void retirarDinero(CuentaBancaria cuenta, double ingresado) {
        double saldoCuenta = cuenta.getSaldoActual();
        if (cuenta.getSaldoActual() >= ingresado) {
            System.out.println("Dinero retirado: " + ingresado);
            cuenta.setSaldoActual(saldoCuenta -= ingresado);
        } else {
            System.out.println("Fondos insuficientes!! No opera el retiro");
        }
    }

    ///
    public void extraccionRapida(CuentaBancaria cuenta, double ingresado) {
        double saldoCuenta = cuenta.getSaldoActual();
        if (saldoCuenta >= ingresado) {
            if ((saldoCuenta * 0.2) >= ingresado) {
                System.out.println("Dinero retirado: " + ingresado);
                cuenta.setSaldoActual(saldoCuenta -= ingresado);
            } else {
                System.out.println("No opera el retiro mayor al 20 % del saldo");
            }
        } else {
            System.out.println("Fondos insuficientes!! No opera el retiro");
        }
    }

    ///
    public void consultarSaldo(CuentaBancaria cuenta) {
        System.out.println("Saldo: " + cuenta.getSaldoActual());
    }

    ///
    public void consultarDatos(CuentaBancaria cuenta) {
        System.out.println("Datos: " + cuenta.toString());
    }
}
