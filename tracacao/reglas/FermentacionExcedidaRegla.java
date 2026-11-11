package ec.edu.uagraria.prog.tracacao.reglas;

import ec.edu.uagraria.prog.tracacao.alertas.Alerta;
import ec.edu.uagraria.prog.tracacao.alertas.TipoAlerta;
import ec.edu.uagraria.prog.tracacao.dominio.LoteFermentacion;
import java.time.LocalDateTime;
import java.util.Optional;

public class FermentacionExcedidaRegla implements ReglaAlerta {
    @Override
    public Optional<Alerta> evaluar(Object objeto) {
        if (objeto instanceof LoteFermentacion lote) {
            double umbralMax = ConfiguracionUmbrales.INSTANCIA.getUmbralFermentacionMax();
            if (lote.getDiasFermentacion() > umbralMax) {
                return Optional.of(new Alerta(TipoAlerta.FERMENTACION_EXCEDIDA, 
                    "Alerta: Días de fermentación excedidos (" + lote.getDiasFermentacion() + " días)", LocalDateTime.now()));
            }
        }
        return Optional.empty();
    }
}
