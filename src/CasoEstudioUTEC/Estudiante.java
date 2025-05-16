package CasoEstudioUTEC;

import java.util.Date;
import java.util.LinkedList;

public class Estudiante extends Usuario {
    private String carrera;
    private String grupo;
    private String apellido;
    private int numeroCI;
    private Date fechaNacimiento;
    private String direccion;
    private int telefono;
    private int edad;
    private String foto;
    private String sistemaSalud;
    private String motivoDerivacion;
    private String estadoSalud;
    private String comentarios;
    private String tratamientos;
    private LinkedList<String> documentacionAdjunta;
    private String observacionesConfidenciales;

    // Constructor principal de la clase.
    public Estudiante(String nombre, String email, String contrasenia, String carrera, String grupo, String apellido,
                      int numeroCI, Date fechaNacimiento, String direccion, int telefono, int edad, String foto,
                      String sistemaSalud, String motivoDerivacion, String estadoSalud, String comentarios,
                      String tratamientos, LinkedList<String> documentacionAdjunta, String observacionesConfidenciales) {
        super(nombre, email, contrasenia);
        this.carrera = carrera;
        this.grupo = grupo;
        this.apellido = apellido;
        this.numeroCI = numeroCI;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.telefono = telefono;
        this.edad = edad;
        this.foto = foto;
        this.sistemaSalud = sistemaSalud;
        this.motivoDerivacion = motivoDerivacion;
        this.estadoSalud = estadoSalud;
        this.comentarios = comentarios;
        this.tratamientos = tratamientos;
        this.documentacionAdjunta = documentacionAdjunta;
        this.observacionesConfidenciales = observacionesConfidenciales;
    }

    // Metodos Geters y Setters.
    public String getCarrera() {
        return carrera;
    }
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    public String getGrupo() {
        return grupo;
    }
    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public int getNumeroCI() {
        return numeroCI;
    }
    public void setNumeroCI(int numeroCI) {
        this.numeroCI = numeroCI;
    }
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public int getTelefono() {
        return telefono;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getFoto() {
        return foto;
    }
    public void setFoto(String foto) {
        this.foto = foto;
    }
    public String getSistemaSalud() {
        return sistemaSalud;
    }
    public void setSistemaSalud(String sistemaSalud) {
        this.sistemaSalud = sistemaSalud;
    }
    public String getMotivoDerivacion() {
        return motivoDerivacion;
    }
    public void setMotivoDerivacion(String motivoDerivacion) {
        this.motivoDerivacion = motivoDerivacion;
    }
    public String getEstadoSalud() {
        return estadoSalud;
    }
    public void setEstadoSalud(String estadoSalud) {
        this.estadoSalud = estadoSalud;
    }
    public String getObservacionesConfidenciales() {
        return observacionesConfidenciales;
    }
    public void setObservacionesConfidenciales(String observacionesConfidenciales) {
        this.observacionesConfidenciales = observacionesConfidenciales;
    }
    public LinkedList<String> getDocumentacionAdjunta() {
        return documentacionAdjunta;
    }
    public void setDocumentacionAdjunta(LinkedList<String> documentacionAdjunta) {
        this.documentacionAdjunta = documentacionAdjunta;
    }

    // Metodo toString.
    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + getNombre() + '\'' +
                ", apellido='" + apellido + '\'' +
                ", email='" + getEmail() + '\'' +
                ", carrera='" + carrera + '\'' +
                ", grupo='" + grupo + '\'' +
                ", numeroCI=" + numeroCI +
                ", fechaNacimiento=" + fechaNacimiento +
                ", direccion='" + direccion + '\'' +
                ", telefono=" + telefono +
                ", edad=" + edad +
                ", foto='" + foto + '\'' +
                ", sistemaSalud='" + sistemaSalud + '\'' +
                ", motivoDerivacion='" + motivoDerivacion + '\'' +
                ", estadoSalud='" + estadoSalud + '\'' +
                ", comentarios='" + comentarios + '\'' +
                ", tratamientos='" + tratamientos + '\'' +
                ", documentacionAdjunta=" + documentacionAdjunta +
                ", observacionesConfidenciales='" + observacionesConfidenciales + '\'' +
                '}';
    }
}
