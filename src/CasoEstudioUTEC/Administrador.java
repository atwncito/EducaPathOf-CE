package CasoEstudioUTEC;

public class Administrador extends Usuario {
    private int idAdministrador;

    // CONSTRUCTOR
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
