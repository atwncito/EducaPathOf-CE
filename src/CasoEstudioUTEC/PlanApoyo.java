package CasoEstudioUTEC;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PlanApoyo {

    // ATRIBUTOS PRIVADOS
    private String id;                    // Identificador único del plan de apoyo
    private String estudianteId;          // Identificador del estudiante al que pertenece este plan
    private List<String> objetivos;       // Lista de objetivos definidos en el plan
    private List<String> actividades;     // Actividades propuestas en el plan
    private List<Tarea> cronograma;       // Lista de tareas con sus fechas límite
    private List<VersionPlan> versiones;  // Historial de versiones con comentarios de especialistas (RF9)
    private List<String> recursos;        // Recursos asociados (URLs, documentos, etc.) (RF10)

    /**
     * Constructor que inicializa el plan con su ID y el del estudiante.
     *
     * @param id           Identificador único del plan
     * @param estudianteId Identificador del estudiante asociado
     */
    public PlanApoyo(String id, String estudianteId) {
        this.id = id;
        this.estudianteId = estudianteId;
        this.objetivos = new ArrayList<>();
        this.actividades = new ArrayList<>();
        this.cronograma = new ArrayList<>();
        this.versiones = new ArrayList<>();
        this.recursos = new ArrayList<>();
    }

    /**
     * Agrega un nuevo comentario al historial de versiones del plan.
     * Representa una nueva revisión del plan por parte de un especialista (RF9).
     *
     * @param comentario   Texto del comentario
     * @param especialista Nombre del especialista que hace el comentario
     */
    public void agregarComentario(String comentario, String especialista) {
        VersionPlan version = new VersionPlan(comentario, especialista, new Date());
        versiones.add(version);
    }

    /**
     * Agrega un nuevo recurso al plan (puede ser un link o referencia).
     *
     * @param recurso Nombre o enlace del recurso
     */
    public void agregarRecurso(String recurso) {
        recursos.add(recurso);
    }

    /**
     * Agrega un objetivo al plan.
     *
     * @param objetivo Descripción del objetivo
     */
    public void agregarObjetivo(String objetivo) {
        objetivos.add(objetivo);
    }

    /**
     * Agrega una actividad al plan.
     *
     * @param actividad Descripción de la actividad
     */
    public void agregarActividad(String actividad) {
        actividades.add(actividad);
    }

    /**
     * Agrega una tarea al cronograma con su fecha límite.
     *
     * @param descripcion Descripción de la tarea
     * @param fechaLimite Fecha límite para cumplir la tarea
     */
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

    public String getEstudianteId() {
        return estudianteId;
    }

    public void setEstudianteId(String estudianteId) {
        this.estudianteId = estudianteId;
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
        StringBuilder sb = new StringBuilder();
        sb.append("PlanApoyo {\n");
        sb.append("  ID: ").append(id).append("\n");
        sb.append("  Estudiante ID: ").append(estudianteId).append("\n");

        sb.append("  Objetivos:\n");
        for (String obj : objetivos) {
            sb.append("    - ").append(obj).append("\n");
        }

        sb.append("  Actividades:\n");
        for (String act : actividades) {
            sb.append("    - ").append(act).append("\n");
        }

        sb.append("  Cronograma:\n");
        for (Tarea t : cronograma) {
            sb.append("    - ").append(t.getDescripcion()).append(" (fecha límite: ").append(t.getFechaLimite()).append(")\n");
        }

        sb.append("  Recursos:\n");
        for (String recurso : recursos) {
            sb.append("    - ").append(recurso).append("\n");
        }

        sb.append("  Versiones:\n");
        for (VersionPlan v : versiones) {
            sb.append("    - [").append(v.getFecha()).append("] ")
                    .append(v.getEspecialista()).append(": ")
                    .append(v.getComentario()).append("\n");
        }

        sb.append("}");
        return sb.toString();
    }
}
