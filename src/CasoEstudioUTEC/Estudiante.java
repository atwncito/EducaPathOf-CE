package CasoEstudioUTEC;

import java.util.Date;
import java.util.LinkedList;

enum itr {
    ITR_PAYSANDU, ITR_RIVERA, ITR_DURAZNO, ITR_MINAS, ITR_MELO, ITR_FRAYBENTOS
}

/**
 * Clase que representa a un estudiante dentro del sistema.
 * Hereda de la clase Usuario y añade atributos específicos relacionados con su información académica, personal y de salud.
 */
public class Estudiante extends Usuario {

    // ATRIBUTOS PRIVADOS
    private String carrera;                             // Carrera universitaria del estudiante
    private String grupo;                               // Grupo académico al que pertenece el estudiante
    private String apellido;                            // Apellido del estudiante
    private int numeroCI;                               // Número de Cédula de Identidad (CI) del estudiante
    private Date fechaNacimiento;                       // Fecha de nacimiento del estudiante
    private String direccion;                           // Dirección de residencia del estudiante
    private int telefono;                               // Número de teléfono de contacto del estudiante
    private int edad;                                   // Edad del estudiante
    private String foto;                                // Ruta o nombre del archivo de la foto del estudiante
    private String sistemaSalud;                        // Sistema de salud al que está afiliado el estudiante
    private String motivoDerivacion;                    // Motivo por el cual el estudiante fue derivado al servicio o atención
    private String estadoSalud;                         // Estado de salud actual del estudiante
    private String comentarios;                         // Comentarios generales sobre el estudiante
    private String tratamientos;                        // Tratamientos médicos o psicológicos que recibe el estudiante
    private LinkedList<String> documentacionAdjunta;    // Lista de documentos adjuntos relacionados al estudiante
    private String observacionesConfidenciales;         // Observaciones confidenciales reservadas sobre el estudiante
    private itr itr;                                    // ITR al que pertenece el estudiante

    // CONSTRUCTOR DE LA CLASE
    public Estudiante(String nombre, String email, String contrasenia, String carrera, String grupo, String apellido,
                      int numeroCI, Date fechaNacimiento, String direccion, int telefono, int edad, String foto,
                      String sistemaSalud, String motivoDerivacion, String estadoSalud, String comentarios,
                      String tratamientos, LinkedList<String> documentacionAdjunta, String observacionesConfidenciales, String itr) {
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
        this.itr = CasoEstudioUTEC.itr.valueOf(itr);
    }

    // METODOS GET Y SET
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

    public itr getItr() {
        return this.itr;
    }

    public void setItr(itr itr) {
        this.itr = itr;
    }

    // METODO toString
    @Override
    public String toString() {
        return "Estudiante {" +
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
                ", itr='" + itr + '\'' +
                '}';
    }
}