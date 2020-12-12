/*
 * REGISTRO DE PRESONAS QUE INGRESARON
 */
package entidad;

import java.util.ArrayList;
import java.util.List;


public class ColeccionRegistros {
    
    //public static List<Persona> listaPersonas = new ArrayList<Persona>();
    public static List<Registro> listaRegistros = new ArrayList<Registro>();

    //CONSTRUCTOR STATIC
    static{
        
        Persona p = new Administrador(73653000,"Jhoel Rene","Mamani Huanca","jhoelrn","","",1);
        Bus b = new BusEstandar("BUS999",30,2015,"Arequipa99","Lima99",50);
        Fechas f = new Fechas("1 de diciembre", "25 de diciembre", "4am", "5pm");
        
        listaRegistros.add(new RegistroGeneral(p,b,f));
        //listaRegistros.add(e);
        //    public RegistroGeneral(Persona cliente, Bus busElegido, Fechas horario) {


        /*//recordar que         public Administrador(int dni, String nombre, String apellido, String username, String correo, String password, int accesibilidad) 
        listaPersonas.add(new Administrador(73653000,"Jhoel Rene","Mamani Huanca","jhoelrn","","",1));//1
        listaPersonas.add(new Administrador(73653000,"Jhoel Rene","Mamani Huanca","jhoelrn","u17106156@utp.edu.pe","jhoelrn123",1));//1
        listaPersonas.add(new Administrador(73653001,"Alonso","Huayta Fuentes","alonso","U18103716@utp.edu.pe","alonso123",1));//2
        listaPersonas.add(new Administrador(73653002,"Kevin Antony","Samillan Yupanqui","kevin","kevin@hotmail.com","kevin123",1));//3
        listaPersonas.add(new Administrador(73653003,"Alexander","Gutierrez Maldonado","alexander","alexander@hotmail.com","alexander123",1));//4
        listaPersonas.add(new Administrador(73653004,"Johan Edson","Castañeda Ponce","johan","johan@outlook.com","johan123",1));//5
        listaPersonas.add(new Administrador(73653005,"Jean","Perez Quijia","jean","jean@ieee.org.pe","jean123",1));//6*/
    }
    
}
