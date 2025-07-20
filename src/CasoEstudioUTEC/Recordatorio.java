package CasoEstudioUTEC;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 * Clase que representa un Recordatorio en el sistema.
 * Contiene información sobre el título, fecha y hora, tipo, frecuencia,
 * estado de envío, mensaje personalizado, y la instancia asociada.
 * Incluye métodos para gestionar la notificación, verificar si está vencido,
 * reprogramar la fecha y generar una instancia basada en el recordatorio.
 */
public class Recordatorio {

    // ATRIBUTOS PRIVADOS
    private String idRecordatorio;                  // Identificador único del recordatorio
    private String titulo;                          // Título del recordatorio
    private LocalDateTime fechaHora;                // Fecha y hora en que debe activarse el recordatorio
    private Instancia instancia;                    // Instancia del sistema a la que está relacionado el recordatorio
    private TipoRecordatorio tipoRecordatorio;      // Tipo de recordatorio
    private Frecuencia frecuencia;                  // Frecuencia con la que se repite
    private boolean enviado;                        // Indica si ya se envió la notificación
    private String mensaje;                         // Mensaje personalizado del recordatorio
    private String creadoPor;                       // Usuario que creó el recordatorio
    private String googleCalendarId;                // ID del evento en Google Calendar (si aplica)

    // CONSTRUCTOR DE LA CLASE
    public Recordatorio(String titulo, LocalDateTime fechaHora, Instancia instancia,
                        TipoRecordatorio tipo, Frecuencia frecuencia, String mensaje, String creadoPor) {
        if (titulo == null || titulo.isEmpty())
            throw new IllegalArgumentException("El título es obligatorio.");
        if (fechaHora == null)
            throw new IllegalArgumentException("La fecha y hora son obligatorias.");
        if (instancia == null)
            throw new IllegalArgumentException("Debe asociarse a una instancia.");

        this.idRecordatorio = generarId();
        this.titulo = titulo;
        this.fechaHora = fechaHora;
        this.instancia = instancia;
        this.tipoRecordatorio = tipo;
        this.frecuencia = frecuencia;
        this.mensaje = mensaje;
        this.enviado = false;
        this.creadoPor = creadoPor;
    }

    // Genera un identificador único para el recordatorio (UUID)
    private String generarId() {
        return UUID.randomUUID().toString();
    }

    // MÉTODOS FUNCIONALES
    /**
     * Marca el recordatorio como enviado y muestra un mensaje en consola simulando una notificación
     */
    public void enviarNotificacion() {
        this.enviado = true;
        System.out.println("Notificación enviada al correo institucional del estudiante: " + instancia.getEstudiante());
    }

    // Verifica si la fecha y hora del recordatorio ya ha pasado.
    public boolean estaVencido() {
        return LocalDateTime.now().isAfter(fechaHora);
    }

    /**
     * Devuelve un color representando el estado del recordatorio:
     * - Rojo si está vencido
     * - Verde si está pendiente
     */
    public String getEstadoColor() {
        return estaVencido() ? "Rojo (Vencido)" : "Verde (Pendiente)";
    }

    // Permite generar una nueva instancia en base al recordatorio.
    public Instancia generarInstanciaDesdeRecordatorio() {
        return new Instancia(
                titulo,
                fechaHora,
                instancia.getEstudiante(),
                instancia.getTipoInstancia(),
                instancia.getSolicitante(),
                instancia.getFuncionario(),
                instancia.getRecordatorios()
        );
    }

    // Cambia la fecha y hora del recordatorio.
    public void reprogramar(LocalDateTime nuevaFechaHora) {
        this.fechaHora = nuevaFechaHora;
    }

    // METODOS GET Y SET
    public String getIdRecordatorio() {
        return idRecordatorio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo == null || titulo.isEmpty())
            throw new IllegalArgumentException("El título es obligatorio.");
        this.titulo = titulo;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        if (fechaHora == null)
            throw new IllegalArgumentException("La fecha y hora son obligatorias.");
        this.fechaHora = fechaHora;
    }

    public Instancia getInstanciaAsociada() {
        return instancia;
    }

    public void setInstanciaAsociada(Instancia instancia) {
        if (instancia == null)
            throw new IllegalArgumentException("Debe asociarse a una instancia.");
        this.instancia = instancia;
    }

    public TipoRecordatorio getTipoRecordatorio() {
        return tipoRecordatorio;
    }

    public void setTipo(TipoRecordatorio tipoRecordatorio) {
        this.tipoRecordatorio = tipoRecordatorio;
    }

    public Frecuencia getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(Frecuencia frecuencia) {
        this.frecuencia = frecuencia;
    }

    public boolean isEnviado() {
        return enviado;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getCreadoPor() {
        return creadoPor;
    }

    public void setCreadoPor(String creadoPor) {
        this.creadoPor = creadoPor;
    }

    public String getGoogleCalendarId() {
        return googleCalendarId;
    }

    public void setGoogleCalendarId(String googleCalendarId) {
        this.googleCalendarId = googleCalendarId;
    }

    // METODO toString
    @Override
    public String toString() {
        return "Recordatorio {" +
                "ID='" + getIdRecordatorio() +
                ", titulo='" + getTitulo() + '\'' +
                ", fecha y hora='" + getFechaHora()+ '\'' +
                ", tipo='" + getTipoRecordatorio() + '\'' +
                ", frecuencia='" + getFrecuencia() + '\'' +
                ", enviado='" + isEnviado() + '\'' +
                ", estado='" + getEstadoColor() + '\'' +
                ", mensaje='" + getMensaje() + '\'' +
                ", creado por='" + getCreadoPor() + '\'' +
                ", google calendar ID='" + getGoogleCalendarId() + '\'' +
                ", instancia asociada=" + getInstanciaAsociada() +
                '}';
    }
}
