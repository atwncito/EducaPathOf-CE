package CasoEstudioUTEC;

import java.time.LocalDateTime;
import java.util.UUID;

enum TipoRecordatorio {
    LLAMADA, NUEVA_REUNION, BRINDAR_INFORMACION, OTRO
}

enum Frecuencia {
    UNICO, DIARIO, SEMANAL, MENSUAL
}

public class Recordatorio {
    private String id;
    private String titulo;
    private LocalDateTime fechaHora;
    private Instancia instanciaAsociada;
    private TipoRecordatorio tipo;
    private Frecuencia frecuencia;
    private boolean enviado;
    private String mensaje;
    private String creadoPor;
    private String googleCalendarId;

    public Recordatorio(String titulo, LocalDateTime fechaHora, Instancia instanciaAsociada,
                        TipoRecordatorio tipo, Frecuencia frecuencia, String mensaje, String creadoPor) {
        if (titulo == null || titulo.isEmpty()) throw new IllegalArgumentException("El título es obligatorio.");
        if (fechaHora == null) throw new IllegalArgumentException("La fecha y hora son obligatorias.");
        if (instanciaAsociada == null) throw new IllegalArgumentException("Debe asociarse a una instancia.");

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

    private String generarId() {
        return UUID.randomUUID().toString();
    }

    public void enviarNotificacion() {
        this.enviado = true;
        System.out.println("Notificación enviada al correo institucional del estudiante: "
                + instanciaAsociada.getEstudiante());
    }

    public boolean estaVencido() {
        return LocalDateTime.now().isAfter(fechaHora);
    }

    public String getEstadoColor() {
        return estaVencido() ? "Rojo (Vencido)" : "Verde (Pendiente)";
    }

    public Instancia generarInstanciaDesdeRecordatorio() {
        return new Instancia(titulo, fechaHora, instanciaAsociada.getEstudiante(),
                instanciaAsociada.getTipoInstancia(), instanciaAsociada.getSolicitante());
    }

    public void reprogramar(LocalDateTime nuevaFechaHora) {
        this.fechaHora = nuevaFechaHora;
    }

    // Getters y setters
    public String getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo == null || titulo.isEmpty()) throw new IllegalArgumentException("El título es obligatorio.");
        this.titulo = titulo;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        if (fechaHora == null) throw new IllegalArgumentException("La fecha y hora son obligatorias.");
        this.fechaHora = fechaHora;
    }

    public Instancia getInstanciaAsociada() {
        return instanciaAsociada;
    }

    public void setInstanciaAsociada(Instancia instanciaAsociada) {
        if (instanciaAsociada == null) throw new IllegalArgumentException("Debe asociarse a una instancia.");
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
}
