package CasoEstudioUTEC;

public class Auditor extends Usuario {
    private String areaAsignada;

    // Constructor principal de la clase.
    public Auditor(String nombre, String email, String contrasenia, String areaAsignada) {
        super(nombre, email, contrasenia);
        this.areaAsignada = areaAsignada;
    }

    // Metodo Get y Set.
    public String getAreaAsignada() {
        return areaAsignada;
    }
    public void setAreaAsignada(String areaAsignada) {
        this.areaAsignada = areaAsignada;
    }

    // Metodo toString.
    @Override
    public String toString() {
        return "Auditor{" +
                "nombre='" + getNombre() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", areaAsignada='" + areaAsignada + '\'' +
                '}';
    }
}
