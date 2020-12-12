/*
 * CLASE ABSTRACTA GENERAL
 */
package controlador;

import entidad.*;
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author USUARIO
 */
public abstract class RegistroController {
    //METODOS ABSTRACTOS
    public abstract boolean Registrar(ColeccionRegistros lista , Persona perNuevo, Bus busNuevo, Fechas fecNuevo);
    //public abstract int Modificar(ColeccionPersonas lista, Persona editado, int indice);
    //public abstract int Eliminar(ColeccionPersonas lista, Persona eliminado);
    public abstract List<Registro> MostrarTodos(ColeccionRegistros lista);
    //public abstract Persona MostrarUno(ColeccionPersonas lista,String correo, String password);
    //public abstract String ToString(Persona persona);
    public abstract int BuscarIndice(ColeccionRegistros lista , Persona editado);//guarda la posicion...sirve para el metodo modificar y buscar

    

    
    
}
