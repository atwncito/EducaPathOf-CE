package CasoEstudioUTEC;

/**
 * Clase que representa el perfil de un usuario dentro del sistema.
 * Un perfil contiene información básica como nombre, correo, rol y si está activo o no.
 */
public class Perfil {

    // ATRIBUTOS PRIVADOS
    private String nombre;               // Nombre completo del usuario
    private String correoElectronico;    // Correo electrónico institucional del usuario
    private String rol;                  // Rol del usuario en el sistema (por ejemplo: Administrador, Tutor, etc.)
    private boolean activo;              // Indica si el perfil está activo o no

    /**
     * Constructor que inicializa un perfil con los datos proporcionados.
     *
     * @param nombre Nombre del usuario
     * @param correoElectronico Correo electrónico institucional
     * @param rol Rol asignado al usuario
     * @param activo Estado del perfil (activo/inactivo)
     */
    public Perfil(String nombre, String correoElectronico, String rol, boolean activo) {
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
        this.rol = rol;
        this.activo = activo;
    }

    // MÉTODOS GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    /**
     * Muestra la información del perfil por consola en un formato legible.
     */
    public void mostrarPerfil() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Correo: " + correoElectronico);
        System.out.println("Rol: " + rol);
        System.out.println("Activo: " + (activo ? "Sí" : "No"));
    }
}