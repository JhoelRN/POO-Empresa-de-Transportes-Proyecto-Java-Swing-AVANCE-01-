// CLASE ABSTRACTA PADRE
package entidad;


public class Persona {
    private String nombre; // Nombre completo de persona
    private String apellido; // 
    private String username; // usuario 
    private String correo; // correo para ingresar login
    private String password; // contraseña para ingresar login
    private int accesibilidad; //este será una variable para diferenciar accesibilidad como administrador o usuario
    private int dni;  // será usado como código
    
    /*
    accesibilidad >= 0  . . . => ADMINISTRADOR
    accesibilidad < 0   . . . => USUARIO CLIENTE
    */

    public Persona(int dni, String nombre, String apellido, String username, String correo, String password, int accesibilidad) {
        super();
        this.nombre = nombre;
        this.apellido = apellido;
        this.username = username;
        this.correo = correo;
        this.password = password;
        this.accesibilidad = accesibilidad;
        this.dni = dni;
    }
    
    //METODOS GETTER & SETTER
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAccesibilidad() {
        return accesibilidad;
    }

    public void setAccesibilidad(int accesibilidad) {
        this.accesibilidad = accesibilidad;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
    
    
}
