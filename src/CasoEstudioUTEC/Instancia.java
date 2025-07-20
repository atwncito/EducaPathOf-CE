package CasoEstudioUTEC;

import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.UUID;

/**
 * Clase que representa una instancia de reunión, llamada, pedido de informe, coordinación o evento informal.
 * Contiene información relevante como título, fecha y hora, estudiante asociado, tipo de instancia,
 * solicitante, estado de realización y otros detalles específicos según el tipo de instancia.
 */
public class Instancia {

    // ATRIBUTOS PRIVADOS
    private String idInstancia;                          // Identificador único de la instancia (UUID)
    private String titulo;                      // Título descriptivo de la instancia
    private LocalDateTime fechaHora;            // Fecha y hora en la que se realiza la instancia
    private Estudiante estudiante;              // Estudiante asociado a la instancia
    private String comentarios;                 // Comentarios visibles de la instancia
    private String comentariosConfidenciales;   // Comentarios confidenciales de uso interno
    private TipoInstancia tipoInstancia;        // Tipo de la instancia (reunión, llamada, etc.)
    private Solicitante solicitante;            // Quién solicitó la instancia
    private boolean realizada;                  // Marca si la instancia fue realizada
    private String googleCalendarId;            // ID del evento en Google Calendar (si aplica)
    private Funcionario funcionario;            // Funcionario que creo la instancia
    private ArrayList<Recordatorio> recordatorios;

    // CONSTRUCTOR DE LA CLASE
    public Instancia(String titulo, LocalDateTime fechaHora, Estudiante estudiante, TipoInstancia tipoInstancia, Solicitante solicitante, Funcionario funcionario, ArrayList<Recordatorio> recordatorios) {
        if (!TipoInstancia.esValido(tipoInstancia.toString())) {
            throw new IllegalArgumentException("Tipo instancia invalido: " + tipoInstancia);
        }
        if (!Solicitante.esValido(solicitante.toString())) {
            throw new IllegalArgumentException("Solicitante invalido: " + solicitante);
        }

        this.idInstancia = generarId(); // Genera un identificador único
        this.titulo = titulo;
        this.fechaHora = fechaHora;
        this.estudiante = estudiante;
        this.tipoInstancia = tipoInstancia;
        this.solicitante = solicitante;
        this.funcionario = funcionario;
        this.realizada = false; // Por defecto, la instancia no está realizada
        this.recordatorios = new ArrayList<>();
    }

    // Genera un ID único para la instancia utilizando UUID.
    private String generarId() {
        return UUID.randomUUID().toString();
    }

    // Registra la instancia, asignando los comentarios y marcándola como realizada.
    public void registrar(String comentarios, String comentariosConfidenciales) {
        this.comentarios = comentarios;
        this.comentariosConfidenciales = comentariosConfidenciales;
        this.realizada = true;
        notificarUsuario(); // Simulación de notificación
    }

    //Clona la instancia actual (copia sus datos relevantes).
    public Instancia clonar() {
        Instancia copia = new Instancia(this.titulo, this.fechaHora, this.estudiante, this.tipoInstancia, this.solicitante, this.funcionario, this.recordatorios);
        copia.comentarios = this.comentarios;
        copia.comentariosConfidenciales = this.comentariosConfidenciales;
        return copia;
    }

    // Cambia la fecha y hora de la instancia (reagendar).
    public void reagendar(LocalDateTime nuevaFecha) {
        this.fechaHora = nuevaFecha;
    }

    // Simula una notificación al usuario al registrar la instancia.
    private void notificarUsuario() {
        System.out.println("Instancia registrada. ID: " + this.idInstancia);
    }

    // METODOS GET Y SET
    public String getIdInstancia() {
        return idInstancia;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public String getComentariosConfidenciales() {
        return comentariosConfidenciales;
    }

    public void setComentariosConfidenciales(String comentariosConfidenciales) {
        this.comentariosConfidenciales = comentariosConfidenciales;
    }

    public TipoInstancia getTipoInstancia() {
        return tipoInstancia;
    }

    public void setTipoInstancia(TipoInstancia tipoInstancia) {
        this.tipoInstancia = tipoInstancia;
    }

    public Solicitante getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(Solicitante solicitante) {
        this.solicitante = solicitante;
    }

    public boolean isRealizada() {
        return realizada;
    }

    public void setRealizada(boolean realizada) {
        this.realizada = realizada;
    }

    public String getGoogleCalendarId() {
        return googleCalendarId;
    }

    public void setGoogleCalendarId(String googleCalendarId) {
        this.googleCalendarId = googleCalendarId;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public ArrayList<Recordatorio> getRecordatorios() {
        return recordatorios;
    }

    public void setRecordatorios(ArrayList<Recordatorio> recordatorios) {
        this.recordatorios = recordatorios;
    }

    // METODO toString
    @Override
    public String toString() {
        return "Instancia {" +
                "ID='" + getIdInstancia() +
                ", titulo='" + getTitulo() + '\'' +
                ", fecha y hora='" + getFechaHora() + '\'' +
                ", estudiante='" + getEstudiante() + '\'' +
                ", tipo=" + getTipoInstancia() + '\'' +
                ", solicitante='" + getSolicitante() + '\'' +
                ", realiza='" + isRealizada() + '\'' +
                ", comentarios='" + getComentarios() + '\'' +
                ", google calendar ID='" + getGoogleCalendarId() + '\'' +
                ", funcionario='" + getFuncionario() + '\'' +
                ", recordatorios='" + getRecordatorios() +
                '}';
    }
}
