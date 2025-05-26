package CasoEstudioUTEC;

public class Auditor extends Usuario {
    private String areaAsignada;

    // CONSTRUCTOR
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
