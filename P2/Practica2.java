package mx.unam.fi.poo.g1.p2;

import mx.unam.fi.poo.g1.p2.Triangulo;
import java.util.Scanner;


/**
 * Clase principal de la Practica 2
 * @author González Falcón Luis Adrián
 * @version Septiembre-2024
 */

public class Practica2 {
    /**
     * Método main
     * Se ejecuta todo el funcionamiento de la aplicación 
     * @param args -> Arreglo por defecto del metodo main
     */
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
        System.out.println("Ingresa un número: ");
        int filas = en.nextInt();
        Triangulo triangulo = new Triangulo(filas);

        triangulo.calcularNumeros();    

        en.close();
        
        
    }
}