package CasoEstudioUTEC;

public class Perfil {
    private String nombre;
    private String correoElectronico;
    private String rol;
    private boolean activo;

    public Perfil(String nombre, String correoElectronico, String rol, boolean activo) {
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
        this.rol = rol;
        this.activo = activo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCorreoElectronico() {
        return correoElectronico;
    }
    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    public String getRol() {
        return rol;
    }
    public void setRol(String rol) {
        this.rol = rol;
    }
    public boolean isActivo() {
        return activo;
    }
    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public void mostrarPerfil() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Correo: " + correoElectronico);
        System.out.println("Rol: " + rol);
        System.out.println("Activo: " + (activo ? "Si" : "No"));
    }
}
