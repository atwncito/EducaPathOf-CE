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
    private String id;                    // Identificador único del plan de apoyo
    private Estudiante estudiante;        // Objeto de la clase Estudiante
    private List<String> objetivos;       // Lista de objetivos definidos en el plan
    private List<String> actividades;     // Actividades propuestas en el plan
    private List<Tarea> cronograma;       // Lista de tareas con sus fechas límite
    private List<VersionPlan> versiones;  // Historial de versiones con comentarios de especialistas (RF9)
    private List<String> recursos;        // Recursos asociados (URLs, documentos, etc.) (RF10)

    // CONSTRUCTOR DE LA CLASE
    public PlanApoyo(String id, Estudiante estudiante) {
        this.id = id;
        this.estudiante = estudiante;
        this.objetivos = new ArrayList<>();
        this.actividades = new ArrayList<>();
        this.cronograma = new ArrayList<>();
        this.versiones = new ArrayList<>();
        this.recursos = new ArrayList<>();
    }

    // Agrega un nuevo comentario al historial de versiones del plan.
    public void agregarComentario(String comentario, String especialista) {
        VersionPlan version = new VersionPlan(comentario, especialista, new Date());
        versiones.add(version);
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
    public void agregarTarea(String descripcion, Date fechaLimite) {
        cronograma.add(new Tarea(descripcion, fechaLimite));
    }

    /**
     * Muestra todos los detalles del plan en consola:
     * - Objetivos
     * - Actividades
     * - Cronograma
     * - Recursos
     * - Historial de versiones (comentarios)
     */
    public void mostrarPlan() {
        System.out.println("Objetivos: " + objetivos);
        System.out.println("Actividades: " + actividades);
        System.out.println("Cronograma: ");
        for (Tarea t : cronograma) {
            System.out.println("- " + t.getDescripcion() + " para el " + t.getFechaLimite());
        }
        System.out.println("Recursos: " + recursos);
        System.out.println("Historial de versiones:");
        for (VersionPlan v : versiones) {
            System.out.println("- [" + v.getFecha() + "] " + v.getEspecialista() + ": " + v.getComentario());
        }
    }

    // METODOS GET Y SET
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public List<VersionPlan> getVersiones() {
        return versiones;
    }

    public void setVersiones(List<VersionPlan> versiones) {
        this.versiones = versiones;
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
                ", recursos='" + getRecursos() + '\'' +
                ", versiones='" + getVersiones() +
                '}';
    }

}
