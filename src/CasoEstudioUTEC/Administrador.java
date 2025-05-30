package CasoEstudioUTEC;

/**
 * Clase que representa un administrador dentro del sistema.
 * Hereda de la clase Usuario y añade un identificador único para el administrador.
 */
public class Administrador extends Usuario {

    // ATRIBUTO PRIVADO
    private int idAdministrador;            // Id del administrador

    // CONSTRUCTOR DE LA CLASE
    public Administrador(String nombre, String email, String contrasenia, int idAdministrador) {
        super(nombre, email, contrasenia);
        this.idAdministrador = idAdministrador;
    }

    // METODO GET Y SET
    public int getIdAdministrador() {
        return idAdministrador;
    }
    public void setIdAdministrador(int idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    // METODO toString
    @Override
    public String toString() {
        return "Administrador {" +
                "idAdministrador=" + idAdministrador +
                ", nombre='" + getNombre() + '\'' +
                ", email='" + getEmail() + '\'' +
                '}';
    }
}
