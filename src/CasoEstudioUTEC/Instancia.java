package CasoEstudioUTEC;

import java.time.LocalDateTime;
import java.util.UUID;

// Enumeraciones para tipo y solicitante.
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

    // Campos para eventos informales.
    private String lugar;
    private String otrasPersonas;
    private String registradoPor;

    // Constructor principal de la clase.
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

    // Getters y setters pueden agregarse si es necesario
}

