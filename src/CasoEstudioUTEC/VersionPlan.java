package CasoEstudioUTEC;

import java.util.Date;

public class VersionPlan {

    // ATRIBUTOS PRIVADOS
    private String comentario;            // Comentario u observación realizada por el especialista sobre el plan
    private String especialista;          // Nombre o identificador del especialista que hizo el comentario
    private Date fecha;                   // Fecha en la que se hizo el comentario (versión del plan)

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

    // METODOS GET Y SET
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
