/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USUARIO
 */
public class ColeccionBuses {
    public static List<Bus> listaBuses = new ArrayList<Bus>();
    //CONSTRUCTOR STATIC
    static{
        //recordar que          public BusEstandar(String nombreBus, int cantidadAsientos, int añobus, String origen, String destino, double precioPorKm) {
        listaBuses.add(new BusEstandar("Bus001",30,2015,"Arequipa","Lima",50));
        listaBuses.add(new BusEstandar("Bus002",35,2015,"Arequipa","Lima",50));
        listaBuses.add(new BusEstandar("Bus003",20,2015,"Arequipa","Lima",50));
        listaBuses.add(new BusEstandar("Bus004",32,2015,"Arequipa","Lima",50));
        listaBuses.add(new BusEstandar("Bus005",31,2015,"Arequipa","Lima",50));
        listaBuses.add(new BusEstandar("Bus006",38,2015,"Arequipa","Lima",50));
        listaBuses.add(new BusEstandar("Bus007",40,2015,"Arequipa","Lima",50));
        listaBuses.add(new BusEstandar("Bus008",35,2015,"Arequipa","Lima",50));
        listaBuses.add(new BusEstandar("Bus009",36,2015,"Arequipa","Lima",50));
        listaBuses.add(new BusEstandar("Bus010",32,2015,"Arequipa","Lima",50));
        listaBuses.add(new BusEstandar("Bus011",33,2015,"Arequipa","Lima",50));
        listaBuses.add(new BusEstandar("Bus012",31,2015,"Arequipa","Lima",50));
        listaBuses.add(new BusEstandar("Bus013",30,2015,"Arequipa","Lima",50));
 
    }
    
}
