/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author USUARIO
 */
public class Registro {
    
    private Persona cliente; // cliente!
    private Bus busElegido;
    private Fechas horario;

    public Registro(Persona cliente, Bus busElegido, Fechas horario) {
        super();
        this.cliente = cliente;
        this.busElegido = busElegido;
        this.horario = horario;
    }

    public Persona getCliente() {
        return cliente;
    }

    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }

    public Bus getBusElegido() {
        return busElegido;
    }

    public void setBusElegido(Bus busElegido) {
        this.busElegido = busElegido;
    }

    public Fechas getHorario() {
        return horario;
    }

    public void setHorario(Fechas horario) {
        this.horario = horario;
    }
    
    
    
    
}
