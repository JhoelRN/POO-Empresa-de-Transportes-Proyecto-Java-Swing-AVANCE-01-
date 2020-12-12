/*
 * CLASE PADRE... SUS CLASES DERIVADAS SON FECHAIDA FECHAREGRESO
 */
package entidad;

/**
 *
 * @author USUARIO
 */
public class Fechas {
    
    private String fechaIda;
    private String fechaRegereso;
    private String horaPartida;
    private String Retorno;

    public Fechas(String fechaIda, String fechaRegereso, String horaPartida, String Retorno) {
        this.fechaIda = fechaIda;
        this.fechaRegereso = fechaRegereso;
        this.horaPartida = horaPartida;
        this.Retorno = Retorno;
    }

    public String getFechaIda() {
        return fechaIda;
    }

    public void setFechaIda(String fechaIda) {
        this.fechaIda = fechaIda;
    }

    public String getFechaRegereso() {
        return fechaRegereso;
    }

    public void setFechaRegereso(String fechaRegereso) {
        this.fechaRegereso = fechaRegereso;
    }

    public String getHoraPartida() {
        return horaPartida;
    }

    public void setHoraPartida(String horaPartida) {
        this.horaPartida = horaPartida;
    }

    public String getRetorno() {
        return Retorno;
    }

    public void setRetorno(String Retorno) {
        this.Retorno = Retorno;
    }
    
    
    
    
    
    
    
}
