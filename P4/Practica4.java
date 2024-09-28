package mx.unam.fi.poo.g1.p4;

import mx.unam.fi.poo.g1.p4.CuentaBanco;

/**
 * Clase principal de Practica 4
 * @author González Falcón Luis Adrián
 * @version Septiembre-2024
 */

public class Practica4 {
    /**
     * Método main
     * Se ejecuta todo el funcionamiento de la aplicación
     * @param args -> Arreglo por defecto de la función main
     */
    public static void main(String[] args) {
        CuentaBanco cuenta1 = new CuentaBanco("Falcón", 32009, 3500.50);        
        System.out.println(cuenta1.detallesCuenta());
        cuenta1.depositarDinero(800);
        cuenta1.retirarDinero(2500);
        System.out.println(cuenta1.detallesCuenta());

        System.out.println();
        
        CuentaBanco cuenta2 = new CuentaBanco("Luis", 12345);
        System.out.println(cuenta2.detallesCuenta());
        cuenta2.depositarDinero(800);
        cuenta2.retirarDinero(1500);
        System.out.println(cuenta2.detallesCuenta());
    }
}
