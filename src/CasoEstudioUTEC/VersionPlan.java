package CasoEstudioUTEC;

import java.util.Date;

/**
 * Representa una versión o comentario realizado por un especialista sobre un plan de apoyo.
 * Incluye el comentario, el especialista que lo hizo y la fecha del comentario.
 */
public class VersionPlan {

    // ATRIBUTOS PRIVADOS
    private String comentario;            // Comentario u observación realizada por el especialista sobre el plan
    private String especialista;          // Nombre o identificador del especialista que hizo el comentario
    private Date fecha;                   // Fecha en la que se hizo el comentario (versión del plan)
    private PlanApoyo planApoyo;          // Plan de apoyo al que pertenece la version

    // CONSTRUCTOR DE LA CLASE
    public VersionPlan(String comentario, String especialista, Date fecha) {
        this.comentario = comentario;
        this.especialista = especialista;
        this.fecha = fecha;
        this.planApoyo = planApoyo;
    }

    // METODOS GET Y SET
    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getEspecialista() {
        return especialista;
    }

    public void setEspecialista(String especialista) {
        this.especialista = especialista;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
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
        return "Versión del Plan {" +
                "comentario='" + getComentario() + '\'' +
                ", especialista='" + getEspecialista() + '\'' +
                ", fecha='" + getFecha() + '\'' +
                ", plan apoyo='" + getPlanApoyo() +
                '}';
    }
}
