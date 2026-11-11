package ec.edu.uagraria.prog.tracacao.reglas;

import ec.edu.uagraria.prog.tracacao.alertas.Alerta;
import ec.edu.uagraria.prog.tracacao.alertas.TipoAlerta;
import ec.edu.uagraria.prog.tracacao.dominio.CacaoEnGrano;
import java.time.LocalDateTime;
import java.util.Optional;

public class LoteSinQrRegla implements ReglaAlerta {
    @Override
    public Optional<Alerta> evaluar(Object objeto) {
        if (objeto instanceof CacaoEnGrano cacao) {
            if (!cacao.isQrValido()) {
                return Optional.of(new Alerta(TipoAlerta.LOTE_SIN_QR, 
                    "Alerta: El lote " + cacao.getCodigo() + " no cuenta con un código QR válido", LocalDateTime.now()));
            }
        }
        return Optional.empty();
    }
}
