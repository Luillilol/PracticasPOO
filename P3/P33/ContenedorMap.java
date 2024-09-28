package mx.unam.fi.poo.g1.p33;

import java.util.HashMap;

/**
 * Clase ContenedorMap
 * @author González Falcón Luis Adrián
 * @version Septiembre-2024
 */

public class ContenedorMap {
    private HashMap<Integer, String> contenedorMap;

    /**
     * Método constructor de la clase ContenedorMap
     */
    public ContenedorMap(){
        this.contenedorMap = new HashMap<Integer, String>();
    }

    /**
     * Método set
     * @param contenedorMap -> Para cambiar contenedorMap
     */
    public void setContenedorMap(HashMap<Integer,String> contenedorMap){
        this.contenedorMap = contenedorMap;
    }
    /**
     * Método get
     * @return contenedorMap -> Regresa el atributo contenedorMap
     */
    public HashMap<Integer, String> getContenedorMap(){
        return contenedorMap;
    }

    /**
     * Método para obtener un elemento de contenedorMap
     * @param key -> Llave para acceder al elemento
     * @return Elemento indicado en el key
     */
    public String obtenerElemento(int key){
        return getContenedorMap().get(key);
    }
    
}
