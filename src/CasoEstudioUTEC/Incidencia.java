package CasoEstudioUTEC;

import java.time.LocalDateTime;

/**
 * Clase que representa una instancia específica de tipo incidencia dentro del sistema de seguimiento estudiantil.
 * Hereda de la clase Instancia y agrega información adicional como el tipo de incidencia, su gravedad
 * y si requiere seguimiento posterior. Este tipo de instancia se utiliza para registrar situaciones
 * relevantes relacionadas con el comportamiento o desempeño académico del estudiante.
 */
 public class Incidencia extends Instancia{

    // ATRIBUTOS PRIVADOS
    private String lugar;               // Lugar donde ocurrió la incidencia
    private String involucrado;         // Persona involucrada en la incidencia
    private String registradoPor;       // Persona que registró el evento

    // Constructor
    public Incidencia(String titulo, LocalDateTime fechaHora, String estudiante, TipoInstancia tipoInstancia, Solicitante solicitante, String lugar, String involucrado, String registradoPor) {
        super(titulo, fechaHora, estudiante, tipoInstancia, solicitante);
        this.lugar = lugar;
        this.involucrado = involucrado;
        this.registradoPor = registradoPor;
    }

    // METODOS GET Y SET
    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getInvolucrado() {
        return involucrado;
    }

    public void setInvolucrado(String involucrado) {
        this.involucrado = involucrado;
    }

    public String getRegistradoPor() {
        return registradoPor;
    }

    public void setRegistradoPor(String registradoPor) {
        this.registradoPor = registradoPor;
    }

    // METODO toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append("  Lugar: ").append(lugar).append("\n");
        sb.append("  Involucrado: ").append(involucrado).append("\n");
        sb.append("  Registrado por: ").append(registradoPor).append("\n");
        return sb.toString();
    }

}
