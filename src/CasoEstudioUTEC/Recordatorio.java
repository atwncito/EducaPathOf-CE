package CasoEstudioUTEC;

import java.time.LocalDateTime;
import java.util.UUID;

// ENUMERACIONES DE APOYO
/**
 * Define los tipos posibles de recordatorios.
 */
enum TipoRecordatorio {
    LLAMADA,
    NUEVA_REUNION,
    BRINDAR_INFORMACION,
    OTRO
}

//Define la frecuencia con la que se repite un recordatorio.
enum Frecuencia {
    UNICO,
    DIARIO,
    SEMANAL,
    MENSUAL
}

public class Recordatorio {
    private String id;                       // Identificador único del recordatorio
    private String titulo;                   // Título del recordatorio
    private LocalDateTime fechaHora;         // Fecha y hora en que debe activarse el recordatorio
    private Instancia instanciaAsociada;     // Instancia del sistema a la que está relacionado el recordatorio
    private TipoRecordatorio tipo;           // Tipo de recordatorio
    private Frecuencia frecuencia;           // Frecuencia con la que se repite
    private boolean enviado;                 // Indica si ya se envió la notificación
    private String mensaje;                  // Mensaje personalizado del recordatorio
    private String creadoPor;                // Usuario que creó el recordatorio
    private String googleCalendarId;         // ID del evento en Google Calendar (si aplica)

    // CONSTRUCTOR
    /**
     * Crea un nuevo recordatorio con datos validados.
     *
     * @param titulo             Título del recordatorio (obligatorio)
     * @param fechaHora          Fecha y hora del recordatorio (obligatorio)
     * @param instanciaAsociada  Instancia relacionada (obligatoria)
     * @param tipo               Tipo del recordatorio
     * @param frecuencia         Frecuencia del recordatorio
     * @param mensaje            Mensaje que se desea enviar
     * @param creadoPor          Usuario que crea el recordatorio
     */
    public Recordatorio(String titulo, LocalDateTime fechaHora, Instancia instanciaAsociada,
                        TipoRecordatorio tipo, Frecuencia frecuencia, String mensaje, String creadoPor) {
        if (titulo == null || titulo.isEmpty())
            throw new IllegalArgumentException("El título es obligatorio.");
        if (fechaHora == null)
            throw new IllegalArgumentException("La fecha y hora son obligatorias.");
        if (instanciaAsociada == null)
            throw new IllegalArgumentException("Debe asociarse a una instancia.");

        this.id = generarId();
        this.titulo = titulo;
        this.fechaHora = fechaHora;
        this.instanciaAsociada = instanciaAsociada;
        this.tipo = tipo;
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
        System.out.println("Notificación enviada al correo institucional del estudiante: "
                + instanciaAsociada.getEstudiante());
    }

    /**
     * Verifica si la fecha y hora del recordatorio ya ha pasado.
     *
     * @return true si ya pasó, false si aún está pendiente
     */
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

    /**
     * Permite generar una nueva instancia en base al recordatorio.
     * Útil si se necesita formalizar la acción del recordatorio.
     */
    public Instancia generarInstanciaDesdeRecordatorio() {
        return new Instancia(
                titulo,
                fechaHora,
                instanciaAsociada.getEstudiante(),
                instanciaAsociada.getTipoInstancia(),
                instanciaAsociada.getSolicitante()
        );
    }

    /**
     * Cambia la fecha y hora del recordatorio.
     *
     * @param nuevaFechaHora Nueva fecha y hora
     */
    public void reprogramar(LocalDateTime nuevaFechaHora) {
        this.fechaHora = nuevaFechaHora;
    }

    // METODOS GET Y SET
    public String getId() {
        return id;
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
        return instanciaAsociada;
    }

    public void setInstanciaAsociada(Instancia instanciaAsociada) {
        if (instanciaAsociada == null)
            throw new IllegalArgumentException("Debe asociarse a una instancia.");
        this.instanciaAsociada = instanciaAsociada;
    }

    public TipoRecordatorio getTipo() {
        return tipo;
    }

    public void setTipo(TipoRecordatorio tipo) {
        this.tipo = tipo;
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
                "\n  ID: " + id +
                "\n  Título: " + titulo +
                "\n  Fecha y hora: " + fechaHora +
                "\n  Tipo: " + (tipo != null ? tipo.name() : "N/A") +
                "\n  Frecuencia: " + (frecuencia != null ? frecuencia.name() : "N/A") +
                "\n  Enviado: " + (enviado ? "Sí" : "No") +
                "\n  Estado: " + getEstadoColor() +
                "\n  Mensaje: " + (mensaje != null ? mensaje : "Ninguno") +
                "\n  Creado por: " + (creadoPor != null ? creadoPor : "Desconocido") +
                "\n  Google Calendar ID: " + (googleCalendarId != null ? googleCalendarId : "No asignado") +
                "\n  Instancia Asociada: " + (instanciaAsociada != null ? instanciaAsociada.getId() : "N/A") +
                "\n}";
    }
}
