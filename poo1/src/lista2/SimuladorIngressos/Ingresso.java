package lista2.SimuladorIngressos;

public abstract class Ingresso {
    protected Double valor;

    public Ingresso(Double valor) {
        this.valor = valor;
    }

    public Double getValor() {
        return valor;
    }

}
