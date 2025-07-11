package produtos;

public class Dvd extends Produto {

    public String diretor;
    public String genero;
    public int duracao;

    public Dvd(String titulo, int ano, String pais, double precoBruto, String diretor, String genero, int duracao) {
        super(titulo, ano, pais, precoBruto);
        this.diretor = diretor;
        this.genero = genero;
        this.duracao = duracao;
    }

    @Override
    public double obterPrecoLiquido() {
        return this.getPrecoBruto() + (this.getPrecoBruto() * 0.20);
    }

    @Override
    public String tipo(){
        return "Dvd";
    }

    public String getDiretor() {
        return diretor;
    }


    public String getGenero() {
        return genero;
    }

    public int getDuracao() {
        return duracao;
    }

}
