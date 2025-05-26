package CasoEstudioUTEC;

public class Usuario {
    private String nombre;
    private String email;
    private String contrasenia;

    // CONSTRUCTOR
    public Usuario(String nombre, String email, String contrasenia) {
        this.nombre = nombre;
        this.email = email;
        this.contrasenia = contrasenia;
    }

    // METODOS GET Y SET
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // METODO PARA VALIDAR EMAIL DEL USUARIO
    public boolean validarEmail(String email) {
        return email != null && email.matches("^[A-Za-z0-9+_.-]+@estudiantes\\.utec\\.edu\\.uy$");
    }

    // METODO PARA CAMBIAR CONTRASEÑA DEL USUARIO
    public void cambiarContrasenia(String nuevaContrasenia) {
        this.contrasenia = nuevaContrasenia;
    }

    // METODO toString
    @Override
    public String toString() {
        return "Usuario {" +
                "nombre=" + getNombre() +
                ", email='" + getEmail() + '\'' +
                '}';
    }
}
