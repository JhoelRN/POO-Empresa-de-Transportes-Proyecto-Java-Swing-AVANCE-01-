/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import entidad.*;
import java.util.List;
import java.util.ArrayList;

public abstract class BusController {
        //METODOS ABSTRACTOS
    public abstract boolean Registrar(ColeccionBuses lista , Bus nuevo);
    public abstract int Modificar(ColeccionBuses lista, Bus editado, int indice);
    public abstract int Eliminar(ColeccionBuses lista, Bus eliminado);
    public abstract List<Persona> MostrarTodos(ColeccionBuses lista);
    public abstract Persona MostrarUno(ColeccionBuses lista,String correo, String password);
    public abstract String ToString(Bus vehiculo);
    public abstract int BuscarIndice(ColeccionBuses lista , Bus editado);//guarda la posicion...sirve para el metodo modificar
}
