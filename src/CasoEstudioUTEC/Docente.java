package CasoEstudioUTEC;

public class Docente extends Usuario {
    private String areaEncargada;

    // CONSTRUCTOR
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
