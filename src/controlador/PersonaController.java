/*
 * CLASE ABSTRACTA
 */
package controlador;
import entidad.*;
import java.util.ArrayList;
import java.util.List;



public abstract class PersonaController {
    //METODOS ABSTRACTOS
    public abstract boolean Registrar(ColeccionPersonas lista , Persona nuevo);
    public abstract int Modificar(ColeccionPersonas lista, Persona editado, int indice);
    public abstract int Eliminar(ColeccionPersonas lista, Persona eliminado);
    public abstract List<Persona> MostrarTodos(ColeccionPersonas lista);
    public abstract Persona MostrarUno(ColeccionPersonas lista,String correo, String password);
    public abstract String ToString(Persona persona);
    public abstract int BuscarIndice(ColeccionPersonas lista , Persona editado);//guarda la posicion...sirve para el metodo modificar

    
}
