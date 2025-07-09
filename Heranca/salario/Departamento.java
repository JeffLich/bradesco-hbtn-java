public class Departamento {
    public double valorMeta;
    public double valorAtingidoMeta;

    public Departamento(double valorMeta, double valorAtingidoMeta) {
        this.valorMeta = valorMeta;
        this.valorAtingidoMeta = valorAtingidoMeta;
    }

    public double getValorAtingidoMeta() {
        return valorAtingidoMeta;
    }

    public double getValorMeta() {
        return valorMeta;
    }

    public boolean alcancouMeta() {
        return this.valorAtingidoMeta > this.valorMeta;
    }
}
