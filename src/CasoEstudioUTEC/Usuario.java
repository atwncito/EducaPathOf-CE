package CasoEstudioUTEC;

/**
 * Clase que representa un Usuario del sistema.
 * Contiene información básica como nombre, email y contraseña.
 * Proporciona métodos para validar el email y cambiar la contraseña.
 */
public class Usuario {

    // ATRIBUTOS PRIVADOS
    private String nombre;          // Nombre del usuario
    private String email;           // Email del usuario
    private String contrasenia;     // Contrasenia del usuario

    // CONSTRUCTOR DE LA CLASE
    public Usuario(String nombre, String email, String contrasenia) {
        if (contrasenia == null || contrasenia.length() < 8) {
            throw new IllegalArgumentException("La contraseña debe tener al menos 8 caracteres.");
        }
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