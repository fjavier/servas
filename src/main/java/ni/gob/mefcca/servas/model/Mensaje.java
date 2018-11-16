package ni.gob.mefcca.servas.model;

import java.io.Serializable;

public class Mensaje implements Serializable{
    private String mensaje;
    private String username;

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}