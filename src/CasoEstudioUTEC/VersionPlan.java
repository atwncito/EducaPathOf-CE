package CasoEstudioUTEC;

import java.util.Date;

public class VersionPlan {
    private String comentario;
    private String especialista;
    private Date fecha;

    public VersionPlan(String comentario, String especialista, Date fecha) {
        this.comentario = comentario;
        this.especialista = especialista;
        this.fecha = fecha;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getEspecialista() {
        return especialista;
    }

    public void setEspecialista(String especialista) {
        this.especialista = especialista;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
