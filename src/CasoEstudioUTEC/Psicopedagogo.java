package CasoEstudioUTEC;

public class Psicopedagogo extends Usuario{
    private String especialidad;

    // CONSTRUCTOR
    public Psicopedagogo(String nombre, String email, String contrasenia, String especialidad) {
        super(nombre, email, contrasenia);
        this.especialidad = especialidad;
    }

    // METODO GET Y SET
    public String getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    // METODO toString
    @Override
    public String toString() {
        return "Psicopedagogo {" +
                "nombre='" + getNombre() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", especialidad='" + especialidad + '\'' +
                '}';
    }
}
