package mx.unam.fi.poo.g1.p1;

import mx.unam.fi.poo.g1.p1.*;
import java.util.Scanner;
/**
 * Clase principal de la Práctica 1
 * @author González Falcón Luis Adrián
 * @version Septiembre-2024
 */

public class Practica1 {
    /**
     * Método main
     * Se ejecuta todo el funcionamiento de la aplicación 
     * @param args -> Arreglo por defecto del metodo main
     */
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
        Coordenadas coordenadas = new Coordenadas();
        
        System.out.print("Latitud x1: ");
        coordenadas.setx1(en.nextDouble());
        System.out.print("Longitud y1: ");
        coordenadas.sety1(en.nextDouble());        
        System.out.print("Latitud x2: ");
        coordenadas.setx2(en.nextDouble());
        System.out.print("Longitud y2: ");
        coordenadas.sety2(en.nextDouble());
        
        en.close();
       
       System.out.println("La distancia entre los dos puntos es: "+coordenadas.calculoDistancia());

        
    }
}
