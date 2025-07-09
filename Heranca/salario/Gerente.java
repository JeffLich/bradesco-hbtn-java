public class Gerente extends Empregado {

    public Gerente(double salarioFixo) {
        super(salarioFixo);
    }

    @Override
    public double calcularBonus(Departamento departamento) {
        return  departamento.alcancouMeta() ? (salarioFixo * 0.20) +
                (departamento.valorAtingidoMeta - departamento.valorMeta) * 0.01 : 0;

    }
}
