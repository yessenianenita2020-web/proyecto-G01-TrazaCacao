package ec.edu.uagraria.prog.tracacao.reglas;

import ec.edu.uagraria.prog.tracacao.alertas.Alerta;
import ec.edu.uagraria.prog.tracacao.alertas.TipoAlerta;
import ec.edu.uagraria.prog.tracacao.dominio.CacaoEnGrano;
import java.time.LocalDateTime;
import java.util.Optional;

public class HumedadAltaRegla implements ReglaAlerta {
    @Override
    public Optional<Alerta> evaluar(Object objeto) {
        if (objeto instanceof CacaoEnGrano cacao) {
            double umbral = ConfiguracionUmbrales.INSTANCIA.getUmbralHumedadMax();
            if (cacao.getHumedad() > umbral) {
                return Optional.of(new Alerta(TipoAlerta.HUMEDAD_ALTA, 
                    "Alerta: Humedad alta detectada (" + cacao.getHumedad() + "%)", LocalDateTime.now()));
            }
        }
        return Optional.empty();
    }
}
