package CasoEstudioUTEC;

public class Usuario {
    private String nombre;
    private String email;
    private String contrasenia;

    // Constructor principal de la clase.
    public Usuario(String nombre, String email, String contrasenia) {
        this.nombre = nombre;
        this.email = email;
        this.contrasenia = contrasenia;
    }

    // Metodo get para nombre del usuario.
    public String getNombre() {
        return nombre;
    }

    // Metodo set para nombre del usuario.
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Metodo get para Email del usuario.
    public String getEmail() {
        return email;
    }

    // Metodo set para Email del usuario.
    public void setEmail(String email) {
        this.email = email;
    }

    // Metodo para validar el Email del usuario.
    public boolean validarEmail(String email) {
        return email != null && email.matches("^[A-Za-z0-9+_.-]+@estudiantes\\.utec\\.edu\\.uy$");
    }

    // Metodo para cambiar contraseña del usuario.
    public void cambiarContrasenia(String nuevaContrasenia) {
        this.contrasenia = nuevaContrasenia;
    }

    // Metodo toString
    @Override
    public String toString() {
        return "Usuario: " + nombre;
    }
}
