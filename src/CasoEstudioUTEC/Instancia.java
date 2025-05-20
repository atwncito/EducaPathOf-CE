package CasoEstudioUTEC;

import java.time.LocalDateTime;
import java.util.UUID;

// Enumeración que define los posibles tipos de instancia que se pueden registrar en el sistema
enum TipoInstancia {
    REUNION, LLAMADA, PEDIDO_INFORME, COORDINACION, EVENTO_INFORMAL
}

// Enumeración que define quién solicitó la instancia
enum Solicitante {
    ESTUDIANTE, DIRECCION_EDUCACION
}

/**
 * Clase que representa una instancia de contacto o actividad dentro del sistema (como una reunión o llamada).
 */
public class Instancia {
    // Atributos privados de la clase
    private String id;                          // Identificador único de la instancia (UUID)
    private String titulo;                      // Título descriptivo de la instancia
    private LocalDateTime fechaHora;            // Fecha y hora en la que se realiza la instancia
    private String estudiante;                  // Estudiante asociado a la instancia
    private String comentarios;                 // Comentarios visibles de la instancia
    private String comentariosConfidenciales;   // Comentarios confidenciales de uso interno
    private TipoInstancia tipoInstancia;        // Tipo de la instancia (reunión, llamada, etc.)
    private Solicitante solicitante;            // Quién solicitó la instancia
    private boolean realizada;                  // Marca si la instancia fue realizada
    private String googleCalendarId;            // ID del evento en Google Calendar (si aplica)

    // Campos adicionales para EVENTO_INFORMAL
    private String lugar;
    private String otrasPersonas;
    private String registradoPor;

    /**
     * Constructor que inicializa los campos principales de la instancia.
     */
    public Instancia(String titulo, LocalDateTime fechaHora, String estudiante, TipoInstancia tipoInstancia, Solicitante solicitante) {
        this.id = generarId(); // Genera un identificador único
        this.titulo = titulo;
        this.fechaHora = fechaHora;
        this.estudiante = estudiante;
        this.tipoInstancia = tipoInstancia;
        this.solicitante = solicitante;
        this.realizada = false; // Por defecto, la instancia no está realizada
    }

    /**
     * Genera un ID único para la instancia utilizando UUID.
     */
    private String generarId() {
        return UUID.randomUUID().toString(); // RF12
    }

    /**
     * Registra la instancia, asignando los comentarios y marcándola como realizada.
     */
    public void registrar(String comentarios, String comentariosConfidenciales) {
        this.comentarios = comentarios;
        this.comentariosConfidenciales = comentariosConfidenciales;
        this.realizada = true;
        notificarUsuario(); // Simulación de notificación
    }

    /**
     * Agrega detalles adicionales si el tipo de instancia es un evento informal.
     */
    public void agregarDetallesEventoInformal(String lugar, String otrasPersonas, String registradoPor) {
        this.lugar = lugar;
        this.otrasPersonas = otrasPersonas;
        this.registradoPor = registradoPor;
    }

    /**
     * Clona la instancia actual (copia sus datos relevantes).
     */
    public Instancia clonar() {
        Instancia copia = new Instancia(this.titulo, this.fechaHora, this.estudiante, this.tipoInstancia, this.solicitante);
        copia.comentarios = this.comentarios;
        copia.comentariosConfidenciales = this.comentariosConfidenciales;
        return copia;
    }

    /**
     * Cambia la fecha y hora de la instancia (reagendar).
     */
    public void reagendar(LocalDateTime nuevaFecha) {
        this.fechaHora = nuevaFecha;
    }

    /**
     * Simula una notificación al usuario al registrar la instancia.
     */
    private void notificarUsuario() {
        System.out.println("Instancia registrada. ID: " + this.id);
    }

    // MÉTODOS GETTERS Y SETTERS

    public String getId() {
        return id;
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

    public String getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(String estudiante) {
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

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getOtrasPersonas() {
        return otrasPersonas;
    }

    public void setOtrasPersonas(String otrasPersonas) {
        this.otrasPersonas = otrasPersonas;
    }

    public String getRegistradoPor() {
        return registradoPor;
    }

    public void setRegistradoPor(String registradoPor) {
        this.registradoPor = registradoPor;
    }
}
