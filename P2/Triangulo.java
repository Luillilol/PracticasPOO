package mx.unam.fi.poo.g1.p2;

/**
 * Clase Triangulo
 * @author González Falcón Luis Adrián
 * @version Septiembre-2024
 */
public class Triangulo {
    private int filas, numero;
    
    /**
     * Método constructor 
     * Para construir objetos Triangulo
     * @param filas -> Atributo para las filas del triangulo (altura)
     */
    public Triangulo(int filas){
        setFilas(filas);
    }

    /**
     * Método get
     * @return filas -> Regresa el atributo filas 
     */
    public int getFilas(){
        return filas;
    }
    /**
     * Método set
     * @param filas -> Para cambiar el dato de filas del Triangulo
     */
    public void setFilas(int filas){
        this.filas = filas;
    }

    /**
     * Método get
     * @return numero -> Regresa el atributo numero 
     */
    public int getNumero(){
        return numero;
    }
    /**
     * Método set
     * @param numero -> Para cambiar el dato de numero del Triangulo
     */
    public void setNumero(int numero){
        this.numero = numero;
    }

    /**
     * Método para calcular e imprimir los números del triángulo
     */
    public void calcularNumeros(){
        for (int i = 0; i < getFilas(); i++) {
            //imprimir espacios
            for (int j = 0; j < getFilas()-i; j++) {
                System.out.print(" ");
            }
            //calcular números:
            setNumero(1);
            for(int k = 0;k<=i; k++){            
                System.out.print(getNumero() + " ");
                //numero siguiente
                setNumero(getNumero() * (i-k) / (k+1));
            }
            System.out.println();
        }
    }


    
}
