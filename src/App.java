import java.security.AlgorithmConstraints;

import Entidades.CuentaBancaria;
import Servicios.CuentaBancariaServicio;

///
public class App {
    public static void main(String[] args) throws Exception {
        // CuentaBancaria albertitoCta = new CuentaBancaria(0001, 23565666, 100256); //
        // Asi se crea usando directo el contructor
        // System.out.println(albertitoCta);
        ///
        CuentaBancariaServicio servicioCuentas = new CuentaBancariaServicio();
        CuentaBancaria cuentaAlbertoAlbertinez = servicioCuentas.crearCuenta(); // Asi se crea usando el servicio
        System.out.println(cuentaAlbertoAlbertinez);
        // cuentaAlbertoAlbertinez.ingresarDinero(222);
        // System.out.println(cuentaAlbertoAlbertinez);
        // cuentaAlbertoAlbertinez.retirarDinero(22);
        // System.out.println(cuentaAlbertoAlbertinez);
        // cuentaAlbertoAlbertinez.retirarDinero(993333333);
        // cuentaAlbertoAlbertinez.extraccionRapida(222);
        // cuentaAlbertoAlbertinez.consultarSaldo();
        // cuentaAlbertoAlbertinez.consultarDatos();

        servicioCuentas.ingresarDinero(cuentaAlbertoAlbertinez, 33);
        System.out.println(cuentaAlbertoAlbertinez);
        servicioCuentas.retirarDinero(cuentaAlbertoAlbertinez, 22);
        System.out.println(cuentaAlbertoAlbertinez);
        servicioCuentas.extraccionRapida(cuentaAlbertoAlbertinez, 333);
        servicioCuentas.consultarSaldo(cuentaAlbertoAlbertinez);
        servicioCuentas.consultarDatos(cuentaAlbertoAlbertinez);

    }
}
