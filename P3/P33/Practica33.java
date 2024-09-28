package mx.unam.fi.poo.g1.p33;

import mx.unam.fi.poo.g1.p33.ContenedorMap;
import java.util.Scanner;

/**
 * Clase principal de la Practica 3_3
 * @author González Falón Luis Adrián
 * @version Septiembre-2024
 */
public class Practica33 {
    /**
     * Método main 
     * Se ejecuta todo el funcionamiento de la aplicación
     * @param args -> Arreglo por defecto del método main.
     */
    public static void main(String[] args) {
        Scanner es = new Scanner(System.in);
        ContenedorMap contenedorMap = new ContenedorMap();
        int key;

        contenedorMap.getContenedorMap().put(1, "Golden Retriever");
        contenedorMap.getContenedorMap().put(2, "Corgi");
        contenedorMap.getContenedorMap().put(3, "Dalmata");
        contenedorMap.getContenedorMap().put(4, "Bulldog");
        contenedorMap.getContenedorMap().put(5, "Xoloitzcuincle");
        contenedorMap.getContenedorMap().put(6, "Pastor Aleman");
        contenedorMap.getContenedorMap().put(7, "Beagle");
        contenedorMap.getContenedorMap().put(8, "Chihuahua");
        contenedorMap.getContenedorMap().put(9, "Salchicha");
        contenedorMap.getContenedorMap().put(10, "Labrador");


        do{
            System.out.println("Ingresa la llave para saber el nombre del perrito (1-10)");
            key = es.nextInt();
        }while (!contenedorMap.getContenedorMap().containsKey(key));

        System.out.println("El perrito es: "+contenedorMap.obtenerElemento(key));

    }
    
}
