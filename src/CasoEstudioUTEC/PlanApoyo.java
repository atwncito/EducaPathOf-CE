package CasoEstudioUTEC;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Clase que representa un Plan de Apoyo para un estudiante.
 * Contiene información sobre objetivos, actividades, cronograma de tareas, recursos asociados,
 * y un historial de versiones con comentarios de especialistas.
 */
public class PlanApoyo {

    // ATRIBUTOS PRIVADOS
    private String idPlanApoyo;           // Identificador único del plan de apoyo
    private Estudiante estudiante;        // Objeto de la clase Estudiante
    private List<String> objetivos;       // Lista de objetivos definidos en el plan
    private List<String> actividades;     // Actividades propuestas en el plan
    private List<Tarea> cronograma;       // Lista de tareas con sus fechas límite
    private List<String> recursos;        // Recursos asociados (URLs, documentos, etc.) (RF10)

    // CONSTRUCTOR DE LA CLASE
    public PlanApoyo(String idPlanApoyo, Estudiante estudiante) {
        this.idPlanApoyo = idPlanApoyo;
        this.estudiante = estudiante;
        this.objetivos = new ArrayList<>();
        this.actividades = new ArrayList<>();
        this.cronograma = new ArrayList<>();
        this.recursos = new ArrayList<>();
    }

    // Agrega un nuevo recurso al plan (puede ser un link o referencia).
    public void agregarRecurso(String recurso) {
        recursos.add(recurso);
    }

    // Agrega un objetivo al plan.
    public void agregarObjetivo(String objetivo) {
        objetivos.add(objetivo);
    }

    // Agrega una actividad al plan.
    public void agregarActividad(String actividad) {
        actividades.add(actividad);
    }

    // Agrega una tarea al cronograma con su fecha límite.
    public void agregarTarea(String descripcion, Date fechaLimite, PlanApoyo planApoyo) {
        cronograma.add(new Tarea(descripcion, fechaLimite, planApoyo));
    }

    // METODOS GET Y SET
    public String getId() {
        return idPlanApoyo;
    }

    public void setId(String id) {
        this.idPlanApoyo = id;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public List<String> getObjetivos() {
        return objetivos;
    }

    public void setObjetivos(List<String> objetivos) {
        this.objetivos = objetivos;
    }

    public List<String> getActividades() {
        return actividades;
    }

    public void setActividades(List<String> actividades) {
        this.actividades = actividades;
    }

    public List<Tarea> getCronograma() {
        return cronograma;
    }

    public void setCronograma(List<Tarea> cronograma) {
        this.cronograma = cronograma;
    }

    public List<String> getRecursos() {
        return recursos;
    }

    public void setRecursos(List<String> recursos) {
        this.recursos = recursos;
    }

    // METODO toString
    @Override
    public String toString() {
        return "PlanApoyo {" +
                "ID='" + getId() +
                ", estudiante='" + getEstudiante() + '\'' +
                ", objetivos='" + getObjetivos() + '\'' +
                ", actividades='" + getActividades() + '\'' +
                ", cronograma='" + getCronograma() + '\'' +
                ", recursos='" + getRecursos() +
                '}';
    }

}
