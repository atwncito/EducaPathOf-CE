package CasoEstudioUTEC;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 * Clase que representa una instancia de reunión, llamada, pedido de informe, coordinación o evento informal.
 * Contiene información relevante como título, fecha y hora, estudiante asociado, tipo de instancia,
 * solicitante, estado de realización y otros detalles específicos según el tipo de instancia.
 */
public class Instancia {

    // ATRIBUTOS PRIVADOS
    private String id;                          // Identificador único de la instancia (UUID)
    private String titulo;                      // Título descriptivo de la instancia
    private LocalDateTime fechaHora;            // Fecha y hora en la que se realiza la instancia
    private String estudiante;                  // Estudiante asociado a la instancia
    private String comentarios;                 // Comentarios visibles de la instancia
    private String comentariosConfidenciales;   // Comentarios confidenciales de uso interno
    private String tipoInstancia;        // Tipo de la instancia (reunión, llamada, etc.)
    private String solicitante;            // Quién solicitó la instancia
    private boolean realizada;                  // Marca si la instancia fue realizada
    private String googleCalendarId;            // ID del evento en Google Calendar (si aplica)

    // Campos adicionales para EVENTO_INFORMAL
    private String lugar;
    private String otrasPersonas;
    private String registradoPor;

    // CONSTRUCTOR DE LA CLASE
    public Instancia(String titulo, LocalDateTime fechaHora, String estudiante, TipoInstancia tipoInstancia, Solicitante solicitante) {
        if (!TipoInstancia.esValido(tipoInstancia.toString())) {
            throw new IllegalArgumentException("Tipo instancia invalido: " + tipoInstancia);
        }
        if (!Solicitante.esValido(solicitante.toString())) {
            throw new IllegalArgumentException("Solicitante invalido: " + solicitante);
        }

        this.id = generarId(); // Genera un identificador único
        this.titulo = titulo;
        this.fechaHora = fechaHora;
        this.estudiante = estudiante;
        this.tipoInstancia = tipoInstancia.toString();
        this.solicitante = solicitante.toString();
        this.realizada = false; // Por defecto, la instancia no está realizada
    }

    public Instancia(String titulo, LocalDateTime fechaHora, String estudiante, String tipoInstancia, String solicitante) {
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

    // Agrega detalles adicionales si el tipo de instancia es un evento informal.
    public void agregarDetallesEventoInformal(String lugar, String otrasPersonas, String registradoPor) {
        this.lugar = lugar;
        this.otrasPersonas = otrasPersonas;
        this.registradoPor = registradoPor;
    }

    //Clona la instancia actual (copia sus datos relevantes).
    public Instancia clonar() {
        Instancia copia = new Instancia(this.titulo, this.fechaHora, this.estudiante, this.tipoInstancia, this.solicitante);
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
        System.out.println("Instancia registrada. ID: " + this.id);
    }

    // METODOS GET Y SET
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

    public String getTipoInstancia() {
        return tipoInstancia;
    }

    public void setTipoInstancia(TipoInstancia tipoInstancia) {
        this.tipoInstancia = tipoInstancia.toString();
    }

    public String getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(Solicitante solicitante) {
        this.solicitante = solicitante.toString();
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

    // METODO toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Instancia {\n");
        sb.append("  ID: ").append(id).append("\n");
        sb.append("  Título: ").append(titulo).append("\n");
        sb.append("  Fecha y hora: ").append(fechaHora).append("\n");
        sb.append("  Estudiante: ").append(estudiante).append("\n");
        sb.append("  Tipo: ").append(tipoInstancia).append("\n");
        sb.append("  Solicitante: ").append(solicitante).append("\n");
        sb.append("  Realizada: ").append(realizada ? "Sí" : "No").append("\n");
        sb.append("  Comentarios: ").append(comentarios != null ? comentarios : "Ninguno").append("\n");

        if (tipoInstancia == TipoInstancia.EVENTO_INFORMAL) {
            sb.append("  Lugar: ").append(lugar != null ? lugar : "No especificado").append("\n");
            sb.append("  Otras personas: ").append(otrasPersonas != null ? otrasPersonas : "Ninguna").append("\n");
            sb.append("  Registrado por: ").append(registradoPor != null ? registradoPor : "Desconocido").append("\n");
        }

        sb.append("  Google Calendar ID: ").append(googleCalendarId != null ? googleCalendarId : "No asignado").append("\n");
        sb.append("}");
        return sb.toString();
    }
}
