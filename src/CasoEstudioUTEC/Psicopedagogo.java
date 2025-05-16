package CasoEstudioUTEC;

public class Psicopedagogo extends Usuario{
    private String especialidad;

    // Constructor principal de la clase.
    public Psicopedagogo(String nombre, String email, String contrasenia, String especialidad) {
        super(nombre, email, contrasenia);
        this.especialidad = especialidad;
    }

    // Metodo Get y Set.
    public String getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    // Metodo toString.
    @Override
    public String toString() {
        return "Psicopedagogo{" +
                "nombre='" + getNombre() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", especialidad='" + especialidad + '\'' +
                '}';
    }
}
