package CasoEstudioUTEC;

/**
 * Clase que representa un auditor dentro del sistema.
 * Hereda de la clase Usuario y añade el atributo del área asignada al auditor.
 */
public class Auditor extends Usuario {

    // ATRIBUTO PRIVADO
    private String areaAsignada;        // Area a la que pertenece el auditor

    // CONSTRUCTOR DE LA CLASE
    public Auditor(String nombre, String email, String contrasenia, String areaAsignada) {
        super(nombre, email, contrasenia);
        this.areaAsignada = areaAsignada;
    }

    // METODO GET Y SET
    public String getAreaAsignada() {
        return areaAsignada;
    }
    public void setAreaAsignada(String areaAsignada) {
        this.areaAsignada = areaAsignada;
    }

    // METODO toString
    @Override
    public String toString() {
        return "Auditor {" +
                "nombre='" + getNombre() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", areaAsignada='" + areaAsignada + '\'' +
                '}';
    }
}
