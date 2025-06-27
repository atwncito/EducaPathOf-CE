package CasoEstudioUTEC;

public class Solicitante {
    public static final String DIRECCION_EDUCACION = "DIRECCION_EDUCACION";         // Solicitante de instancia DIRECCION_EDUCACION

    // METODO PARA VALIDAR EL SOLICITANTE DE INSTANCIA
    public static boolean esValido(String solicitante) {
        return solicitante.equals(DIRECCION_EDUCACION);
    }
}
