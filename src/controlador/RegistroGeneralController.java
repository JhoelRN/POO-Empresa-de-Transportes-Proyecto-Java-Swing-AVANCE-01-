/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import entidad.*;
import java.util.List;

/**
 *
 * @author USUARIO
 */
public class RegistroGeneralController extends RegistroController{

    @Override
    public boolean Registrar(ColeccionRegistros lista, Persona perNuevo, Bus busNuevo, Fechas fecNuevo) {// añadir un registro a la coleccion
        boolean resp = true;
        resp = lista.listaRegistros.add(new RegistroGeneral(perNuevo,busNuevo,fecNuevo));
        
        return resp;
    }

    @Override
    public List<Registro> MostrarTodos(ColeccionRegistros lista) {
        
        return null;
    }

    @Override
    public int BuscarIndice(ColeccionRegistros lista, Persona editado) {
        int indice = 0;
        indice = lista.listaRegistros.indexOf(editado);
        return indice; // le damos un objeto y nos devuelve en que posicion se encuentra este. en la lista
    }
    
    
    
    
}
