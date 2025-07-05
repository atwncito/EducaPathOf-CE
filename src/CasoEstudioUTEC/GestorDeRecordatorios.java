package CasoEstudioUTEC;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Clase que gestiona una colección de recordatorios dentro del sistema.
 * Permite agregar, eliminar, buscar, modificar y listar recordatorios según distintos criterios.
 */
public class GestorDeRecordatorios {

    // ATRIBUTO PRIVADO
    private List<Recordatorio> recordatorios;            // Lista para almacenar todos los recordatorios

    // CONSTRUCTOR DE LA CLASE
    public GestorDeRecordatorios() {
        this.recordatorios = new ArrayList<>();
    }

    // Agrega un nuevo recordatorio a la lista
    public void agregarRecordatorio(Recordatorio recordatorio) {
        if (recordatorio == null) throw new IllegalArgumentException("Recordatorio no puede ser nulo.");
        recordatorios.add(recordatorio);
    }

    // Elimina un recordatorio por su ID y devuelve true si fue eliminado
    public boolean eliminarRecordatorioPorId(String id) {
        return recordatorios.removeIf(r -> r.getIdRecordatorio().equals(id));
    }

    // Busca un recordatorio por su ID y lo devuelve si lo encuentra
    public Recordatorio buscarPorId(String id) {
        return recordatorios.stream()
                .filter(r -> r.getIdRecordatorio().equals(id))
                .findFirst()
                .orElse(null);
    }

    // Devuelve todos los recordatorios asociados a una instancia por su ID
    public List<Recordatorio> buscarPorInstancia(String idInstancia) {
        return recordatorios.stream()
                .filter(r -> r.getInstanciaAsociada().getIdInstancia().equals(idInstancia))
                .collect(Collectors.toList());
    }

    // Devuelve todos los recordatorios dentro de un rango de fechas
    public List<Recordatorio> buscarPorRangoDeFechas(LocalDateTime desde, LocalDateTime hasta) {
        return recordatorios.stream()
                .filter(r -> !r.getFechaHora().isBefore(desde) && !r.getFechaHora().isAfter(hasta))
                .collect(Collectors.toList());
    }

    // Modifica los datos de un recordatorio si existe y devuelve true si fue modificado
    public boolean modificarRecordatorio(String id, String nuevoTitulo, LocalDateTime nuevaFechaHora,
                                         TipoRecordatorio nuevoTipo, Frecuencia nuevaFrecuencia, String nuevoMensaje) {
        Recordatorio r = buscarPorId(id);
        if (r != null) {
            r.setTitulo(nuevoTitulo);
            r.setFechaHora(nuevaFechaHora);
            r.setTipo(nuevoTipo);
            r.setFrecuencia(nuevaFrecuencia);
            r.setMensaje(nuevoMensaje);
            return true;
        }
        return false;
    }

    // Muestra los próximos recordatorios ordenados por fecha y hora
    public void mostrarProximosRecordatorios() {
        System.out.println("Próximos recordatorios:");
        recordatorios.stream()
                .sorted(Comparator.comparing(Recordatorio::getFechaHora))
                .forEach(r -> {
                    String color = r.getEstadoColor(); // Asume que devuelve un String representando el estado (visual)
                    System.out.println("- [" + r.getFechaHora() + "] " + r.getTitulo()
                            + " | Instancia: " + r.getInstanciaAsociada().getIdInstancia()
                            + " | Estado: " + color);
                });
    }

    // Devuelve una copia de la lista de recordatorios para evitar modificaciones externas
    public List<Recordatorio> getRecordatorios() {
        return new ArrayList<>(recordatorios);
    }

    // METODO toString
    @Override
    public String toString() {
        return "GestorDeRecordatorios {" +
                "total='" + recordatorios.size() + " recordatorios\n" +
                '}';
    }
}
