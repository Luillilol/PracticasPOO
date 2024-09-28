package mx.unam.fi.poo.g1.p32;

import mx.unam.fi.poo.g1.p32.Contenedor;
import java.util.Scanner;

/**
 * Clase principal de Practica3_2
 * @author González Falcón Luis Adrián
 * @version Septiembre-2024
 */
public class Practica32 {
    /**
     * Método main 
     * Se ejecuta todo el funcionamiento de la aplicación
     * @param args -> Arreglo por defecto del método main
     */

    public static void main(String[] args) {
        Scanner es = new Scanner(System.in);
        String nombre;
        Contenedor contenedor = new Contenedor();

        contenedor.agregarElemento("Luis");
        contenedor.agregarElemento("Adrián");
        contenedor.agregarElemento("Ximena");
        contenedor.agregarElemento("Fernando");
        contenedor.agregarElemento("Mauricio");
        contenedor.agregarElemento("Santiago");
        contenedor.agregarElemento("Miguel");

        System.out.println("Elementos del contenedor: ");
        contenedor.mostrarContenedor();

        System.out.println("Nombre para reemplazar: ");
        nombre = es.next();

        contenedor.sustituirElemento(1, nombre);
        
        System.out.println();
        System.out.println("Elementos sustituidos: ");
        contenedor.mostrarContenedor();

        es.close();
    }
}
