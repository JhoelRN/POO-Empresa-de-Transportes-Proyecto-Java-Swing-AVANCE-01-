/*
 * CLASE PADRE Y sus clases derivadas son Bus Estandar, Bus Ejecutivo, Bus VIP
 */
package entidad;



public class Bus {
    
    private String nombreBus;
    private int cantidadAsientos;
    private int añobus;
    private String origen;
    private String destino;
    private double precioPorKm;
    
    //CONSTRUCTOR
    public Bus(String nombreBus, int cantidadAsientos, int añobus, String origen, String destino, double precioPorKm) {
        super();
        this.nombreBus = nombreBus;
        this.cantidadAsientos = cantidadAsientos;
        this.añobus = añobus;
        this.origen = origen;
        this.destino = destino;
        this.precioPorKm = precioPorKm;
    }
    
    //METODOS GETTER & SETTER
    public String getNombreBus() {
        return nombreBus;
    }

    public void setNombreBus(String nombreBus) {
        this.nombreBus = nombreBus;
    }

    public int getCantidadAsientos() {
        return cantidadAsientos;
    }

    public void setCantidadAsientos(int cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }

    public int getAñobus() {
        return añobus;
    }

    public void setAñobus(int añobus) {
        this.añobus = añobus;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getPrecioPorKm() {
        return precioPorKm;
    }

    public void setPrecioPorKm(double precioPorKm) {
        this.precioPorKm = precioPorKm;
    }
    
    
    
    
}
