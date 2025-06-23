package CasoEstudioUTEC;

public class Frecuencia {
    public static final String UNICO = "UNICO";                      // Frecuencia de instancia UNICO
    public static final String DIARIO = "DIARIO";                    // Frecuencia de instancia DIARIO
    public static final String SEMANAL = "SEMANAL";                  // Frecuencia de instancia SEMANAL
    public static final String MENSUAL = "MENSUAL";                  // Frecuencia de instancia MENSUAL

    // METODO PARA VALIDAR LA FRECUENCIA DE LAS INSTANCIAS
    public static boolean esValido(String frecuencia) {
        return frecuencia.equals("UNICO") || frecuencia.equals("DIARIO") || frecuencia.equals("SEMANAL") || frecuencia.equals("MENSAUL");
    }
}