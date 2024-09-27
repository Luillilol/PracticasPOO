package mx.unam.fi.poo.g1.p31;

/**
 * Clase Cadena
 * @author González Falcón Luis Adrián
 * @version Septiembre-2024
 */
public class Cadena {
    private String cad, c, d;

    /**
     * Método constructor 
     * Para construir objeto Cadena
     * @param cad -> Atributo para la cadena original.
     */
    public Cadena(String cad){
        setCad(cad);
    }

    /**
     * Método get 
     * @return cad -> Regresa el atributo cad
     */
    public String getCad(){
        return cad;
    }
    /**
     * Método set
     * @param cad -> Para cambiar el dato de cad de Cadena
     */
    public void setCad(String cad){
        this.cad = cad;
    }

    /**
     * Método get 
     * @return c -> Regresa el atributo c
     */
    public String getC(){
        return c;
    }
    /**
     * Método set
     * @param c -> Para cambiar el dato de c de Cadena
     */
    public void setC(String c){
        this.c = c;
    }

    /**
     * Método get 
     * @return d -> Regresa el atributo d
     */
    public String getD(){
        return d;
    }
    /**
     * Método set
     * @param d -> Para cambiar el dato de d de Cadena
     */
    public void setD(String d){
        this.d = d;
    }

    /**
     * Método para reemplazar caracteres en la cadena
     * @return cad2 -> Cadena modificada
     */
    public String reemplazarCaracter(){
        String cad2 = cad.replace(c, d);
        return cad2;
    }
    
}
