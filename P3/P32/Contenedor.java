package mx.unam.fi.poo.g1.p32;

import java.util.ArrayList;
/**
 * Clase Contenedor
 * @author González Falcón Luis Adrián
 * @version Septiembre-2024
 */
public class Contenedor{
    private ArrayList<String> lista;

    /**
     * Método constructor de la clase Contenedor
     */
    public Contenedor( ){
        this.lista = new ArrayList<>();
    }

    /**
     *  Método set
     * @param lista -> Para cambiar el atributo lista
     */
    public void setLista(ArrayList lista) {
        this.lista = lista;
    }
    /**
     * Método get
     * @return lista -> Regresa el atributo lista
     */
    public ArrayList getLista() {
        return lista;
    }

    /**
     * Método para añadir elementos al contenedor de la clase
     * @param nombre -> Elemento String a agregar
     */
    public void agregarElemento(String nombre){
        getLista().add(nombre);
    }

    /**
     * Método para mostrar los elementos del contenedor
     */
    public void mostrarContenedor(){
        for (int i = 0; i < 7; i++) {
            System.out.println(getLista().get(i));
        }
    }

    /**
     * Método para sustiuir un valor en el indice indicado
     * @param indice -> Indica el índice donde se va a realizar la sustitución
     * @param nombre -> Contiene el String que va a sustiuir
     */
    public void sustituirElemento(int indice, String nombre){
        getLista().set(indice, nombre);
    }
}
