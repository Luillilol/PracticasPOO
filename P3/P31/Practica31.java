package mx.unam.fi.poo.g1.p31;

import mx.unam.fi.poo.g1.p31.Cadena;
import java.util.Scanner;


/**
 * Clase principal de la Practica 3_1
 * @author González Falcón Luis Adrián
 * @version Septiembre-2024
 */

public class Practica31 {
    /**
     * Método main
     * Se ejecuta todo el funcionamiento de la aplicación 
     * @param args -> Arreglo por defecto del metodo main
     */
    public static void main(String[] args) {
        Scanner es = new Scanner(System.in);
        Cadena cadena = new Cadena("Reemplazar un caracter especifico por otro");

        System.out.println("Cadena original: " +cadena.getCad());

        System.out.println("Ingresa el caracter a cambiar: ");
        cadena.setC(es.next());
        System.out.println("Ingresa el caracter a sustituir: ");
        cadena.setD(es.next());

        System.out.println("Cadena modificada: "+ cadena.reemplazarCaracter());
        es.close();     
    }
}
