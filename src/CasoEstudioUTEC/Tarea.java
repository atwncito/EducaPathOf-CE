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
    private PlanApoyo planApoyo;      // Plan de apoyo al que está asociado la tarea.

    // CONSTRUCTOR DE LA CLASE
    public Tarea(String descripcion, Date fechaLimite, PlanApoyo planApoyo) {
        this.descripcion = descripcion;
        this.fechaLimite = fechaLimite;
        this.planApoyo = planApoyo;
    }

    // MÉTODOS GET Y SET
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaLimite() {
        return fechaLimite;
    }

    public void setFechaLimite(Date fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    public PlanApoyo getPlanApoyo() {
        return planApoyo;
    }

    public void setPlanApoyo(PlanApoyo planApoyo) {
        this.planApoyo = planApoyo;
    }

    // METODO toString
    @Override
    public String toString() {
        return "Tarea {" +
                "descripción='" + getDescripcion() + '\'' +
                ", fecha límite='" + getFechaLimite() + '\'' +
                ", plan apoyo='" + getPlanApoyo() +
                '}';
    }
}
