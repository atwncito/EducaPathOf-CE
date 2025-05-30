package CasoEstudioUTEC;

/**
 * Clase que representa un docente dentro del sistema.
 * Hereda de la clase Usuario y añade el atributo del área o materia de la que está encargado.
 */
public class Docente extends Usuario {

    // ATRIBUTO PRIVADO
    private String areaEncargada;       // Materia o area de la que esta encargado el docente

    // CONSTRUCTOR DE LA CLASE
    public Docente(String nombre, String email, String contrasenia, String areaEncargada) {
        super(nombre, email, contrasenia);
        this.areaEncargada = areaEncargada;
    }

    // METODO GET Y SET
    public String getAreaEncargada() {
        return areaEncargada;
    }
    public void setAreaEncargada(String areaEncargada) {
        this.areaEncargada = areaEncargada;
    }

    // METODO toString
    @Override
    public String toString() {
        return "Docente {" +
                "nombre='" + getNombre() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", areaEncargada='" + areaEncargada + '\'' +
                '}';
    }
}
