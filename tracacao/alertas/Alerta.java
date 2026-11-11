package ec.edu.uagraria.prog.tracacao.alertas;

import java.time.LocalDateTime;

public class Alerta {
    private TipoAlerta tipo;
    private String mensaje;
    private LocalDateTime timestamp;

    public Alerta(TipoAlerta tipo, String mensaje, LocalDateTime timestamp) {
        this.tipo = tipo;
        this.mensaje = mensaje;
        this.timestamp = timestamp;
    }

    public TipoAlerta getTipo() {
        return tipo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }
}
