package ec.edu.uagraria.prog.tracacao.dominio;

public class LoteFermentacion {
    private String codigo;
    private double diasFermentacion;

    public LoteFermentacion(String codigo, double diasFermentacion) {
        this.codigo = codigo;
        this.diasFermentacion = diasFermentacion;
    }

    public String getCodigo() { return codigo; }
    public double getDiasFermentacion() { return diasFermentacion; }
}
