package ec.edu.uagraria.prog.tracacao.reglas;

public class Reglas {
    public static ReglaAlerta humedadAlta() {
        return new HumedadAltaRegla();
    }

    public static ReglaAlerta fermentacionExcedida() {
        return new FermentacionExcedidaRegla();
    }

    public static ReglaAlerta loteSinQr() {
        return new LoteSinQrRegla();
    }
}
