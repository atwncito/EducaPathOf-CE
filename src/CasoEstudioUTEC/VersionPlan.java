package CasoEstudioUTEC;

import java.util.Date;

/**
 * Clase que representa una versión de un plan de apoyo.
 * Cada versión contiene un comentario realizado por un especialista
 * y la fecha en la que se registró dicha observación.
 */
public class VersionPlan {

    // ATRIBUTOS PRIVADOS
    /**
     * Comentario u observación realizada por el especialista sobre el plan.
     */
    private String comentario;

    /**
     * Nombre o identificador del especialista que hizo el comentario.
     */
    private String especialista;

    /**
     * Fecha en la que se hizo el comentario (versión del plan).
     */
    private Date fecha;

    // CONSTRUCTOR
    /**
     * Constructor que inicializa una nueva versión del plan.
     *
     * @param comentario   Observación realizada por el especialista
     * @param especialista Nombre o identificador del especialista
     * @param fecha        Fecha del comentario
     */
    public VersionPlan(String comentario, String especialista, Date fecha) {
        this.comentario = comentario;
        this.especialista = especialista;
        this.fecha = fecha;
    }

    // MÉTODOS GETTER Y SETTER
    /**
     * Obtiene el comentario de esta versión del plan.
     *
     * @return Comentario u observación
     */
    public String getComentario() {
        return comentario;
    }

    /**
     * Establece o actualiza el comentario.
     *
     * @param comentario Nuevo comentario
     */
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    /**
     * Obtiene el nombre del especialista que hizo la observación.
     *
     * @return Nombre o identificador del especialista
     */
    public String getEspecialista() {
        return especialista;
    }

    /**
     * Establece o actualiza el nombre del especialista.
     *
     * @param especialista Nuevo nombre
     */
    public void setEspecialista(String especialista) {
        this.especialista = especialista;
    }

    /**
     * Obtiene la fecha en que se registró la versión del plan.
     *
     * @return Fecha del comentario
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * Establece o modifica la fecha del comentario.
     *
     * @param fecha Nueva fecha
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
