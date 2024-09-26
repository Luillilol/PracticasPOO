package mx.unam.fi.poo.g1.p1;

import java.lang.Math;
public class Coordenadas {
    private final double radio = 6371.01;

    private double x1, y1, x2, y2;
    /**
     * Método constructor
     */
    public Coordenadas(){}

    /**
     * Método get
     * @return radio -> Regresa el atributo radio
     */
    public double getradio(){
        return this.radio;
    }

    /**
     * Método set
     * @param x1 -> Para cambiar el dato de x1 de Coordenadas
     */
    public void setx1(double x1){
        this.x1 = x1;
    }
    /**
     * Método get
     * @return x1 -> Regresa el atributo x1
     */
    public double getx1(){
        return x1;
    }

    /**
     * Método set
     * @param y1 -> Para cambiar el dato de y1 de Coordenadas
     */
    public void sety1(double y1){
        this.y1 = y1;
    }
    /**
     * Método get
     * @return y1 -> Regresa el atributo y1
     */
    public double gety1(){
        return y1;
    }

    /**
     * Método set
     * @param x2 -> Para cambiar el dato de x2 de Coordenadas
     */
    public void setx2(double x2){
        this.x2 = x2;
    }
    /**
     * Método get
     * @return x2 -> Regresa el atributo x2
     */
    public double getx2(){
        return x2;
    }

    /**
     * Método set
     * @param y2 -> Para cambiar el dato de y2 de Coordenadas
     */
    public void sety2(double y2){
        this.y2 = y2;
    }
    /**
     * Método get
     * @return y2 -> Regresa el atributo y2
     */
    public double gety2(){
        return y2;
    }


    /**
     * Método para convertir grados a radianes
     * @param grados -> Grados a convertir a radianes
     * @return rad -> Radianes convertidos
     */
    public double convRad(double grados){
        double rad = (grados*Math.PI)/180;
        return rad;
    }
    /**
     * Método para calcular Distancia entre las coordenadas dadas
     * @return distancia -> Distancia entre los dos puntos dados
     */
    public double calculoDistancia(){
        double distancia ;
        distancia =  getradio() * (Math.acos(Math.sin(convRad(x1)) *
        Math.sin(convRad(x2)) + Math.cos(convRad(x1)) * Math.cos(convRad(x2)) *
        Math.cos(convRad(y2-y1)) ));
        return distancia;
    }

        /*distancia = radio * (Math.acos(Math.sin(convRad(x1)) * 
    Math.sin(convRad(x2)) + Math.cos(convRad(x1)) * Math.cos(convRad(x2)) * 
    Math.cos(convRad(y2-y1)) ));*/

}

