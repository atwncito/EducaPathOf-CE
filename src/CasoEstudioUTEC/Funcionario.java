package CasoEstudioUTEC;
import java.util.ArrayList;
import java.util.List;

enum tipoFuncionario {
    DOCENTE, ADMINISTRADOR, AUDITOR, PSICOPEDAGOGO
}

/**
 * Clase que representa a un funcionario dentro del sistema.
 * Hereda de la clase Usuario y añade atributos específicos relacionados con su rol institucional y permisos asignados.
 * Permite distinguir entre diferentes tipos de funcionarios y gestionar sus autorizaciones dentro del sistema.
 */
public class Funcionario extends Usuario {

    // ATRIBUTOS PRIVADOS
    private tipoFuncionario tipoFuncionario;                        // Tipo de funcionario (Docente, Administrador, Auditor, Psicopedagogo)
    private List<String> permisos;                                  // Lista de permisos con los que cuenta el funcionario
    private ArrayList<Instancia> instancias;                        // Lista para almacenar todas las instancias que creo el funcionario


    // CONSTRUCTOR DE LA CLASE
    public Funcionario(String nombre, String email, String contrasenia, String tipoFuncionario, List<String> permisos, ArrayList<Instancia> instancias) {
        super(nombre, email, contrasenia);
        this.tipoFuncionario = CasoEstudioUTEC.tipoFuncionario.valueOf(tipoFuncionario);
        this.permisos = permisos;
        this.instancias = instancias;
    }

    // METODOS GET Y SET
    public tipoFuncionario getTipoFuncionario() {
        return tipoFuncionario;
    }

    public void setTipoFuncionario(String tipoFuncionario) {
        this.tipoFuncionario = CasoEstudioUTEC.tipoFuncionario.valueOf(tipoFuncionario);
    }

    public List<String> getPermisos() {
        return permisos;
    }

    public void setPermisos(List<String> permisos) {
        this.permisos = permisos;
    }

    public ArrayList<Instancia> getInstancias() {
        return instancias;
    }

    public void setInstancias(ArrayList<Instancia> instancias) {
        this.instancias = instancias;
    }

    // METODO toString
    @Override
    public String toString() {
        return "Funcionario {" +
                "nombre='" + getNombre() +
                ", email='" + getEmail() + '\'' +
                ", tipoFuncionario='" + getTipoFuncionario()+ '\'' +
                ", permisos='" + getPermisos() + '\'' +
                ", instancias=" + getInstancias() +
                '}';
    }
}
