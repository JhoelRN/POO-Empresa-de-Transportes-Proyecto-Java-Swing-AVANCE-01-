/*
 * CLASE DERIVADA de clase PERSONA
 */
package entidad;


public class Usuario extends Persona {

    public Usuario(int dni, String nombre, String apellido, String username, String correo, String password, int accesibilidad) {
        super(dni, nombre, apellido, username, correo, password, accesibilidad);
    }

    
}
