package mx.unam.fi.poo.g1.p4;

/**
 * Clase CuentaBanco
 * @author González Falcón Luis Adrián
 * @version Septiembre-2024
 */
public class CuentaBanco {
    private String nombre;
    private int cuenta;
    private double depositoInicial;

    /**
     * Método constructor de clase CuentaBanco cuando se ingresan valores de nombre, cuenta y depositoInicial
     * @param nombre -> Atributo para el nombre de la cuenta
     * @param cuenta -> Atributo para la cuenta
     * @param depositoInicial -> Atributo para el deposito inicial
     */
    public CuentaBanco(String nombre, int cuenta ,double depositoInicial){
        setNombre(nombre);
        setCuenta(cuenta);
        setDepositoInicial(depositoInicial);
    }

    /**
     * Método constructor de clase CuentaBanco cuando se ingresan valores para nombre y cuenta
     * @param nombre -> Atributo para el nombre de la cuenta
     * @param cuenta -> Atributo para la cuenta
     */
    public CuentaBanco(String nombre, int cuenta){
        setNombre(nombre);
        setCuenta(cuenta);
        setDepositoInicial(0.0);
    }


    /**
     * Método set
     * @param nombre -> Para cambiar el atributo nombre
     */
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    /**
     * Método get
     * @return nombre -> Regresa el atributo nombre
     */
    public String getNombre(){
        return nombre;
    }

    /**
     * Método set
     * @param cuenta -> Para cambiar el atributo cuenta
     */
    public void setCuenta(int cuenta){
        this.cuenta = cuenta;
    }
    /**
     * Método get
     * @return cuenta -> Regresa el atributo cuenta
     */
    public int getCuenta(){
        return cuenta;
    }

    /**
     * Método set
     * @param depositoInicial -> Para cambiar el atributo depositoInicial
     */
    public void setDepositoInicial(double depositoInicial){
        this.depositoInicial = depositoInicial;
    }
    /**
     * Método get
     * @return depositoInicial -> Regresa el atributo depositoInicial
     */
    public double getDepositoInicial(){
        return depositoInicial;
    }

    //depositar, retirar dinero y detalles cuenta 

    /**
     * Método para retirar dinero de CuentaBancos
     * @param cantidad -> Cantidad de dinero que se quiere retirar
     */
    public void retirarDinero(double cantidad){
        System.out.println("Dinero a retirar: $"+cantidad);
        if (getDepositoInicial()>=cantidad) {
            this.depositoInicial -= cantidad;
            System.out.println("Dinero actual: $"+getDepositoInicial());
        }else{
            System.out.println("No hay suficientes fondos.");
        }
    }

    /**
     * Método para depositar dinero a CuentaBanco
     * @param cantidad -> Cantidad de dinero que se va a depositar
     */
    public void depositarDinero(double cantidad){
        this.depositoInicial+=cantidad;
        System.out.println("Depósito: $"+cantidad+"\nDinero actual: $"+getDepositoInicial());
    }

    /**
     * Método para mostrar los valores de la clase CuentaBanco
     * @return -> Cadena que contiene la informacion de la clase
     */
    public String detallesCuenta(){
        return "Nombre: "+getNombre()
                +"\nCuenta: "+getCuenta()
                +"\nDeposito inicial: "+getDepositoInicial();
    }
}
