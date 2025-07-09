public class Empregado {
    public double salarioFixo;

    public Empregado(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }

    public double calcularBonus(Departamento departamento) {
        return departamento.alcancouMeta() ? (salarioFixo * 0.10) : 0;
    }

    public double calcularSalarioTotal(Departamento departamento){
        return this.salarioFixo + calcularBonus(departamento);
    }
}
