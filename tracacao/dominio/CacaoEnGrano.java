package ec.edu.uagraria.prog.tracacao.dominio;

public class CacaoEnGrano {
    private String codigo;
    private double humedad;
    private boolean qrValido;

    public CacaoEnGrano(String codigo, double humedad, boolean qrValido) {
        this.codigo = codigo;
        this.humedad = humedad;
        this.qrValido = qrValido;
    }

    public String getCodigo() { return codigo; }
    public double getHumedad() { return humedad; }
    public boolean isQrValido() { return qrValido; }
}
