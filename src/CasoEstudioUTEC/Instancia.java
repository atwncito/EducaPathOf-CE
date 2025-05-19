package CasoEstudioUTEC;

import java.time.LocalDateTime;
import java.util.UUID;

enum TipoInstancia {
    REUNION, LLAMADA, PEDIDO_INFORME, COORDINACION, EVENTO_INFORMAL
}

enum Solicitante {
    ESTUDIANTE, DIRECCION_EDUCACION
}

public class Instancia {
    private String id;
    private String titulo;
    private LocalDateTime fechaHora;
    private String estudiante;
    private String comentarios;
    private String comentariosConfidenciales;
    private TipoInstancia tipoInstancia;
    private Solicitante solicitante;
    private boolean realizada;
    private String googleCalendarId;

    private String lugar;
    private String otrasPersonas;
    private String registradoPor;

    public Instancia(String titulo, LocalDateTime fechaHora, String estudiante, TipoInstancia tipoInstancia, Solicitante solicitante) {
        this.id = generarId();
        this.titulo = titulo;
        this.fechaHora = fechaHora;
        this.estudiante = estudiante;
        this.tipoInstancia = tipoInstancia;
        this.solicitante = solicitante;
        this.realizada = false;
    }

    private String generarId() {
        return UUID.randomUUID().toString(); // RF12
    }

    public void registrar(String comentarios, String comentariosConfidenciales) {
        this.comentarios = comentarios;
        this.comentariosConfidenciales = comentariosConfidenciales;
        this.realizada = true;
        notificarUsuario();
    }

    public void agregarDetallesEventoInformal(String lugar, String otrasPersonas, String registradoPor) {
        this.lugar = lugar;
        this.otrasPersonas = otrasPersonas;
        this.registradoPor = registradoPor;
    }

    public Instancia clonar() {
        Instancia copia = new Instancia(this.titulo, this.fechaHora, this.estudiante, this.tipoInstancia, this.solicitante);
        copia.comentarios = this.comentarios;
        copia.comentariosConfidenciales = this.comentariosConfidenciales;
        return copia;
    }

    public void reagendar(LocalDateTime nuevaFecha) {
        this.fechaHora = nuevaFecha;
    }

    private void notificarUsuario() {
        System.out.println("Instancia registrada. ID: " + this.id);
    }

    // Getters y Setters
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
