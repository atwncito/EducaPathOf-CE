package CasoEstudioUTEC;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

public class GestorDeRecordatorios {
    private List<Recordatorio> recordatorios;

    public GestorDeRecordatorios() {
        this.recordatorios = new ArrayList<>();
    }

    public void agregarRecordatorio(Recordatorio recordatorio) {
        if (recordatorio == null) throw new IllegalArgumentException("Recordatorio no puede ser nulo.");
        recordatorios.add(recordatorio);
    }

    public boolean eliminarRecordatorioPorId(String id) {
        return recordatorios.removeIf(r -> r.getId().equals(id));
    }

    public Recordatorio buscarPorId(String id) {
        return recordatorios.stream()
                .filter(r -> r.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public List<Recordatorio> buscarPorInstancia(String idInstancia) {
        return recordatorios.stream()
                .filter(r -> r.getInstanciaAsociada().getId().equals(idInstancia))
                .collect(Collectors.toList());
    }

    public List<Recordatorio> buscarPorRangoDeFechas(LocalDateTime desde, LocalDateTime hasta) {
        return recordatorios.stream()
                .filter(r -> !r.getFechaHora().isBefore(desde) && !r.getFechaHora().isAfter(hasta))
                .collect(Collectors.toList());
    }

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

    public void mostrarProximosRecordatorios() {
        System.out.println("Próximos recordatorios:");
        recordatorios.stream()
                .sorted(Comparator.comparing(Recordatorio::getFechaHora))
                .forEach(r -> {
                    String color = r.getEstadoColor();
                    System.out.println("- [" + r.getFechaHora() + "] " + r.getTitulo()
                            + " | Instancia: " + r.getInstanciaAsociada().getId()
                            + " | Estado: " + color);
                });
    }

    public List<Recordatorio> getRecordatorios() {
        return new ArrayList<>(recordatorios);
    }
}
