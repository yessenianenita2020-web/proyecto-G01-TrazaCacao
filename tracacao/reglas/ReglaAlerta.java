package ec.edu.uagraria.prog.tracacao.reglas;

import ec.edu.uagraria.prog.tracacao.alertas.Alerta;
import java.util.Optional;

public interface ReglaAlerta {
    Optional<Alerta> evaluar(Object objeto);
}
