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

    // CONSTRUCTOR DE LA CLASE
    public VersionPlan(String comentario, String especialista, Date fecha) {
        this.comentario = comentario;
        this.especialista = especialista;
        this.fecha = fecha;
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

    // METODO toString
    @Override
    public String toString() {
        return "Versión del Plan {" +
                "Comentario: '" + comentario + '\'' +
                ", Especialista: '" + especialista + '\'' +
                ", Fecha: " + fecha +
                '}';
    }
}
