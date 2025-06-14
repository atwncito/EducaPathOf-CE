package CasoEstudioUTEC;

public class TipoInstancia {
   public static final String REUNION = "REUNION";                          // Tipo de instancia REUNION
   public static final String LLAMADA = "LLAMADA";                          // Tipo de instancia LLAMADA
   public static final String PEDIDO_INFORME = "PEDIDO_INFORME";            // Tipo de instancia PEDIDO_INFORME
   public static final String COORDINACION = "COORDINACION";                // Tipo de instancia COORDINACION
   public static final String EVENTO_INFORMAL = "EVENTO_INFORMAL";          // Tipo de instancia EVENTO_INFORMAL

    // METODO PARA VALIDAR EL TIPO DE INSTANCIA
    public static boolean esValido(String tipo) {
        return tipo.equals("REUNION") || tipo.equals("LLAMADA") || tipo.equals("PEDIDO_INFORME") || tipo.equals("COORDINACION") || tipo.equals("EVENTO_INFORMAL");
    }
}
