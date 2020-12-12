/*
    CLASE DERIVADA
*/
package controlador;
import entidad.*;
import java.util.ArrayList;
import java.util.List;


public class AdministradorController extends PersonaController{
    
    @Override
    public boolean Registrar(ColeccionPersonas lista,Persona nuevo) {//añadir un vehiculo a la coleccion
        boolean resp = true; //variable para 
        resp = lista.listaPersonas.add(nuevo);
        return resp;
        //lista.listaVehiculos.add(nuevo);
    }

    @Override
    public int Modificar(ColeccionPersonas lista,Persona editado, int indice) {
        
        Persona actualizado = lista.listaPersonas.set(indice, editado);
        
        if(actualizado != null){//no hay algun vehiculo actualizado?
            return indice;
        }
        else{
            return -1;
        }
    }

    @Override
    public int Eliminar(ColeccionPersonas lista,Persona eliminado) {
        int posicion = lista.listaPersonas.indexOf(eliminado);
        if(posicion != -1)
        {
            lista.listaPersonas.remove(posicion);
            return posicion;
        }
        else
        {
            System.out.println("El objeto no existe");
            return -1;
        }
    }

    @Override
    public List<Persona> MostrarTodos(ColeccionPersonas lista) {   
        
        ArrayList<Persona> listaAdmins = new ArrayList();
    
        for(Persona iterador : lista.listaPersonas) {
            if(iterador instanceof Administrador){// pregunta si es "Administrador"
                Administrador admin = (Administrador)iterador;
                System.out.println(this.ToString(iterador));
               
                listaAdmins.add(admin);
            }
        }
        return listaAdmins;    
    }

    @Override
    public Persona MostrarUno(ColeccionPersonas lista, String correo, String password){//retorna objeto admnistrador
        
        Administrador adminBuscado = null;
        
        for(Persona iterador : lista.listaPersonas){ //recorre
            if(    (iterador instanceof Administrador) 
                    && ((((Administrador)iterador).getCorreo()).equalsIgnoreCase(correo))
                    && ((((Administrador)iterador).getPassword()).equalsIgnoreCase(password))   ) {//busqueda por "correo" y "contraseña"
                adminBuscado = (Administrador)iterador;
            }
        }
        return adminBuscado;
    }
    
    @Override
    public int BuscarIndice(ColeccionPersonas lista, Persona editado){
        int indice = 0;
        indice = lista.listaPersonas.indexOf(editado);
        return indice; // le damos un objeto y nos devuelve en que posicion se encuentra este. en la lista
    }
    
    
    
    

    @Override
    public String ToString(Persona individuo) {
        
        StringBuilder sbDatos = new StringBuilder("DATOS DE LA PERSONA\n-----------------------\n");
		sbDatos.append(" - DNI : " +individuo.getDni());
		sbDatos.append("\n - Nombres : " + individuo.getNombre());
		sbDatos.append("\n - Apellidos : " + individuo.getApellido());
		sbDatos.append("\n - Username : " + individuo.getUsername());
		sbDatos.append("\n - Correo : " + individuo.getCorreo());
		sbDatos.append("\n - Password : " + individuo.getPassword());
		sbDatos.append("\n - Accesibilidad : " + individuo.getAccesibilidad() + "\n");
	return sbDatos.toString();
    }
    
}
