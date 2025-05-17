package CasoEstudioUTEC;

import java.util.ArrayList;
import java.util.List;

public class PlanApoyo {
}
import java.util.*;

public class PlanApoyo {
    private String id;
    private String estudianteId;
    private List<String> objetivos;
    private List<String> actividades;
    private List<Tarea> cronograma;
    private List<VersionPlan> versiones; // Para RF9
    private List<String> recursos;       // Para RF10

    public PlanApoyo(String id, String estudianteId) {
        this.id = id;
        this.estudianteId = estudianteId;
        this.objetivos = new ArrayList<>();
        this.actividades = new ArrayList<>();
        this.cronograma = new ArrayList<>();
        this.versiones = new ArrayList<>();
        this.recursos = new ArrayList<>();
    }

    public void agregarComentario(String comentario, String especialista) {
        VersionPlan version = new VersionPlan(comentario, especialista, new Date());
        versiones.add(version);
    }

    public void agregarRecurso(String recurso) {
        recursos.add(recurso); // Puede ser una URL o nombre de archivo
    }

    // Métodos comunes
    public void agregarObjetivo(String objetivo) {
        objetivos.add(objetivo);
    }

    public void agregarActividad(String actividad) {
        actividades.add(actividad);
    }

    public void agregarTarea(String descripcion, Date fechaLimite) {
        cronograma.add(new Tarea(descripcion, fechaLimite));
    }

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

    // Getters y setters...
}
