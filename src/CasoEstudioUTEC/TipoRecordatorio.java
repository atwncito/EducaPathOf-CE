package CasoEstudioUTEC;

public class TipoRecordatorio {
    public static final String LLAMADA = "LLAMADA";                             // Tipo de recordatorio LLAMADA
    public static final String NUEVA_REUNION = "NUEVA_REUNION";                 // Tipo de recordatorio NUEVA_REUNION
    public static final String BRINDAR_INFORMACION = "BRINDAR_INFORMACION";     // Tipo de recordatorio BRINDAR_INFORMACION
    public static final String OTRO = "OTRO";                                   // Tipo de recordatorio OTRO

    // METODO PARA VALIDAR EL TIPO DE RECORDATORIO
    public static boolean esValido(String tipo) {
        return tipo.equals("LLAMADA") || tipo.equals("NUEVA_REUNION") || tipo.equals("BRINDAR_INFORMACION") || tipo.equals("OTRO");
    }
}