package CasoEstudioUTEC;

public class Administrador extends Usuario {
    private int idAdministrador;

    // Constructor principal de la clase.
    public Administrador(String nombre, String email, String contrasenia, int idAdministrador) {
        super(nombre, email, contrasenia);
        this.idAdministrador = idAdministrador;
    }

    // Metodo Get y Set.
    public int getIdAdministrador() {
        return idAdministrador;
    }
    public void setIdAdministrador(int idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    // Metodo toString.
    @Override
    public String toString() {
        return "Administrador{" +
                "idAdministrador=" + idAdministrador +
                ", nombre='" + getNombre() + '\'' +
                ", email='" + getEmail() + '\'' +
                '}';
    }
}
