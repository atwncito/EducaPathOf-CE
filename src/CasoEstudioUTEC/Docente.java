package CasoEstudioUTEC;

public class Docente extends Usuario {
    private String areaEncargada;

    // Constructor principal de la clase.
    public Docente(String nombre, String email, String contrasenia, String areaEncargada) {
        super(nombre, email, contrasenia);
        this.areaEncargada = areaEncargada;
    }

    // Metodo Get y Set.
    public String getAreaEncargada() {
        return areaEncargada;
    }
    public void setAreaEncargada(String areaEncargada) {
        this.areaEncargada = areaEncargada;
    }

    // Metodo toString.
    @Override
    public String toString() {
        return "Docente{" +
                "nombre='" + getNombre() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", areaEncargada='" + areaEncargada + '\'' +
                '}';
    }
}
