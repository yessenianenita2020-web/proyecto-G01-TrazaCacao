package ec.edu.uagraria.prog.tracacao.reglas;

public enum ConfiguracionUmbrales {
    INSTANCIA;

    private double umbralHumedadMax = 75.0;
    private double umbralFermentacionMax = 7.0;

    public double getUmbralHumedadMax() {
        return umbralHumedadMax;
    }

    public void setUmbralHumedadMax(double umbralHumedadMax) {
        this.umbralHumedadMax = umbralHumedadMax;
    }

    public double getUmbralFermentacionMax() {
        return umbralFermentacionMax;
    }

    public void setUmbralFermentacionMax(double umbralFermentacionMax) {
        this.umbralFermentacionMax = umbralFermentacionMax;
    }
}
