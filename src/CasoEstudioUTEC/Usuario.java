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

    // Metodos Getters y setters.
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
