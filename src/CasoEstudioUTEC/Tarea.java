package CasoEstudioUTEC;

import java.util.Date;

/**
 * Clase que representa una tarea dentro del cronograma de un plan de apoyo.
 * Contiene una descripción y una fecha límite para su cumplimiento.
 */
public class Tarea {

    // ATRIBUTOS PRIVADOS
    private String descripcion;       // Descripción breve de la tarea (por ejemplo: "Enviar informe", "Revisar documentos").
    private Date fechaLimite;         // Fecha límite para completar la tarea.

    // CONSTRUCTOR
    /**
     * Constructor que inicializa una nueva tarea con descripción y fecha límite.
     *
     * @param descripcion Descripción de la tarea
     * @param fechaLimite Fecha límite para su cumplimiento
     */
    public Tarea(String descripcion, Date fechaLimite) {
        this.descripcion = descripcion;
        this.fechaLimite = fechaLimite;
    }

    // MÉTODOS GET Y SET
    /**
     * Obtiene la descripción de la tarea.
     *
     * @return Descripción textual
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Establece o modifica la descripción de la tarea.
     *
     * @param descripcion Nueva descripción
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Obtiene la fecha límite para realizar la tarea.
     *
     * @return Fecha límite como objeto Date
     */
    public Date getFechaLimite() {
        return fechaLimite;
    }

    /**
     * Establece o modifica la fecha límite de la tarea.
     *
     * @param fechaLimite Nueva fecha límite
     */
    public void setFechaLimite(Date fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    // METODO toString
    @Override
    public String toString() {
        return "Tarea {" +
                "Descripción: '" + descripcion + '\'' +
                ", Fecha límite: " + fechaLimite +
                '}';
    }
}
